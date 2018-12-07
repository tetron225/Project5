package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlaying = (TextView) findViewById(R.id.play);
        TextView yourPlaylist = (TextView) findViewById(R.id.playlist);
        TextView searchNow = (TextView) findViewById(R.id.search);
        TextView subscribeNow = (TextView) findViewById(R.id.subscribe);


        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(MainActivity.this, Play.class);
                startActivity(playIntent);
            }
        });
        /*
        Goes through the actual playlist
         */

        yourPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

        /*
        For searching through the playlist/library
         */
        searchNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, Search.class);
                startActivity(searchIntent);
            }
        });

        /*
        Subscribe to subscribe at the main website. In which case, there was none that existed so
        I used www.google.com instead
        */
        subscribeNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.google.com";
                Intent searchIntent = new Intent(Intent.ACTION_VIEW);
                searchIntent.setData(Uri.parse(url));
                startActivity(searchIntent);
            }
        });
    }
}
