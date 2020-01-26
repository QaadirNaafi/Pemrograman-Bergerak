package com.example.recyclerviewcrudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Toolbar extends Fragment {

    public Toolbar(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.activity_toolbar, container, false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_toolbar, null);

        return root;
    }
}
