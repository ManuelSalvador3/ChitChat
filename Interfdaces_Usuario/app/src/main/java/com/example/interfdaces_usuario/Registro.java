package com.example.interfdaces_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextApellido;
    private EditText editTextusername2;
    private EditText editTextPassword2;
    private EditText editTextNumber;
    private Button login_button_register;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTextName = findViewById(R.id.editTextName);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextusername2 = findViewById(R.id.editTextusername2);
        editTextPassword2 = findViewById(R.id.editTextPassword2);
        editTextNumber = findViewById(R.id.editTextNumber);
        login_button_register = findViewById(R.id.login_button_register);

        login_button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextName.getText().toString().equals("") || editTextApellido.getText().toString().equals("") || editTextusername2.getText().toString().equals("") || editTextPassword2.getText().toString().equals("") ||
                        editTextNumber.getText().toString().equals("")) {
                    Toast.makeText(Registro.this, "Rellene todos los campos", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Registro.this,   "Cuenta creada correctamente", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Registro.this, InterestSelector.class);
                    startActivity(intent);

                }
            }
        });



    }
}