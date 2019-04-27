package bo.nuevo.cafeteriacoconut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleItem extends AppCompatActivity {

    private Entidad Item;
    private TextView tvTitulo,tvDescripcion;
    private ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detalle);

        Item = (Entidad) getIntent().getSerializableExtra("objetoData");

        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        tvTitulo.setText(Item.getTitulo());
        imgFoto.setImageResource(Item.getImgFoto());
        tvDescripcion.setText(Item.getContenido());

    }
}
