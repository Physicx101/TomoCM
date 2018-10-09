package com.example.bogi.tomocm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout keluhanPasien, aturJadwal, inputObat, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHome();
    }

    private void initHome() {
        keluhanPasien = findViewById(R.id.keluhanPasien);
        aturJadwal = findViewById(R.id.aturJadwal);
        aturJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddScheduleActivity.class));
            }
        });
        inputObat = findViewById(R.id.inputObat);
        profile = findViewById(R.id.profile);
    }
}
