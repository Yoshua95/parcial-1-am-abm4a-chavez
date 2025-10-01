package com.example.hypex;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private LinearLayout llDynamicMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        llDynamicMessages = findViewById(R.id.llDynamicMessages);

        Button btnLogin = findViewById(R.id.btnLogin);
        LinearLayout btnGoogle = findViewById(R.id.btnGoogle);
        LinearLayout btnApple  = findViewById(R.id.btnApple);

        // Continuar con email + contraseña
        btnLogin.setOnClickListener(v -> {
            llDynamicMessages.removeAllViews();

            String email = etEmail.getText().toString().trim();
            String pass  = etPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                addDynamicMessage("Ingresá email y contraseña");
                return;
            }
            if (!email.contains("@")) {
                addDynamicMessage("Correo inválido. Ej: email@domain.com");
                return;
            }

            // Demo de validación
            if (email.equalsIgnoreCase("demo@hypex.com") && pass.equals("123456")) {
                Toast.makeText(this, "Ingreso correcto 👌", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, WelcomeActivity.class);
                i.putExtra("email", email);
                startActivity(i);
            } else {
                addDynamicMessage("Credenciales inválidas. Proba demo@hypex.com / 123456");
            }
        });

        // Socials (demo)
        btnGoogle.setOnClickListener(v ->
                Toast.makeText(this, "Google Sign-In (demo)", Toast.LENGTH_SHORT).show()
        );
        btnApple.setOnClickListener(v ->
                Toast.makeText(this, "Apple Sign-In (demo)", Toast.LENGTH_SHORT).show()
        );
    }

    private void addDynamicMessage(String text) {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setTextColor(0xFFE63946); // rojo acorde al logo
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setPadding(8, 8, 8, 8);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, 8, 0, 0);
        tv.setLayoutParams(lp);

        llDynamicMessages.addView(tv);
    }
}

