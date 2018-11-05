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
 * Created by User on 2018/11/01.
 */

public class AlbumAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater inflateAlbum;
    private ArrayList<Album> albums;

    public AlbumAdapter(Context c) {
        mContext = c;
    }

    public AlbumAdapter(Context c, ArrayList<Album> albums) {
        this.albums = albums;
        inflateAlbum = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return albums.size();
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LinearLayout albumView = (LinearLayout) inflateAlbum.inflate(R.layout.album, viewGroup, false);
        TextView albumTextView = albumView.findViewById(R.id.albumTextView);
        TextView artistTextView = albumView.findViewById(R.id.artistTextView);
        ImageView albumImageView = albumView.findViewById(R.id.albumArtImageView);


        Album currentAlbum = albums.get(i);

        albumTextView.setText(currentAlbum.getAlbumName());
        artistTextView.setText(currentAlbum.getArtistName());
        albumImageView.setImageResource(currentAlbum.getResId());

        return albumView;
    }
}
