package fr.razamelpar.lamzone.mareu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Reunion> mReunionList;
    private ReunionAdapter mReunionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.mRecyclerView);

        mReunionList = new ArrayList<>();

        mReunionList.add(new Reunion("reunion test","11","12-12-2019","blabla du jour","machin@truc.fr"));
        mReunionList.add(new Reunion("reunion test 2","34","12-15-2019","blabla du jour","machin@truc.fr"));
        mReunionList.add(new Reunion("reunion test 3","21","12-32-2019","blabla du jour","machin@truc.fr"));
        mReunionList.add(new Reunion("reunion test 4","8","12-64-2019","blabla du jour","machin@truc.fr"));
        mReunionList.add(new Reunion("reunion test 5","24","12-58-2019","blabla du jour","machin@truc.fr"));

        mReunionAdapter = new ReunionAdapter(mReunionList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setAdapter(mReunionAdapter);
    }
}
