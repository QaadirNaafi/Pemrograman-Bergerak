package com.example.recyclerviewcrudsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LihatData = findViewById(R.id.lihatbtn);
        Button InputData = findViewById(R.id.inputbtn);
        Button informasi = findViewById(R.id.infobtn);
        LihatData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, DataPasien.class);
                startActivity(inte);
            }
        });
        InputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, InputData.class);
                startActivity(inte);
            }
        });
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, Informasi.class);
                startActivity(inte);
            }
        });
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Profile.class);
                startActivity(activity1);
                return true;

            case R.id.change_setting:
            Intent activity2 = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(activity2);
                return true;
            default:
                return true;
        }
    }
}
