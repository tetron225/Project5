package com.example.android.musicapp;

import android.graphics.drawable.Drawable;

public class Info {

    private String aNameOfArtist;

    private String aDescriptionOfArtist;

    private int artistIcon;


    public Info(int icon, String nameOfArtist, String descriptionOfArtist) {
        aNameOfArtist = nameOfArtist;
        aDescriptionOfArtist = descriptionOfArtist;
        artistIcon = icon;
    }

    public String getNameOfArtist() {
        return aNameOfArtist;
    }

    public String getDescriptionOfArtist() {
        return aDescriptionOfArtist;
    }

    public int getArtistIcon() {
        return artistIcon;
    }
}
