package fr.razamelpar.lamzone.mareu.Vues;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;


/**
 * Created by Alexandre Vanneçon "Razamelpar" on 23/09/2019.
 */
public class ReunionAdapter extends RecyclerView.Adapter<ReunionViewHolder> {

    List<Reunion> reunionList;

    ReunionAdapter(List<Reunion> reunionList) {

        this.reunionList = reunionList;
    }

    @Override
    public ReunionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.reunion_item, parent, false);
        return new ReunionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ReunionViewHolder viewHolder, final int position) {
        viewHolder.display(this.reunionList.get(position));

        //viewHolder.mDeleteButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        reunionList.remove(position);
        //    }
        //});
    }

    @Override
    public int getItemCount() {

        return this.reunionList.size();
    }

}
