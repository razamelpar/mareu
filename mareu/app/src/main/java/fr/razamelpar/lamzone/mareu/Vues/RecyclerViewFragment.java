package fr.razamelpar.lamzone.mareu.Vues;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    @BindView(R.id.mRecyclerView) RecyclerView mRecyclerView;

    private List<Reunion> mReunionList;
    private ReunionAdapter mReunionAdapter;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container,false);
        ButterKnife.bind(this,view);
        this.configureRecyclerView();

        return view;
    }

    private void configureRecyclerView() {

        this.mReunionList = DI.getReunionApiServices().getReunions();

        this.mReunionAdapter = new ReunionAdapter(mReunionList);

        this.mRecyclerView.setAdapter(this.mReunionAdapter);

        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

}
