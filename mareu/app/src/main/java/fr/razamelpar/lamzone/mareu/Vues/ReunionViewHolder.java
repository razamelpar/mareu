package fr.razamelpar.lamzone.mareu.Vues;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.razamelpar.lamzone.mareu.R;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 16/10/2019.
 */

public class ReunionViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txtSujetReunion)
    public TextView txtSujetReunion;
    @BindView(R.id.txtReunionSalle)
    public TextView txtReunionSalle;
    @BindView(R.id.txtReunionHoraire)
    public TextView txtReunionHoraire;
    @BindView(R.id.txtReunionParticipants)
    public TextView txtReunionParticipants;
    @BindView(R.id.btnDelete)
    public ImageButton mDeleteButton;
    public ReunionViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}


