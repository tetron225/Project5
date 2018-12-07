package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_activity);

        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(R.drawable.marilynmonroe001, "Mariilyn Monroe", "I wanna be loved by you."));
        infos.add(new Info(R.drawable.apple, "Aqua", "Cartoon Heroes"));
        infos.add(new Info(R.drawable.apple, "Aqua", "Barbie Girl"));
        infos.add(new Info(R.drawable.apple, "Ali Edwards", "Devil Trigger"));
        infos.add(new Info(R.drawable.apple, "Courtney Knott", "Rising Up"));
        infos.add(new Info(R.drawable.apple, "Weird Al Yankovich", "Amish Paradise"));
        infos.add(new Info(R.drawable.apple, "Eternity", "Deep Purple"));
        infos.add(new Info(R.drawable.apple, "Photograph", "Nickelback"));
        infos.add(new Info(R.drawable.apple, "Higher", "Creed"));

        InfoAdapter infoAdapt = new InfoAdapter(this, infos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(infoAdapt);

        final Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Playlist.this, Search.class);
                startActivity(intent2);
            }
        });

        final Button button3 = findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Playlist.this, Play.class);
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
                Intent intent5 = new Intent(Playlist.this, MainActivity.class);
                startActivity(intent5);
            }
        });
    }
}
