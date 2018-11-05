package com.android.mangaliso_elvynn.music_player_app_structure;

/**
 * Created by User on 2018/10/25.
 */

public class Song {
    String title;
    String artist;
    int mResId;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    Song(String title, String artist, int mResId) {
        this.title = title;
        this.artist = artist;
        this.mResId = mResId;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
    public int getResId() { return mResId; }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setResId(int mResId) {this.mResId = mResId;}
}
