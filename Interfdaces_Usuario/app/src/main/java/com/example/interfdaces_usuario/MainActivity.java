 package com.example.interfdaces_usuario;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button login_button;
    private TextView textoCuenta;
    private ImageView imageView;
    boolean isValid = false;
    private String inputname;
    private String inputpassword;
    private String user;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        editTextUsername = findViewById(R.id.editTextusername);
        editTextPassword = findViewById(R.id.editTextPassword);
        login_button = findViewById(R.id.login_button);
        textoCuenta = findViewById(R.id.tvRegistro);
        imageView = findViewById(R.id.imageView);
        user = "manu";
        password = "123";


        textoCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(editTextUsername.getText().toString().equals("") || editTextPassword.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Introduce usuario y contraseña", Toast.LENGTH_LONG).show();
                }
                else{
                    inputname = editTextUsername.getText().toString();
                    inputpassword = editTextPassword.getText().toString();

                    if(inputname.equals("manu") && inputpassword.equals("123")) {

                        isValid = true;
                        Toast.makeText(MainActivity.this,   "Login correcto", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, MainMenu.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this,   "No ha introducido correctamente los datos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
