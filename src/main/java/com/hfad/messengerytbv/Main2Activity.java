package com.hfad.messengerytbv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView name,age;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Variable declaring and assigning
        name = findViewById(R.id.text_name);
        age = findViewById(R.id.age);

        // Getting the values provided in Main Activity
        String username = getIntent().getStringExtra("keyname");
        String userage = getIntent().getStringExtra("keyage");

        // Displaying
        name.setText(username);
        age.setText(userage);



        // ********************* Image Opacity
        ImageView img = (ImageView)findViewById(R.id.trianglebg);
        img.setAlpha(40);



        // **************************** FOR CALLING PURPOSES
        //set listener -- Products
        button = (Button) findViewById(R.id.idviewbtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openProducts();
            }
        });

        //set listener -- Exercises
        button = (Button) findViewById(R.id.btnexercises);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openExercises();
            }
        });

        //set listener -- AboutUs
        button = (Button) findViewById(R.id.btnaboutus);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAbout();
            }
        });

        //set listener -- Watch
        button = (Button) findViewById(R.id.btnstopwatch);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openWatch();
            }
        });

    }




    public void openProducts() {
        Intent intent = new Intent(Main2Activity.this, ProductsCategoryActivity.class);
        startActivity(intent);

    }

    public void openExercises() {
        Intent intent = new Intent(Main2Activity.this, ExerciseActivity.class);
        startActivity(intent);
    }

    public void openAbout() {
        Intent intent = new Intent(Main2Activity.this, AboutUs.class);
        startActivity(intent);
    }

    public void openWatch() {
        Intent intent = new Intent(Main2Activity.this, StopWatchAct.class);
        startActivity(intent);
    }

}