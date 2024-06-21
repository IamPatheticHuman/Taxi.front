package com.example.taxibooking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        findViewById(R.id.back).setOnClickListener(v -> {
            Intent intent = new Intent(SettingsActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.logout).setOnClickListener(v -> {
            Intent intent = new Intent(SettingsActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.profile).setOnClickListener(v -> {
            Intent intent = new Intent(SettingsActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}
