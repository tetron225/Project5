package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
This is left blank because it was suppose to start playing the music that was chosen. But since they aren't required to
play music and it needs to take a much longer time to figure out how, I will use this as a placeholder for future
endeavors on the music app
 */
public class Play extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);


        final Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Play.this, Search.class);
                startActivity(intent2);
            }
        });

        final Button button3 = findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Play.this, Playlist.class);
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
                Intent intent5 = new Intent(Play.this, MainActivity.class);
                startActivity(intent5);
            }
        });
    }
}
