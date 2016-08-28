package ingvictorgarcia.tarea_mascotas;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by victor on 25/08/2016.
 */
public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {
    ArrayList<Crear_mascotas> Crear_mascota;

    public ContactoAdaptador(ArrayList<Crear_mascotas> Crear_mascota) {
        this.Crear_mascota = Crear_mascota;

    }


    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {
        final Crear_mascotas contacto = Crear_mascota.get(position);
        contactoViewHolder.Ifotoperro.setImageResource(contacto.getFoto());
        contactoViewHolder.TVnombrePerro.setText(contacto.getNombre());
        contactoViewHolder.Ihuesoamarillo.setImageResource(contacto.getLogo());
    }

    @Override
    public int getItemCount() {
        return Crear_mascota.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder {

        private ImageView Ifotoperro;
        private TextView TVnombrePerro;
        private ImageView Ihuesoamarillo;
        private ImageView Blike;

        public ContactoViewHolder(View itemView) {
            super(itemView);
            Ifotoperro = (ImageView) itemView.findViewById(R.id.Ifotoperro);
            TVnombrePerro = (TextView) itemView.findViewById(R.id.TVnombrePerro);
            Ihuesoamarillo = (ImageView) itemView.findViewById(R.id.Ihuesoamarillo);
            Blike = (ImageView) itemView.findViewById(R.id.Blike);

        }
    }

}


