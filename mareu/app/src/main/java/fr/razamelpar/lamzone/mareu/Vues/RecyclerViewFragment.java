package fr.razamelpar.lamzone.mareu.Vues;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Services.DummyReunionGenerator;
import fr.razamelpar.lamzone.mareu.Services.ReunionApiServices;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    @BindView(R.id.mRecyclerView) RecyclerView mRecyclerView;

    private List<Reunion> mReunionList;
    private ReunionAdapter mReunionAdapter;
    private ReunionApiServices mApiServices;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApiServices = DI.getReunionApiServices();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container,false);
        ButterKnife.bind(this,view);
        configureRecyclerView();

        return view;
    }

    private void configureRecyclerView() {

        initList();

        mRecyclerView.setAdapter(new ReunionAdapter(mReunionList));

        mReunionAdapter = new ReunionAdapter(mReunionList);

        mRecyclerView.setAdapter(mReunionAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    public void initList(){
        mReunionList = mApiServices.getReunions();
    }

    @Override
    public void onStart() {
        super.onStart();
        initList();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.dateCroissant:
                DI.getReunionApiServices().triDateReunionCroissant(DummyReunionGenerator.FAKE_REUNION);
                //Toast.makeText(this, "tri croissant date",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.dateDecroissant:
                DI.getReunionApiServices().triDateReunionDecroissant(DummyReunionGenerator.FAKE_REUNION);
                //Toast.makeText(this, "tri decroissant date",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.salleCroissant:
                DI.getReunionApiServices().triSalleReunionCroissant(DummyReunionGenerator.FAKE_REUNION);
                DI.getReunionApiServices().getReunions();
                mReunionAdapter.notifyDataSetChanged();
                //Toast.makeText(this, "tri croissant salle",Toast.LENGTH_LONG).show();
                return  true;
            case R.id.salleDecroissant:
                DI.getReunionApiServices().triSalleReunionDecroissant(DummyReunionGenerator.FAKE_REUNION);
                DI.getReunionApiServices().getReunions();
                //Toast.makeText(this, "tri decroissant salle",Toast.LENGTH_LONG).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
