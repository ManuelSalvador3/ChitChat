package com.example.interfdaces_usuario;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.interfdaces_usuario.databinding.ActivityMainMenuBinding;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button leftButton = this.findViewById(R.id.leftButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, menu.class);
                startActivity(intent);
            }
        });


        // Hardcoded topics lolo
        ImageButton imageButton = this.findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = this.findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = this.findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = this.findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(this);
        ImageButton imageButton5 = this.findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(this);
        ImageButton imageButton6 = this.findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(this);
        ImageButton imageButton7 = this.findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(this);
        ImageButton imageButton8 = this.findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(this);
        ImageButton imageButton9 = this.findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(this);
        ImageButton imageButton10 = this.findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(this);
        ImageButton imageButton11 = this.findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(this);
        ImageButton imageButton12 = this.findViewById(R.id.imageButton12);
        imageButton12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getAlpha() == 1)
            v.setAlpha((float) 0.75);
        else
            v.setAlpha((float) 1);
    }
}