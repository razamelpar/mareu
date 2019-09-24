package fr.razamelpar.lamzone.mareu.Vues;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Reunion> mReunionList;
    private ReunionAdapter mReunionAdapter;
    private FloatingActionButton btnReunion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReunion = findViewById(R.id.btnReunion);
        btnReunion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReunionActivity.class);
                startActivity(intent);

            }
        });

        mRecyclerView = (RecyclerView)findViewById(R.id.mRecyclerView);


        // charger liste fake reunion
        mReunionList = DI.getReunionApiServices().getReunions();


        mReunionAdapter = new ReunionAdapter(mReunionList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setAdapter(mReunionAdapter);

    }

}
