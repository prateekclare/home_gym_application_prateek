package com.hfad.messengerytbv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaring
    private EditText name,age;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning variables -- Prateek
            name = findViewById(R.id.name);
            age = findViewById(R.id.age);
            add = findViewById(R.id.ADD);

         // On click method -- Prateek
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Get the value taht user type

                    String username=name.getText().toString();
                    String userage=age.getText().toString();

                    //Intent
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("keyname",username);
                    intent.putExtra("keyage",userage);
                    startActivity(intent);

                }
            });

    }
}