package fr.razamelpar.lamzone.mareu.Vues;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import fr.razamelpar.lamzone.mareu.Events.DeleteReunionEvent;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;


/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionAdapter extends RecyclerView.Adapter<ReunionViewHolder> {

    private final List<Reunion> reunionList;

    public  ReunionAdapter(List<Reunion> items) {

        reunionList = items;
    }

    @Override
    public ReunionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.reunion_item, parent, false);
        return new ReunionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ReunionViewHolder viewHolder, int position) {
        final Reunion reunion = reunionList.get(position);
        viewHolder.txtSujetReunion.setText(reunion.getSujetReunion());
        viewHolder.txtReunionSalle.setText(reunion.getNumeroSalle().getName());
        viewHolder.txtReunionHoraire.setText(reunion.getDateReunion() + " " +reunion.getHoraireReunion());
        viewHolder.txtReunionParticipants.setText(reunion.getParticipantsReunion());

        viewHolder.mDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new DeleteReunionEvent(reunion));
            }
        });
    }


    @Override
    public int getItemCount() {

        return reunionList.size();
    }

}
