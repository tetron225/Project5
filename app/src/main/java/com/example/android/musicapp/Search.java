package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/*
    This class lets me filter out the search results from the ListView that was previously compiled
    But the understanding of creating a filter was a bit time consuming for me to finish this project.
 */

public class Search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);


        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(R.drawable.marilynmonroe001, "Mariilyn Monroe", "I wanna be loved by you."));
        infos.add(new Info(R.drawable.cheetah, "Aqua", "Cartoon Heroes"));
        infos.add(new Info(R.drawable.owl, "Aqua", "Barbie Girl"));
        infos.add(new Info(R.drawable.tiger, "Ali Edwards", "Devil Trigger"));
        infos.add(new Info(R.drawable.apple, "Courtney Knott", "Rising Up"));
        infos.add(new Info(R.drawable.apple, "Weird Al Yankovich", "Amish Paradise"));
        infos.add(new Info(R.drawable.owl, "Eternity", "Deep Purple"));
        infos.add(new Info(R.drawable.cheetah, "Photograph", "Nickelback"));
        infos.add(new Info(R.drawable.apple, "Higher", "Creed"));

        InfoAdapter infoAdapt = new InfoAdapter(this, infos);
        ListView listView = (ListView) findViewById(R.id.searchlist);
        listView.setAdapter(infoAdapt);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*
            This is suppose to be where you filter out the content to search for a
            specific artist name.
             */
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Search.this, Play.class);
                startActivity(intent2);
            }
        });

        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Search.this, Playlist.class);
                startActivity(intent3);
            }
        });

        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.google.com";
                Intent searchIntent = new Intent(Intent.ACTION_VIEW);
                searchIntent.setData(Uri.parse(url));
                startActivity(searchIntent);
            }
        });

        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Search.this, MainActivity.class);
                startActivity(intent5);
            }
        });

    }


}
