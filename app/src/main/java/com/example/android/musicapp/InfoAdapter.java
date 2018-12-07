package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Activity context, ArrayList<Info> infoList) {
        super(context, 0, infoList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Info currentInfo = getItem(position);

        TextView nameOfArtist = (TextView) listItemView.findViewById(R.id.artistName);
        nameOfArtist.setText(currentInfo.getNameOfArtist());

        TextView songTitle = (TextView) listItemView.findViewById(R.id.songName);
        songTitle.setText(currentInfo.getDescriptionOfArtist());

        ImageView songIcon = (ImageView) listItemView.findViewById(R.id.artistImage);
        songIcon.setImageResource(currentInfo.getArtistIcon());

        /*
            The 3 click listeners are used to click on the specific title of the song so that it will
            redirect it to Play where the actual music will be played. It is a bit more efficient and
            cleaner then using a triangular shape.
         */

        nameOfArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistName = new Intent(view.getContext(), Play.class);
                view.getContext().startActivity(artistName);
            }
        });

        songTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistName = new Intent(view.getContext(), Play.class);
                view.getContext().startActivity(artistName);
            }
        });

        songIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistName = new Intent(view.getContext(), Play.class);
                view.getContext().startActivity(artistName);
            }
        });

        return listItemView;
    }

}
