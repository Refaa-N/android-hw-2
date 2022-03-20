package com.example.refaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        EditText bag1 = findViewById(R.id.editText1);
        EditText bag2 = findViewById(R.id.editText2) ;
        EditText bag3 = findViewById(R.id.editText3);
        EditText bag4 = findViewById(R.id.editText4);
        EditText bag5 = findViewById(R.id.editText5);

        Button next = findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            private String v;

            @Override
            public void onClick(View view) {
                if (bag1.getText().toString().isEmpty() || bag2.getText().toString().isEmpty() || bag3.getText().toString().isEmpty() || bag4.getText().toString().isEmpty() || bag5.getText().toString().isEmpty()) {
                    //Do Nothing...
                } else {
                    String mybag1 = bag1.getText().toString();
                    String mybag2 = bag2.getText().toString();
                    String mybag3 = bag3.getText().toString();
                    String mybag4 = bag4.getText().toString();
                    String mybag5 = bag5.getText().toString();
                    intent.putExtra("bags1", mybag1);
                    intent.putExtra("bags2", mybag2);
                    intent.putExtra("bags3", mybag3);
                    intent.putExtra("bags4", mybag4);
                    intent.putExtra("bags5", mybag5);
                    startActivities(new Intent[]{intent});

                }

            }
        });


    }
}