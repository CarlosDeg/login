package appcom.example.ejerciciovero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
     EditText nombre,usuario,pass;
     Button   guardar;
    public static final String REGEX_LETERS = "([a-z A-Z]{5,9}+[ ]?){1}$";
    public static final String REGEX_USER = "^[A-Za-z]{5}([A-Za-z]{2}|[0-9]{2}|[A-Za-z][0-9])([0-9]{4}){1}";
    public static final String REGEX_PASS ="^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$";//8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombre);
        usuario = (EditText)findViewById(R.id.usuario);
        pass = (EditText)findViewById(R.id.pass);
        guardar = (Button)findViewById(R.id.guardar);


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarForm();
            }
        });

    }


    public boolean  validarNombre(){

        Pattern patron = Pattern.compile(REGEX_LETERS);
        String valNom = nombre.getText().toString().trim();

        if (valNom.isEmpty()){

           // Toast.makeText(this, "campo vacio", Toast.LENGTH_SHORT).show();
            return false;
        }else if(!patron.matcher(valNom).matches()){
            nombre.setError("datos no validos");
            return false;
            //Toast.makeText(this, "Validación incorrecta", Toast.LENGTH_SHORT).show();

        }else {
            //Toast.makeText(this, "Validación correcta", Toast.LENGTH_SHORT).show();
            return true;
        }




    }

    public boolean validarUser(){




        Pattern patronUser = Pattern.compile(REGEX_USER);
        String valUser = usuario.getText().toString().trim();
        if (valUser.isEmpty()){

            //usuario.setError("campo vacio");
            return false;
        }else if(!patronUser.matcher(valUser).matches()){


            usuario.setError("Validación incorrecta");
            return false;
        } else{
           //  usuario.setError("validacion correcta");
            return true;
        }


    }


    public boolean validarPass(){

        Pattern patronPass = Pattern.compile(REGEX_PASS);
        String valPass = pass.getText().toString().trim();

        if (valPass.isEmpty()){

            return false;
        }else if(!patronPass.matcher(valPass).matches()) {
            pass.setError("validacion incorrecta");
            return false;
        } else{

            return true;
        }


    }

    public void validarForm(){

        if (!validarNombre()){
            nombre.setError("campo vacio");
        }if (!validarUser()){

            usuario.setError("campo vacio");
        }if (!validarPass()){
            pass.setError("campo vacio");
        }

        if (validarNombre() && validarUser() && validarPass()){

            Intent intent = new Intent (getApplicationContext(),segundaA.class);
            String name = nombre.getText().toString();
            intent.putExtra("name",name);
            startActivity(intent);
        }




    }





}