package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class formCliente extends AppCompatActivity {
    private EditText nombreCliente,apellidoP,apellidoM,correo;
    private Button boton_registrar;
    validacionesClientes objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_cliente);

        nombreCliente = (EditText) findViewById(R.id.nombreCliente);
        apellidoP = (EditText) findViewById(R.id.apellidoP);
        apellidoM = (EditText) findViewById(R.id.apellidoM);
        correo = (EditText) findViewById(R.id.correo);
        objCliente = new validacionesClientes();
        boton_registrar =(Button)findViewById(R.id.boton_registrar);



        boton_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registrarDatos();
            }
        });



    }

    public void registrarDatos(){

        String name = nombreCliente.getText().toString();
        String apell = apellidoP.getText().toString();
        String apellM = apellidoM.getText().toString();
        String cor = correo.getText().toString();

        if (!objCliente.validarNombreCliente(nombreCliente)) {

        }
        if (!objCliente.validarApellidoP(apellidoP)) {


        }
        if (!objCliente.validarApellidoM(apellidoM)) {


        }
        if (!objCliente.validarCorreo(correo)) {


        } else if (objCliente.validarNombreCliente(nombreCliente) && objCliente.validarApellidoP(apellidoP)
                && objCliente.validarApellidoM(apellidoM) && (objCliente.validarCorreo(correo))) {


            Intent intent = new Intent(getApplicationContext(), datosCliente.class);
            intent.putExtra("nombre", name);
            intent.putExtra("apellidoP", apell);
            intent.putExtra("apellidoM", apellM);
            intent.putExtra("correo", cor);

            startActivity(intent);

        }
    }

   /* public void mostrarDatos(){
        Bundle data = getIntent().getExtras();
        String s = data.getString("name");
        textView.setText("Hola " + s );
        //System.out.println(s);


    }*/


}