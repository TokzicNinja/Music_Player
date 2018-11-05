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
        artists.add(new Artist("Madonna", R.mipmap.ic_jump_song_art_round));
        artists.add(new Artist("Nelly Furtado", R.mipmap.ic_maneater_song_art_round));
        artists.add(new Artist("Kendrick Lamar", R.mipmap.ic_how_much_a_dollar_song_art_round));
        artists.add(new Artist("Simmy", R.mipmap.ic_ubala_song_art_round));
        artists.add(new Artist("Justin Timberlake", R.mipmap.ic_what_goes_around_song_art_round));
        artists.add(new Artist("Laura Branigan", R.mipmap.ic_self_control_song_art_round));
        artists.add(new Artist("Nas", R.mipmap.ic_heaven_song_art_round));
        artists.add(new Artist("Jason Derulo", R.mipmap.ic_solo_song_art_round));
        artists.add(new Artist("UB40", R.mipmap.ic_song_our_own_song_song_art_round));
        artists.add(new Artist("Edwin Starr", R.mipmap.ic_war_song_art_round));
        artists.add(new Artist("Khalid", R.mipmap.ic_saved_song_art_round));
        artists.add(new Artist("Smallpools", R.mipmap.ic_dreaming_song_art_round));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        ListView listView = findViewById(R.id.artist_listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intent);
            }
        });
    }

}