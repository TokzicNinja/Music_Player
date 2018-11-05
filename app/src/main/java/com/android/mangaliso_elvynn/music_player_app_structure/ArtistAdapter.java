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

public class ArtistAdapter extends BaseAdapter {

    private ArrayList<Artist> artist;
    private LayoutInflater inflateArtists;

    public ArtistAdapter(Context c, ArrayList<Artist> artist) {
        this.artist = artist;
        inflateArtists = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return artist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        LinearLayout artistLayout = (LinearLayout) inflateArtists.inflate(R.layout.artist, viewGroup, false);
        TextView artistNameView = artistLayout.findViewById(R.id.artist_name_view);
        ImageView artistImage = artistLayout.findViewById(R.id.artist_image_view);

        Artist currentArtist = artist.get(i);

        artistNameView.setText(currentArtist.getArtistName());
        artistImage.setImageResource(currentArtist.getResId());

        artistLayout.setTag(i);
        return artistLayout;
    }

}
