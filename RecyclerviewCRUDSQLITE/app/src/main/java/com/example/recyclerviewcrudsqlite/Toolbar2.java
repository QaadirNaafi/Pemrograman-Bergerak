package com.example.recyclerviewcrudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Toolbar2 extends Fragment {

    public Toolbar2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.activity_toolbar2, container, false);

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.activity_toolbar2, null);

        return root;
    }
}
