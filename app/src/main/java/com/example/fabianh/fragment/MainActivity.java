package com.example.fabianh.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements DescriptionListFragment.Descriptionlistener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragcontainer);

        if (fragmentContainer != null) {
            DescriptionDetailFRagment newDetailFrag = new DescriptionDetailFRagment();

            newDetailFrag.setDetailDescID(id);

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

            ft.replace(R.id.fragcontainer, newDetailFrag);

            ft.addToBackStack(null);

            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

            ft.commit();


        } else

        {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.DESC_ID,(int) id);
            startActivity(intent);

        }
    }
}
/*Intent.putExtra(DetailActivity.DESC_ID, (int) id);*/

