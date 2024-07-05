package com.example.paymemttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edSoluong;
    Button btnXacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edSoluong = findViewById(R.id.edtSoluong);
        btnXacnhan = findViewById(R.id.btnXacnhan);

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edSoluong.getText() == null || edSoluong.getText().toString().isEmpty()) {
                    return;
                }
                String soluong = edSoluong.getText().toString();
                double total = Double.parseDouble(soluong) * (double) 100000;
                Intent intent = new Intent(MainActivity.this, ThanhToanActivity.class);
                intent.putExtra("total", total);
                intent.putExtra("soluong", soluong);
                startActivity(intent);
            }
        });

    }
}