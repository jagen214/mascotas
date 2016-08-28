package ingvictorgarcia.tarea_mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Detalle_mascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void irRegreso(View v){
        Intent intent = new Intent(this, mascotas.class);
        startActivity(intent);
    }

}


