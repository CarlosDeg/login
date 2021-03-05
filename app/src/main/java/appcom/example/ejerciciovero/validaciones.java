package appcom.example.ejerciciovero;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;

import java.util.regex.Pattern;

public class validaciones {


    public static final String REGEX_LETERS = "([a-z A-Z]{5,9}+[ ]?){1}$";
    public static final String REGEX_USER = "^[A-Za-z]{5}([A-Za-z]{2}|[0-9]{2}|[A-Za-z][0-9])([0-9]{4}){1}";
    public static final String REGEX_PASS = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{4,6}$";


    public boolean validarNombre(EditText nombre) {

        Pattern patron = Pattern.compile(REGEX_LETERS);
        String valNom = nombre.getText().toString().trim();

        if (TextUtils.isEmpty(valNom)) {

            nombre.setError("vacio");
            return false;
        } else if (!patron.matcher(valNom).matches()) {

            nombre.setError("datos no validos");
            return false;

        } else {

            return true;
        }

    }

    public boolean validarUser(EditText usuario) {

        Pattern patronUser = Pattern.compile(REGEX_USER);
        String valUser = usuario.getText().toString().trim();
        if (TextUtils.isEmpty(valUser)) {

            usuario.setError("vacio");
            return false;

        } else if (!patronUser.matcher(valUser).matches()) {

            usuario.setError("Validación incorrecta");
            return false;
        } else {

            return true;
        }


    }


    public boolean validarPass(EditText pass) {

        Pattern patronPass = Pattern.compile(REGEX_PASS);
        String valPass = pass.getText().toString().trim();
        if (TextUtils.isEmpty(valPass)) {
            pass.setError("vacio");
            return false;
        } else if (!patronPass.matcher(valPass).matches()) {

            pass.setError("validacion incorrecta");
            return false;
        } else {

            return true;
        }


    }


}
