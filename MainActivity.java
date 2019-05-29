package com.example.largetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private TextView nameText,ageText,largetextt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        largetextt=(TextView)findViewById(R.id.largee_text);
        //nameText=(TextView) findViewById(R.id.name_Text);
        //nameText.setText("Mesbah hasan");
        //ageText= (TextView) findViewById(R.id.age_Text);
        //ageText.setText("21 Years old");


    }
}
