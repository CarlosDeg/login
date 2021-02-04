package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     public EditText nombre,usuario,pass;
     Button   guardar;
     validaciones objUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombre);
        usuario = (EditText)findViewById(R.id.usuario);
        pass = (EditText)findViewById(R.id.pass);
        guardar = (Button)findViewById(R.id.guardar);
        objUsuario = new validaciones();
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarForm();
            }
        });

    }

    public void validarForm(){
        String name = nombre.getText().toString().trim();
        String us = usuario.getText().toString().trim();
        String passwo = pass.getText().toString().trim();

        if(!objUsuario.validarNombre(nombre)){

        }if(!objUsuario.validarUser(usuario)){


        }if(!objUsuario.validarPass(pass)) {


        }else if (objUsuario.validarNombre(nombre) && objUsuario.validarUser(usuario) && objUsuario.validarPass(pass)){

            Intent intent = new Intent (getApplicationContext(),segundaA.class);
            String names = nombre.getText().toString();
            intent.putExtra("name",names);
            startActivity(intent);
            nombre.setText("");
            usuario.setText("");
            pass.setText("");
        }
    }
}