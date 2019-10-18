package fr.razamelpar.lamzone.mareu.Vues;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Services.ReunionApiServices;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 16/10/2019.
 */

public class ReunionViewHolder extends RecyclerView.ViewHolder{

    ReunionApiServices mApiServices;

    TextView txtReunionName;
    TextView txtReunionSalle;
    TextView txtReunionHoraire;
    TextView txtReunionSujet;
    TextView txtReunionParticipants;
    ImageButton mDeleteButton;

    public ReunionViewHolder(View itemView) {
        super(itemView);
        txtReunionName = (TextView)itemView.findViewById(R.id.txtReunionName);
        txtReunionSalle = (TextView)itemView.findViewById(R.id.txtReunionSalle);
        txtReunionHoraire = (TextView)itemView.findViewById(R.id.txtReunionHoraire);
        txtReunionSujet = (TextView)itemView.findViewById(R.id.txtReunionSujet);
        txtReunionParticipants = (TextView)itemView.findViewById(R.id.txtReunionParticipants);
        mDeleteButton = (ImageButton) itemView.findViewById(R.id.btnDelete);


        }
        public void  display(final Reunion reunion) {

            txtReunionName.setText(reunion.getNomReunion());
            txtReunionSalle.setText(reunion.getNumeroSalle().getName());
            txtReunionHoraire.setText(reunion.getHoraireReunion());
            txtReunionSujet.setText(reunion.getSujetReunion());
            txtReunionParticipants.setText(reunion.getParticipantsReunion());

            //TODO
            // plantage
            mDeleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mApiServices.deleteReunion(reunion);
                }
            });
        }

}
