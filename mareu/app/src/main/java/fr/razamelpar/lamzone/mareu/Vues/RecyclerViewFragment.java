package fr.razamelpar.lamzone.mareu.Vues;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Events.AddNewReunionEvent;
import fr.razamelpar.lamzone.mareu.Events.DeleteReunionEvent;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;
import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Services.ReunionApiServices;



/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    @BindView(R.id.mRecyclerView)
    public RecyclerView mRecyclerView;

    public List<Reunion> mReunionList;
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
        EventBus.getDefault().register(this);

        initList();
    }


    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    public void updateList() {

        mReunionList = mApiServices.getReunions();
        mReunionAdapter.notifyDataSetChanged();
    }

    @Subscribe
    public void onDeleteReunion(DeleteReunionEvent event){
        mApiServices.deleteReunion(event.reunion);
        configureRecyclerView();
    }

    @Subscribe
    public void onAddNewReunion(AddNewReunionEvent event){
        mApiServices.addReunion(event.reunion);
        configureRecyclerView();
    }


}
