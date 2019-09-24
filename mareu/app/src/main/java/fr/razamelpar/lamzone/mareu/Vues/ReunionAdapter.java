package fr.razamelpar.lamzone.mareu.Vues;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;

import static fr.razamelpar.lamzone.mareu.R.id.txtReunionName;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionAdapter extends RecyclerView.Adapter<ReunionAdapter.ReunionViewHolder> {

    List<Reunion> reunionList;

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
    public void onBindViewHolder(ReunionViewHolder holder, int position) {
        holder.display(reunionList.get(position));
    }

    @Override
    public int getItemCount() {
        return reunionList.size();
    }

    public class ReunionViewHolder extends RecyclerView.ViewHolder{

        private TextView txtReunionName;
        private TextView txtReunionSalle;
        private TextView txtReunionDate;
        private TextView txtReunionSujet;
        private TextView txtReunionParticipants;

        public ReunionViewHolder(View itemView) {
            super(itemView);
            txtReunionName = (TextView)itemView.findViewById(R.id.txtReunionName);
            txtReunionSalle = (TextView)itemView.findViewById(R.id.txtReunionSalle);
            txtReunionDate = (TextView)itemView.findViewById(R.id.txtReunionDate);
            txtReunionSujet = (TextView)itemView.findViewById(R.id.txtReunionSujet);
            txtReunionParticipants = (TextView)itemView.findViewById(R.id.txtReunionParticipants);
        }
        void  display(Reunion reunion) {

            txtReunionName.setText(reunion.getNomReunion());
            txtReunionSalle.setText(reunion.getNumeroSalle());
            txtReunionDate.setText(reunion.getDateReunion());
            txtReunionSujet.setText(reunion.getSujetReunion());
            txtReunionParticipants.setText(reunion.getParticipantsReunion());;
        }


    }
}
