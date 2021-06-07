package com.example.interfdaces_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    private ImageView iconoperfil;
    private View chats;
    private ImageView fotousuario1;
    private ImageView fotousuario2;
    private ImageView fotousuario3;
    private ImageView fotousuario4;
    private ImageView fotousuario5;
    private ImageView fotousuario6;
    private ImageView fotousuario7;
    private ImageView fotousuario8;

    private ImageView imageView19;
    private ImageView imageView20;
    private ImageView imageView15;
    private ImageView imageView17;
    private ImageView imageView18;
    private ImageView imageView21;
    private ImageView imageView22;
    private ImageView imageView23;
    private ImageView iconovuelta;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        chats = findViewById(R.id.chats);
        fotousuario1 = findViewById(R.id.fotousuario1);
        fotousuario2 = findViewById(R.id.fotousuario2);
        fotousuario3 = findViewById(R.id.fotousuario3);
        fotousuario4 = findViewById(R.id.fotousuario4);
        fotousuario5 = findViewById(R.id.fotousuario5);
        fotousuario6 = findViewById(R.id.fotousuario6);
        imageView15= findViewById(R.id.imageView15);
        imageView17= findViewById(R.id.imageView17);
        imageView18= findViewById(R.id.imageView18);
        imageView19= findViewById(R.id.imageView19);
        imageView20= findViewById(R.id.imageView20);
        imageView21= findViewById(R.id.imageView21);
        imageView22= findViewById(R.id.imageView22);
        imageView23= findViewById(R.id.imageView23);

        iconoperfil = findViewById(R.id.iconoperfil);
        iconovuelta = findViewById(R.id.iconovuelta);

        iconovuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, PerfilUsuario.class); //Pantalla de taborda
                startActivity(intent);
            }
        });

        iconoperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, MainMenu.class); // A mi propio perfil
                startActivity(intent);
            }
        });

        fotousuario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, PerfilVista.class); //Perfil del usuario
                startActivity(intent);
            }
        });

        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Conversacion.class); //Conversacion, clase conversacion por hacer aun
                startActivity(intent);
            }
        });



    }
}