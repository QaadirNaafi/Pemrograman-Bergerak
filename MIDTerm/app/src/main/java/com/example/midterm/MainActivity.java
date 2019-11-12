package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

     ArrayList<Model> models = new ArrayList<>();

     Model model = new Model();
     model.setTitle("Kazuma");
     model.setDescription("The main protagonist. A sixteen-year-old Japanese teenager who became a game-obsessed shut-in after having his heart broken over his childhood friend during middle school. He is sent to the parallel reality after dying from acute stress reaction, forcing Aqua to come with him after she irritates him with her attitude. Kazuma is classed as an Adventurer which, despite being the lowest ranked class, allows him to learn various skills from other classes, albeit at an increased cost. With his ability, Kazuma learns basic skills such as stealing, archery, monster detection, and basic magic");
     model.setImg(R.drawable.kazuma);
     models.add(model);

     model = new Model();
     model.setTitle("Megumin");
     model.setDescription("An arch wizard who is descended from crimson demons; powerful humanoids who possess black hair and red eyes, and sport chuunibyou characteristics. Megumin only knows a single skill, the incredibly powerful explosion magic that immediately incapacitates her for the rest of the day when cast, and refuses to learn any other skills");
     model.setImg(R.drawable.megumin);
     models.add(model);

     model = new Model();
     model.setTitle("Aqua");
     model.setDescription("The goddess of water who judged humans to send to the RPG world, up until Kazuma dragged her along with him. She is an energetic and simpleminded girl who likes to receive reverence for her status and gets upset easily. As an Archpriest and a goddess, she is powerful against demons and the undead, and is able to resurrect recently deceased people as well as purify water supplies. Rather than learning skills which would benefit her party, she spends most of her skill points learning Party Tricks");
     model.setImg(R.drawable.aqua);
     models.add(model);

     model = new Model();
     model.setTitle("Darkness");
     model.setDescription("A crusader who possesses powerful offense and defense, but lacks the accuracy to deliver her attacks. She is a masochist who dreams of being ravaged by monsters or married to an abusive husband; regardless, she is serious with issues involving her friends");
     model.setImg(R.drawable.darkness);
     models.add(model);

     model = new Model();
     model.setTitle("Wiz");
     model.setDescription("A powerful lich wizard who, despite being one of the Devil King's generals, is a timid and kind woman who uses her powers to assist civilians and lead lost spirits to the afterlife. She runs an unsuccessful magic shop");
     model.setImg(R.drawable.wiz);
     models.add(model);

     return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
