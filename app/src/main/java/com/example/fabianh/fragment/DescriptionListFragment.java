package com.example.fabianh.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DescriptionListFragment extends ListFragment {

    interface Descriptionlistener {
        void itemClicked(long id);
    }

    private Descriptionlistener listerner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        String[] listTiles = new String[Descriptions.descriptionArray.length];

        for (int i = 0; i < listTiles.length; i++) {
            listTiles[i] = Descriptions.descriptionArray[i].getName();
        }

        ArrayAdapter <String> adapter = new ArrayAdapter <String>(inflater.getContext(), android.R.layout.simple_list_item_1,listTiles);

        setListAdapter(adapter);

        return super.onCreateView(inflater,viewGroup, savedInstanceState);
    }

    @Override
    public void onAttach (Context context){
        super.onAttach(context);

        if (context instanceof Descriptionlistener){
            listerner = (Descriptionlistener)context;
        }
        else{
            throw new RuntimeException(context.toString()+"Must implement Listener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        if (listerner != null){
            listerner.itemClicked(id);
        }
    }

}

