package ingvictorgarcia.tarea_mascotas;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class mascotas extends AppCompatActivity {

    ArrayList<Crear_mascotas> Crear_mascota;
    private RecyclerView listamascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);

        listamascotas = (RecyclerView) findViewById(R.id.Rmascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listamascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializaAdaptador();
    }


    public void inicializaAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(Crear_mascota);
        listamascotas.setAdapter(adaptador);

    }

    public void inicializarListaContactos(){
        Crear_mascota = new ArrayList<Crear_mascotas>();

        Crear_mascota.add(new Crear_mascotas(R.drawable.beagle,"beagle",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.frances,"frances",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.pincher,"pincher",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.pug,"pug",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.sanbernardo,"sanbernardo",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.rotwailler,"rotwailler",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.labrador,"labrador",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.siberiano,"siberiano",R.drawable.huesolike,R.drawable.huesoamarillo));
        Crear_mascota.add(new Crear_mascotas(R.drawable.bulldog,"bulldog",R.drawable.huesolike,R.drawable.huesoamarillo));

        }

    public void irDetallemascota(View v){
        Intent intent = new Intent(this, Detalle_mascotas.class);
        startActivity(intent);
    }

}
