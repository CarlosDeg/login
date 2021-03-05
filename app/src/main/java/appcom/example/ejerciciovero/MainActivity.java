package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText nombre, usuario, pass;
    Button guardar;
    validaciones objUsuario;
    usuario objUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        usuario = (EditText) findViewById(R.id.usuario);
        pass = (EditText) findViewById(R.id.pass);
        guardar = (Button) findViewById(R.id.guardar);
        objUsuario = new validaciones();
        objUsuarios = new usuario();
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarForm();
            }
        });
    }

    public void validarForm() {
        String name = nombre.getText().toString().trim();
        String us = usuario.getText().toString().trim();
        String passwo = pass.getText().toString().trim();

        if (!objUsuario.validarNombre(nombre)) {

        }
        if (!objUsuario.validarUser(usuario)) {


        }
        if (!objUsuario.validarPass(pass)) {


        } else if (objUsuario.validarNombre(nombre) && objUsuario.validarUser(usuario) && objUsuario.validarPass(pass) && (objUsuarios.validarUsuario(usuario, pass))) {


            Intent intent = new Intent(getApplicationContext(), formCliente.class);

            startActivity(intent);
            nombre.setText("");
            usuario.setText("");
            pass.setText("");
        }
    }


}