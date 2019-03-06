package com.example.fabianh.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DescriptionDetailFRagment extends Fragment {


    private long detailDescID;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null){
            detailDescID = savedInstanceState.getLong("detailDescID");
        }

    }

    @Override
    public void onStart(){
        super.onStart();

        View view = getView();

        if(view != null){
            Descriptions descriptions = Descriptions.descriptionArray[(int)detailDescID];

            TextView title = (TextView)view.findViewById(R.id.textview);
            TextView desc = (TextView)view.findViewById(R.id.textView2);
            ImageView img = (ImageView)view.findViewById(R.id.imageView);

            title.setText(descriptions.getName());
            desc.setText(descriptions.getDesc());
            img.setImageResource(descriptions.getImgRes());
            img.setContentDescription(descriptions.getName());


        }
    }

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState){
        return i.inflate(R.layout.fragment_description_detail,container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("detailDescID",detailDescID);
    }

    public void setDetailDescID(long id) {
        this.detailDescID = id;
    }
}
