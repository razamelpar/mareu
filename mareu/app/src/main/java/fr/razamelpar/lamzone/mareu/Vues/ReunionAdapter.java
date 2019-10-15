package fr.razamelpar.lamzone.mareu.Vues;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Services.ReunionApiServices;


/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionAdapter extends RecyclerView.Adapter<ReunionAdapter.ReunionViewHolder> {

    List<Reunion> reunionList;
    ReunionApiServices mApiServices;

    ReunionAdapter(List<Reunion> reunionList) {

        this.reunionList = reunionList;
    }

    @Override
    public ReunionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.reunion_item, parent, false);
        return new ReunionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ReunionViewHolder holder, final int position) {
        holder.display(reunionList.get(position));

    }

    @Override
    public int getItemCount() {

        return reunionList.size();
    }

    public class ReunionViewHolder extends RecyclerView.ViewHolder{

             TextView txtReunionName;
             TextView txtReunionSalle;
             TextView txtReunionHoraire;
             TextView txtReunionSujet;
             TextView txtReunionParticipants;
             ImageButton btnDelete;

        public ReunionViewHolder(View itemView) {
            super(itemView);
            txtReunionName = (TextView)itemView.findViewById(R.id.txtReunionName);
            txtReunionSalle = (TextView)itemView.findViewById(R.id.txtReunionSalle);
            txtReunionHoraire = (TextView)itemView.findViewById(R.id.txtReunionHoraire);
            txtReunionSujet = (TextView)itemView.findViewById(R.id.txtReunionSujet);
            txtReunionParticipants = (TextView)itemView.findViewById(R.id.txtReunionParticipants);
            btnDelete = (ImageButton) itemView.findViewById(R.id.btnDelete);


        }
        public void  display(final Reunion reunion) {

            txtReunionName.setText(reunion.getNomReunion());
            txtReunionSalle.setText(reunion.getNumeroSalle());
            txtReunionHoraire.setText(reunion.getHoraireReunion());
            txtReunionSujet.setText(reunion.getSujetReunion());
            txtReunionParticipants.setText(reunion.getParticipantsReunion());
            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /* TODO
                     *   finir suppression item
                     */
                    mApiServices.deleteReunion(reunion);

                }
            });
        }

    }

}
