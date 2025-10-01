package com.example.hypex;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView tvEmail = findViewById(R.id.tvEmailShown);
        Button btnLogout = findViewById(R.id.btnLogout);

        // Mostrar el email que vino del login
        String email = getIntent().getStringExtra("email");
        if (email != null && !email.isEmpty()) {
            tvEmail.setText(email);
        }

        // Volver al login
        btnLogout.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
            finish();
        });
    }
}
