package com.example.refaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView cv1 = findViewById(R.id.name);
        TextView cv2 = findViewById(R.id.age);
        TextView cv3 = findViewById(R.id.yourjob);
        TextView cv4 = findViewById(R.id.phone);
       TextView cv5 = findViewById(R.id.email);

        Bundle bundle = getIntent().getExtras();

        String finally1 = bundle.getString("bags1");
        String finally2 = bundle.getString("bags2");
        String finally3 = bundle.getString("bags3");
        String finally4 = bundle.getString("bags4");
        String finally5 = bundle.getString("bags5");

        cv1.setText(finally1);
        cv2.setText(finally2);
        cv3.setText(finally3);
        cv4.setText(finally4);
        cv5.setText(finally5);



                cv5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent email = new Intent(Intent.ACTION_SEND);
                        email.setType("text/plain");
                        startActivity(email);


                        cv4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent email = new Intent(Intent.ACTION_SEND);
                                email.setType("text/plain");
                                startActivity(email);

                            }
                        });
                    }
                });
            }
    private void getDir(String v) {
        Uri uri = Uri.parse(v);
        startActivities(new Intent[]{new Intent(Intent.ACTION_VIEW, uri)});
    }
    }
