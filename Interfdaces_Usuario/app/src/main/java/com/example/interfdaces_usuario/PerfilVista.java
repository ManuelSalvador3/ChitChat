package com.example.interfdaces_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfilVista extends AppCompatActivity {

    private ImageView imagen_perfil2;
    private TextView nombre_perfil_principal;

    private TextView info_cuenta2;
    private TextView nombre_usuario_visita;
    private TextView gustos_perfil;
    private TextView Ubicacion_visita;
    private TextView nombre_perfil_visita;
    private TextView texto_gustos_pefil;
    private TextView texto_ubicacion;

    private TextView gustos_comun;
    private TextView texto_comun_gustos;
    private TextView texto_comun_gustos2;

    private TextView gustos_diferentes;
    private TextView texto_diferentes_gustos;
    private TextView texto_diferentes_gustos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_vista);

        imagen_perfil2 = findViewById(R.id.imagen_perfil2);
        nombre_perfil_principal = findViewById(R.id.nombre_perfil_principal);
        info_cuenta2 = findViewById(R.id.info_cuenta2);
        nombre_usuario_visita = findViewById(R.id.nombre_usuario_visita);
        gustos_perfil = findViewById(R.id.gustos_perfil);
        Ubicacion_visita = findViewById(R.id.Ubicacion_visita);
        nombre_perfil_visita = findViewById(R.id.nombre_perfil_visita);
        texto_gustos_pefil = findViewById(R.id.texto_gustos_pefil);
        texto_ubicacion = findViewById(R.id.texto_ubicacion);

        gustos_comun = findViewById(R.id.gustos_comun);
        texto_comun_gustos = findViewById(R.id.texto_comun_gustos);
        texto_comun_gustos2 = findViewById(R.id.texto_comun_gustos2);
        gustos_diferentes = findViewById(R.id.gustos_diferentes);
        texto_diferentes_gustos = findViewById(R.id.texto_diferentes_gustos);
        texto_diferentes_gustos2 = findViewById(R.id.texto_diferentes_gustos2);

    }
}