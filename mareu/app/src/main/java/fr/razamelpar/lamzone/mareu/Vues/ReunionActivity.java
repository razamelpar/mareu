package fr.razamelpar.lamzone.mareu.Vues;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Locale;

import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;
import fr.razamelpar.lamzone.mareu.R;

public class ReunionActivity extends AppCompatActivity {

    Button btnDate;
    Button btnHoraire;
    Button btnSalle;
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

    ReunionRoom roomListe;

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
                txtDate.setText(jour + "/" + (mois +1 ) + "/" + annee);

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
                txtHoraire.setText(heures + ":" + minutes);

            }
        };
        /**
         * TODO a verfifier
         */
        String dateComparable = txtDate + "-" + txtHoraire;

        /**
         *  dialgue selecteur de salle
         */
        btnSalle = findViewById(R.id.btnSalle);
        txtSalle = findViewById(R.id.txtSalle);


        btnSalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReunionActivity.this);
                builder.setTitle("Choisir une salle.");
                final String[] listeSalle = {"Bowser","Luigi","Mario","Peach","Toad","Yoshi","Wario","Donkey Kong","Diddy Kong","Daisy"};
                int choiceItem = 0;
                builder.setSingleChoiceItems(listeSalle, choiceItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        txtSalle.setText(listeSalle[which]);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        /**
         *  dialogue selecteur de participants
         */
        btnParticipants = findViewById(R.id.btnParticipants);
        txtParticipants = findViewById(R.id.txtParticipants);


        /**
         * boutton de sauvegarde
         */

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
