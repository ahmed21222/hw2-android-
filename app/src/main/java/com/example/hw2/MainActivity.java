package com.example.hw2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btnRelative);
        Button b2 = findViewById(R.id.btnConstraint);

        b1.setOnClickListener(v -> startActivity(new Intent(this, RelativeLayout.class)));
        b2.setOnClickListener(v -> startActivity(new Intent(this, ConstraintLayout.class)));
    }
}
