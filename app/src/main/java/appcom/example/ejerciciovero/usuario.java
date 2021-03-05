package appcom.example.ejerciciovero;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class usuario {

    private String nombre;
    private String usuario;
    private String pass;
    public String usuarios[] = {"karlos12345", "luisss12345"};
    public String contraseña[] = {"Karl2", "Peps4"};

    public usuario(String nombre, String usuario, String pass) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
    }

    public usuario() {

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    public String getPass() {

        return pass;
    }

    public void setPass(String pass) {

        this.pass = pass;
    }

    public boolean validarUsuario(EditText usuario, EditText pass) {
        String usuarioE = usuario.getText().toString();
        String passE = pass.getText().toString();
        boolean usuarioRegistrado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioE)) {
                if (contraseña[i].equals(passE)) {
                    System.out.println("bien");
                    return true;

                } else {

                    pass.setError("pass incorrecto");
                    System.out.println("pass incorrect");
                    return false;

                }
            }

        }
        if (!usuarioRegistrado) {

            usuario.setError("usuario incorrecto");
            System.out.println("usuario incorrecto");
        }

        return false;
    }


}
