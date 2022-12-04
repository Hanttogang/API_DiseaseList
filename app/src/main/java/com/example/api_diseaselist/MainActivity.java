package com.example.api_diseaselist;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DiseaseAdapter diseaseAdapter;

    RecyclerView recyclerView;

    ArrayList<Disease> diseaseList = new ArrayList<Disease>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDate();

        recyclerView = findViewById(R.id.recyclerView);

        diseaseAdapter = new DiseaseAdapter(diseaseList);

        recyclerView.setAdapter(diseaseAdapter);
    }

    //샘플 데이터 생성
    public void createDate(){

        for(int i = 0; i < 10; i++){
            Disease disease = new Disease("제목"+i, "번호: 1"+i);
            diseaseList.add(disease);
        }
    }
}