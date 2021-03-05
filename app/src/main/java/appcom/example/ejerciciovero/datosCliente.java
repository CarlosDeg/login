package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class datosCliente extends AppCompatActivity {
    private EditText a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_cliente);

        a = (EditText) findViewById(R.id.uno);
        b = (EditText) findViewById(R.id.dos);
        c = (EditText) findViewById(R.id.tres);
        d = (EditText) findViewById(R.id.cuatro);
        mostrarDatos();
    }


    public void mostrarDatos() {
        Bundle data = getIntent().getExtras();

        String as = data.getString("nombre");
        String bs = data.getString("apellidoP");
        String cs = data.getString("apellidoM");
        String ds = data.getString("correo");
        a.setText("" + as);
        b.setText("" + bs);
        c.setText("" + cs);
        d.setText("" + ds);

    }
}