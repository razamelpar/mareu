package fr.razamelpar.lamzone.mareu.Vues;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import fr.razamelpar.lamzone.mareu.DI.DI;
import fr.razamelpar.lamzone.mareu.Events.AddNewReunionEvent;
import fr.razamelpar.lamzone.mareu.Modeles.Reunion;
import fr.razamelpar.lamzone.mareu.Modeles.ReunionRoom;
import fr.razamelpar.lamzone.mareu.R;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton btnReunion;
    private RecyclerViewFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReunion = findViewById(R.id.btnReunion);

        FragmentManager fragmentManager = getSupportFragmentManager();
        mFragment = (RecyclerViewFragment) fragmentManager.findFragmentById(R.id.fragment);

        btnReunion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReunionActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
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
                DI.getReunionApiServices().triDateReunionCroissant();
                mFragment.updateList();
                return  true;
            case R.id.dateDecroissant:
                DI.getReunionApiServices().triDateReunionDecroissant();
                mFragment.updateList();
                return  true;
            case R.id.salleCroissant:
                DI.getReunionApiServices().triSalleReunionCroissant();
                mFragment.updateList();
                return  true;
            case R.id.salleDecroissant:
                DI.getReunionApiServices().triSalleReunionDecroissant();
                mFragment.updateList();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
