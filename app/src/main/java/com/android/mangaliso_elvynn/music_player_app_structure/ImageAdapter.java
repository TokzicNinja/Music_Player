package com.android.mangaliso_elvynn.music_player_app_structure;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by User on 2018/11/01.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater inflateAlbum;
    private ArrayList<Album> albums;
//    private View albumView;
    public ImageAdapter(Context c) {
        mContext = c;
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

//        if (convertView == null) {

//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8,8,8,8);

            LinearLayout albumView = (LinearLayout) inflateAlbum.inflate(R.layout.album, viewGroup, false);
            TextView albumTextView = albumView.findViewById(R.id.albumTextView);
            TextView artistTextView = albumView.findViewById(R.id.artistTextView);
            ImageView albumImageView = albumView.findViewById(R.id.albumArtImageView);


//            LinearLayout songLayout = (LinearLayout) inflateTracks.inflate(R.layout.song,viewGroup,false);
//            TextView songView = songLayout.findViewById(R.id.artist_name);
//            TextView artistView = songLayout.findViewById(R.id.song_title);
//            ImageView songImage = songLayout.findViewById(R.id.trackImage);
//
            Album currentAlbum = albums.get(i);
//
            albumTextView.setText(currentAlbum.getAlbumName());
            artistTextView.setText(currentAlbum.getArtistName());
            albumImageView.setImageResource(currentAlbum.getResId());

//            albumImageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
//            albumImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            albumImageView.setPadding(8, 8, 8, 8);
//        } else {
//            albumView = (LinearLayout) convertView;
//        }

//        imageView.setImageResource(mThumbIds[i]);
        return albumView;
    }

    public ImageAdapter(Context c, ArrayList<Album> albums) {
        this.albums = albums;
        inflateAlbum = LayoutInflater.from(c);
    }
//    private Integer[] mThumbIds = {
//            R.mipmap.ic_dreaming_song_art,R.mipmap.ic_heaven_song_art,
//            R.mipmap.ic_how_much_a_dollar_song_art,R.mipmap.ic_jump_song_art,
//            R.mipmap.ic_what_goes_around_song_art,R.mipmap.ic_war_song_art,
//            R.mipmap.ic_ubala_song_art,R.mipmap.ic_song_our_own_song_song_art,
//            R.mipmap.ic_solo_song_art,R.mipmap.ic_self_control_song_art,
//            R.mipmap.ic_saved_song_art,R.mipmap.ic_maneater_song_art};
}
