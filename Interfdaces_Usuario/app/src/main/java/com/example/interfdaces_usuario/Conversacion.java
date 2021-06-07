package com.example.interfdaces_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Conversacion extends AppCompatActivity {

    private View nombre_usuario_chat;

    private ImageView fotousuariochat;
    private ImageView fotousuariochat2;
    private ImageView fotousuariochat3;
    private ImageView fotousuariochat4;
    private ImageView iconovuelta2;

    private View mensaje1;
    private View mensaje2;
    private View mensaje3;
    private View mensaje4;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversacion);

        iconovuelta2 = findViewById(R.id.iconovuelta2);
        nombre_usuario_chat = findViewById(R.id.nombre_usuario_chat);
        fotousuariochat = findViewById(R.id.fotousuariochat);
        fotousuariochat2 = findViewById(R.id.fotousuariochat2);
        fotousuariochat3 = findViewById(R.id.fotousuariochat3);
        fotousuariochat4 = findViewById(R.id.fotousuariochat4);

        mensaje1 = findViewById(R.id.mensaje1);
        mensaje2 = findViewById(R.id.mensaje2);
        mensaje3 = findViewById(R.id.mensaje3);
        mensaje4 = findViewById(R.id.mensaje4);

        iconovuelta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversacion.this, menu.class); //Conversacion
                startActivity(intent);
            }
        });

    }
}