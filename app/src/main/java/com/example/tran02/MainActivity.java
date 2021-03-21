package com.example.tran02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputLogin;
    EditText inputPassword;
    TextView textInvalido;
    Button buttonLogin;
    Button buttonSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Login");
        inputLogin = findViewById(R.id.inputLogin);
        inputPassword = findViewById(R.id.inputPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSignin = findViewById(R.id.buttonSignin);
        textInvalido = findViewById(R.id.textInvalido);
    }

    public void onClickLogin(View view) {
        String input = inputLogin.getText().toString();
        String pass = inputPassword.getText().toString();

        if (input.equals("Jhonatan") && pass.equals("senha")){
            Intent intent = new Intent(MainActivity.this,
                    TelaInicial.class);
            startActivity(intent);
        } else {
            textInvalido.setVisibility(View.VISIBLE);
        }
    }
}