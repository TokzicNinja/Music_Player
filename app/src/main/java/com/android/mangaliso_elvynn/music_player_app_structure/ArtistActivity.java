package com.android.mangaliso_elvynn.music_player_app_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_layout);

        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist("Madonna", R.drawable.ic_jump_song_art_web));
        artists.add(new Artist("Nelly Furtado", R.drawable.ic_maneater_song_art_web));
        artists.add(new Artist("Kendrick Lamar", R.drawable.ic_how_much_a_dollar_song_art_web));
        artists.add(new Artist("Simmy", R.drawable.ic_ubala_song_art_web));
        artists.add(new Artist("Justin Timberlake", R.drawable.ic_what_goes_around_song_art_web));
        artists.add(new Artist("Laura Branigan", R.drawable.ic_self_control_song_art_web));
        artists.add(new Artist("Nas", R.drawable.ic_heaven_song_art_web));
        artists.add(new Artist("Jason Derulo", R.drawable.ic_solo_song_art_web));
        artists.add(new Artist("UB40", R.drawable.ic_song_our_own_song_song_art_web));
        artists.add(new Artist("Edwin Starr", R.drawable.ic_war_song_art_web));
        artists.add(new Artist("Khalid", R.drawable.ic_saved_song_art_web));
        artists.add(new Artist("Smallpools", R.drawable.ic_dreaming_song_art_web));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        ListView listView = findViewById(R.id.artist_listView);
        listView.setAdapter(adapter);
    }

}