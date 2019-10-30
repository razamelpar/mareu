package fr.razamelpar.lamzone.mareu.Vues;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

import fr.razamelpar.lamzone.mareu.Events.AddNewReunionEvent;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;
import fr.razamelpar.lamzone.mareu.R;

public class ReunionActivity extends AppCompatActivity {

    EditText txtSujet;
    Button btnDate;
    Button btnHoraire;
    Spinner spinnerSalle;
    Button btnParticipants;
    TextView txtDate;
    TextView txtHoraire;
    TextView txtSalle;
    TextView txtParticipants;
    DatePickerDialog.OnDateSetListener mDatePickerDialog;
    TimePickerDialog.OnTimeSetListener mTimePickerDialog;
    Calendar calendrier;
    int jour;
    int mois;
    int annee;
    int heures;
    int minutes;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reunion);

        Locale.setDefault(Locale.FRANCE);

        btnDate = findViewById(R.id.btnDate);
        txtDate = findViewById(R.id.txtDate);

        calendrier = Calendar.getInstance();

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jour = calendrier.get(Calendar.DAY_OF_MONTH);
                mois = calendrier.get(Calendar.MONTH);
                annee = calendrier.get(Calendar.YEAR);

                DatePickerDialog dialogDate = new DatePickerDialog(
                        ReunionActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatePickerDialog,
                        jour,
                        mois,
                        annee);

                dialogDate.getDatePicker().setMinDate(System.currentTimeMillis());
                dialogDate.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialogDate.show();
            }
        });
        mDatePickerDialog = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int annee, int mois, int jour) {
                String nJour = String.valueOf(jour);
                String nMois = String.valueOf(mois + 1);
                if (jour < 10) {
                    nJour = "0" + jour;
                }

                if (mois < 10) {
                    nMois = "0" + mois;
                }

                txtDate.setText(nJour + "/" + nMois + "/" + annee);

            }
        };

        btnHoraire = findViewById(R.id.btnHoraire);
        txtHoraire = findViewById(R.id.txtHoraire);

        btnHoraire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heures = calendrier.get(Calendar.HOUR);
                minutes = calendrier.get(Calendar.MINUTE);

                TimePickerDialog dialogTime = new TimePickerDialog(
                        ReunionActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mTimePickerDialog,
                        heures,
                        minutes,
                        true);

                dialogTime.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialogTime.show();
            }
        });
        mTimePickerDialog = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int heures, int minutes) {
                if(heures < 10 ){
                    txtHoraire.setText("0" + heures + ":" + minutes);
                }
                else txtHoraire.setText(heures + ":" + minutes);

            }
        };
        /**
         * TODO a verfifier
         */
        String dateComparable = txtDate + "-" + txtHoraire;

        /**
         *  spinner selecteur de salle
         */
        txtSalle = findViewById(R.id.txtSalle);
        spinnerSalle = findViewById(R.id.spinnerSalle);
        final ReunionRoom[] reunionRooms = ReunionRoom.values();
        spinnerSalle.setAdapter(new ArrayAdapter<ReunionRoom>(this,
                R.layout.support_simple_spinner_dropdown_item,
                reunionRooms));
        spinnerSalle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtSalle.setText(reunionRooms[position].getName());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtSalle.setText("Choisir une salle");
            }
        });

        /**
         *  dialogue selecteur de participants
         */
        btnParticipants = findViewById(R.id.btnParticipants);
        txtParticipants = findViewById(R.id.txtParticipants);

        final String[] listeParticipants = getResources().getStringArray(R.array.participants);
        final boolean[] isChecked = new boolean[listeParticipants.length];
        Arrays.fill(isChecked, false);

        btnParticipants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReunionActivity.this);
                builder.setTitle(R.string.title);
                builder.setMultiChoiceItems(listeParticipants, isChecked , new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });
                builder.setPositiveButton("Valider", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (int i = 0; i < listeParticipants.length; i++){
                            boolean checked = isChecked[i];
                            if(checked) {
                                txtParticipants.setText(txtParticipants.getText() + listeParticipants[i] + ", ");
                            }
                        }
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        /**
         * boutton de sauvegarde
         */

        txtSujet = findViewById(R.id.txtSujet);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("sujet", txtSujet.toString());
                intent.putExtra("room", ReunionRoom.getRoom(txtSalle.toString()));
                intent.putExtra("date", txtDate.toString());
                intent.putExtra("horaire", txtHoraire.toString());
                intent.putExtra("participants",txtParticipants.toString());

                startActivity(intent);
            }
        });

    }
}
