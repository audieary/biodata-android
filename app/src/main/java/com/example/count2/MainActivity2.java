package com.example.count2;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    private int counter = 0;
    private TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button tombolToast = findViewById(R.id.button);
        tombolToast.setOnClickListener(v -> {
            counter = 0;
            Toast.makeText(MainActivity2.this, "Reset Berhasil", Toast.LENGTH_SHORT).show();
            textViewCount.setText(String.valueOf(counter));
        });


        textViewCount = findViewById(R.id.textView2);
        Button buttonAdd = findViewById(R.id.button2);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++; //
                textViewCount.setText(String.valueOf(counter));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
}