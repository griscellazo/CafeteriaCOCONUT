package bo.nuevo.cafeteriacoconut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems = (ListView)findViewById(R.id.wrap);
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);

        /*lvItems.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,lond id){
           Intent intent = new Intent (MainActivity.this, DetalleItem.class);
           intent.putExtra("objetoData",arrayentidad.get(position));
           startActivity(intent);

            }
        });*/
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.bomba_de_fruta,"Bomba de Fruta", "Precio: 10 Bs"));
        listItems.add(new Entidad(R.drawable.hojaldre_de_azucar,"Hojaldre de azucar", "Precio: 15 Bs"));
        listItems.add(new Entidad(R.drawable.hojaldre_de_frutas_del_bosque,"Bomba de Fruta", "Precio: 5 Bs"));

        return listItems;
    }
    }

