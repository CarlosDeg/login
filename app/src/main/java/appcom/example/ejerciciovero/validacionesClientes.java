package appcom.example.ejerciciovero;

import android.text.TextUtils;
import android.widget.EditText;

import java.util.regex.Pattern;

public class validacionesClientes {

    public static final String REGEX_nombre = "([a-z A-Z]{4,12}+[ ]?){1}$";
    public static final String REGEX_apellidoP ="([a-z A-Z]{4,12}+[ ]?){1}$";
    public static final String REGEX_apellidoM ="([a-z A-Z]{4,12}+[ ]?){1}$";
    public static final String REGEX_correo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean validarNombreCliente(EditText nombreCliente) {

        Pattern patron = Pattern.compile(REGEX_nombre);
        String valNombre = nombreCliente.getText().toString().trim();

        if (TextUtils.isEmpty(valNombre)) {

            nombreCliente.setError("Debes completar este campo");
            return false;
        } else if (!patron.matcher(valNombre).matches()) {

            nombreCliente.setError("ingresa solo letras ");
            return false;

        } else {

            return true;
        }

    }

    public boolean validarApellidoP(EditText apellidoP) {

        Pattern patron1 = Pattern.compile(REGEX_apellidoP);
        String valAp = apellidoP.getText().toString().trim();

        if (TextUtils.isEmpty(valAp)) {

            apellidoP.setError("vacio");
            return false;
        } else if (!patron1.matcher(valAp).matches()) {

            apellidoP.setError("datos no validos");
            return false;

        } else {

            return true;
        }

    }
    public boolean validarApellidoM(EditText apellidoM) {

        Pattern patron2 = Pattern.compile(REGEX_apellidoM);
        String valApel = apellidoM.getText().toString().trim();

        if (TextUtils.isEmpty(valApel)) {

            apellidoM.setError("vacio");
            return false;
        } else if (!patron2.matcher(valApel).matches()) {

            apellidoM.setError("datos no validos");
            return false;

        } else {

            return true;
        }

    }


    public boolean validarCorreo(EditText correo) {

        Pattern patron2 = Pattern.compile(REGEX_correo);
        String valCorreo = correo.getText().toString().trim();

        if (TextUtils.isEmpty(valCorreo)) {

            correo.setError("vacio");
            return false;
        } else if (!patron2.matcher(valCorreo).matches()) {

            correo.setError("datos no validos");
            return false;

        } else {

            return true;
        }

    }





}
