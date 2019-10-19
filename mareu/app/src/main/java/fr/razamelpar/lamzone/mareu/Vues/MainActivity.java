package fr.razamelpar.lamzone.mareu.Vues;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.R;
import fr.razamelpar.lamzone.mareu.Services.DummyReunionGenerator;

public class MainActivity extends AppCompatActivity {

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


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
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
