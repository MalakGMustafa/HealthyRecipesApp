package com.example.healthyrecipesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    String photo;
    String method;
    String ing;
    private TextView txt1;
    private TextView txt2;
    private ImageView  food1 , food2 , food3, sweet1, sweet2, sweet3;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        food1 = findViewById(R.id.food1);
        food2 = findViewById(R.id.food2);
        food3 = findViewById(R.id.food3);
        sweet1 = findViewById(R.id.sweet1);
        sweet2 = findViewById(R.id.sweet2);
        sweet3 = findViewById(R.id.sweet3);
        back = findViewById(R.id.back);

        photo = getIntent().getStringExtra("photo");
        ing = getIntent().getStringExtra("ing");
        method = getIntent().getStringExtra("method");

        txt1.setText(ing);
        txt2.setText(method);


        setImage(photo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

    private void setImage(String photo){
        switch (photo) {
            case "food1":
                food1.setVisibility(View.VISIBLE);
                food2.setVisibility(View.INVISIBLE);
                food3.setVisibility(View.INVISIBLE);
                sweet1.setVisibility(View.INVISIBLE);
                sweet2.setVisibility(View.INVISIBLE);
                sweet3.setVisibility(View.INVISIBLE);
                break;

            case "food2":
                food1.setVisibility(View.INVISIBLE);
                food2.setVisibility(View.VISIBLE);
                food3.setVisibility(View.INVISIBLE);
                sweet1.setVisibility(View.INVISIBLE);
                sweet2.setVisibility(View.INVISIBLE);
                sweet3.setVisibility(View.INVISIBLE);
                break;

            case "food3":
                food1.setVisibility(View.INVISIBLE);
                food2.setVisibility(View.INVISIBLE);
                food3.setVisibility(View.VISIBLE);
                sweet1.setVisibility(View.INVISIBLE);
                sweet2.setVisibility(View.INVISIBLE);
                sweet3.setVisibility(View.INVISIBLE);
                break;

            case "sweet1":
                food1.setVisibility(View.INVISIBLE);
                food2.setVisibility(View.INVISIBLE);
                food3.setVisibility(View.INVISIBLE);
                sweet1.setVisibility(View.VISIBLE);
                sweet2.setVisibility(View.INVISIBLE);
                sweet3.setVisibility(View.INVISIBLE);
                break;

            case "sweet2":
                food1.setVisibility(View.INVISIBLE);
                food2.setVisibility(View.INVISIBLE);
                food3.setVisibility(View.INVISIBLE);
                sweet1.setVisibility(View.INVISIBLE);
                sweet2.setVisibility(View.VISIBLE);
                sweet3.setVisibility(View.INVISIBLE);
                break;

            case "sweet3":
                food1.setVisibility(View.INVISIBLE);
                food2.setVisibility(View.INVISIBLE);
                food3.setVisibility(View.INVISIBLE);
                sweet1.setVisibility(View.INVISIBLE);
                sweet2.setVisibility(View.INVISIBLE);
                sweet3.setVisibility(View.VISIBLE);
                break;
        }
    }
}