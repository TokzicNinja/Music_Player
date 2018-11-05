package com.android.mangaliso_elvynn.music_player_app_structure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 2018/11/01.
 */

public class AlbumsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_layout);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Confessions on a Dance Floor", "Madonna", R.mipmap.ic_jump_song_art_round));
        albums.add(new Album("Loose", "Nelly Furtado", R.mipmap.ic_maneater_song_art_round));
        albums.add(new Album("To Pimp a Butterfly", "Kendrick Lamar", R.mipmap.ic_how_much_a_dollar_song_art_round));
        albums.add(new Album("Single", "Simmy", R.mipmap.ic_ubala_song_art_round));
        albums.add(new Album("FutureSex/LoveSounds", "Justin Timberlake", R.mipmap.ic_what_goes_around_song_art_round));
        albums.add(new Album("Self-Control", "Laura Branigan", R.mipmap.ic_self_control_song_art_round));
        albums.add(new Album("God's Son", "Nas", R.mipmap.ic_heaven_song_art_round));
        albums.add(new Album("Jason Derulo", "Jason Derulo", R.mipmap.ic_solo_song_art_round));
        albums.add(new Album("Rat in the Kitchen", "UB40", R.mipmap.ic_song_our_own_song_song_art_round));
        albums.add(new Album("War & Peace", "Edwin Starr", R.mipmap.ic_war_song_art_round));
        albums.add(new Album("American Teen", "Khalid", R.mipmap.ic_saved_song_art_round));
        albums.add(new Album("Lovetap", "Smallpools", R.mipmap.ic_dreaming_song_art_round));


        GridView gridView = findViewById(R.id.ImageGridView);
        gridView.setAdapter(new AlbumAdapter(this, albums));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(v.getContext(), "Something", Toast.LENGTH_LONG);
            }
        });
    }
}
