package com.android.mangaliso_elvynn.music_player_app_structure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2018/10/25.
 */


public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater inflateTracks;

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public SongAdapter(Context c, ArrayList<Song> songs) {
        this.songs = songs;
        inflateTracks = LayoutInflater.from(c);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        LinearLayout songLayout = (LinearLayout) inflateTracks.inflate(R.layout.song, viewGroup, false);
        TextView songView = songLayout.findViewById(R.id.artist_name);
        TextView artistView = songLayout.findViewById(R.id.song_title);
        ImageView songImage = songLayout.findViewById(R.id.trackImage);

        Song currentSong = songs.get(i);

        songView.setText(currentSong.getTitle());
        artistView.setText(currentSong.getArtist());
        songImage.setImageResource(currentSong.getResId());

        songLayout.setTag(i);
        return songLayout;
    }
}
