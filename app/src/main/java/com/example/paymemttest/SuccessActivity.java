package com.example.paymemttest;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_success);
        TextView tvThongTinTT = findViewById(R.id.tvThongTinTT);
        tvThongTinTT.setText(getIntent().getStringExtra("result"));
    }
}