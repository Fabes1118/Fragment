package com.example.fabianh.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {
    public static final String DESC_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        DescriptionDetailFRagment newDetailFrag = (DescriptionDetailFRagment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        int descID = (int)getIntent().getExtras().get(DESC_ID);
        newDetailFrag.setDetailDescID(descID);

    }

}
