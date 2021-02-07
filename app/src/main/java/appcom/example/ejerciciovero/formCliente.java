package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class segundaA extends AppCompatActivity {
    private TextView textView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda);

        textView = (TextView) findViewById(R.id.name2);
        mostrarDatos();

    }


    public void mostrarDatos(){
        Bundle data = getIntent().getExtras();
        String s = data.getString("name");
        textView.setText("Hola " + s );
        //System.out.println(s);


    }


}