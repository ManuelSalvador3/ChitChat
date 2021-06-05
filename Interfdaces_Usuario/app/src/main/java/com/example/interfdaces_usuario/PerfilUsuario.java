package com.example.interfdaces_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PerfilUsuario extends AppCompatActivity {

    private TextView ajustes_usuario_titulo;
    private ImageView imagen_perfil;
    private TextView nombre_perfil;

    private TextView info_cuenta;
    private TextView nombre_usuario;
    private TextView correo_electronico;
    private TextView telefono;
    private TextView cambio_contraseña;
    private TextView nombre_usuario2;
    private TextView correo_electronico2;
    private TextView info_cuenta3;

    private Button deshabilitar_cuenta;
    private Button eliminar_cuenta;

    private TextView info_aplicacion;
    private TextView soporte_tecnico;
    private TextView historial_cambios;
    private TextView registro_deputacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        ajustes_usuario_titulo = findViewById(R.id.ajustes_usuario_titulo);
        imagen_perfil = findViewById(R.id.imagen_perfil);
        nombre_perfil = findViewById(R.id.nombre_perfil);
        info_cuenta = findViewById(R.id.info_cuenta);
        nombre_usuario = findViewById(R.id.nombre_usuario);
        correo_electronico = findViewById(R.id.correo_electronico);
        telefono = findViewById(R.id.telefono);
        nombre_usuario2 = findViewById(R.id.nombre_usuario2);
        correo_electronico2 = findViewById(R.id.correo_electronico2);
        info_cuenta3 = findViewById(R.id.info_cuenta3);
        deshabilitar_cuenta = findViewById(R.id.deshabilitar_cuenta);
        eliminar_cuenta = findViewById(R.id.eliminar_cuenta);
        info_aplicacion = findViewById(R.id.info_aplicacion);
        soporte_tecnico = findViewById(R.id.soporte_tecnico);
        historial_cambios = findViewById(R.id.historial_cambios);
        registro_deputacion = findViewById(R.id.registro_depuracion);

        deshabilitar_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PerfilUsuario.this,   "Cuenta deshabilitada", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(PerfilUsuario.this, MainActivity.class);
                startActivity(intent);
            }
        });

        eliminar_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PerfilUsuario.this,   "Cuenta eliminada", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(PerfilUsuario.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}