package com.example.interfdaces_usuario;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

import com.example.interfdaces_usuario.databinding.ActivityInterestSelectorBinding;

public class InterestSelector extends AppCompatActivity implements View.OnClickListener{

    private ActivityInterestSelectorBinding binding;
    private int interestCounter = 0;
    ExtendedFloatingActionButton submitButton;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInterestSelectorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle("Bienvenido Manu");

        submitButton = this.findViewById(R.id.submit_likes);
        submitButton.setEnabled(false);


        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("Marca tus gustos aquí y podremos emparejarte con otros de intereses similares.\n\nNecesitas seleccionar al menos 3.");
        dlgAlert.setTitle("Info");
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });
        dlgAlert.setCancelable(true);


        FloatingActionButton fab = binding.infoButton;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dlgAlert.create().show();
            }});


        ExtendedFloatingActionButton likesSubmit = this.findViewById(R.id.submit_likes);
        likesSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterestSelector.this, MainMenu.class);
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
        if (v.getAlpha() == 1)  {
            v.setAlpha((float) 0.75);
            interestCounter++;
        } else {
            v.setAlpha((float) 1);
            interestCounter--;
        }

        submitButton.setEnabled(interestCounter > 2);
    }
}