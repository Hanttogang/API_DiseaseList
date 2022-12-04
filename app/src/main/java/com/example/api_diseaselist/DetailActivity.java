package com.example.api_diseaselist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView detail_title_text, detail_message_text, detail_age_text, detail_sex_text;

    String title, message, age, sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detail_title_text = findViewById(R.id.detail_title_text);
        detail_message_text = findViewById(R.id.detail_message_text);
//        detail_age_text = findViewById(R.id.detail_age_text);
//        detail_sex_text = findViewById(R.id.detail_sex_text);

        //메인엑티비티에서 받아온 데이터
        Intent intent = getIntent();

        title = intent.getExtras().getString("title");
        message = intent.getExtras().getString("message");
//        age = intent.getExtras().getString("age");
//        sex = intent.getExtras().getString("sex");

        detail_title_text.setText(title);
        detail_message_text.setText(message);
//        detail_age_text.setText(age);
//        detail_sex_text.setText(sex);
    }
}