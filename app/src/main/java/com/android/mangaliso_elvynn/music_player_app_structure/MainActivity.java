package com.android.mangaliso_elvynn.music_player_app_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Jump", "Madonna", R.mipmap.ic_jump_song_art_round));
        songs.add(new Song("Maneater", "Nelly Furtado", R.mipmap.ic_maneater_song_art_round));
        songs.add(new Song("How much a dollar really cost", "Kendrick Lamar", R.mipmap.ic_how_much_a_dollar_song_art_round));
        songs.add(new Song("Ubala", "Simmy", R.mipmap.ic_ubala_song_art_round));
        songs.add(new Song("What goes around comes around", "Justin Timberlake", R.mipmap.ic_what_goes_around_song_art_round));
        songs.add(new Song("Self-Control", "Laura Branigan", R.mipmap.ic_self_control_song_art_round));
        songs.add(new Song("Heaven", "Nas", R.mipmap.ic_heaven_song_art_round));
        songs.add(new Song("Ridin' Solo", "Jason Derulo", R.mipmap.ic_solo_song_art_round));
        songs.add(new Song("Sing Our Own Song", "UB40", R.mipmap.ic_song_our_own_song_song_art_round));
        songs.add(new Song("War", "Edwin Starr", R.mipmap.ic_war_song_art_round));
        songs.add(new Song("Saved", "Khalid", R.mipmap.ic_saved_song_art_round));
        songs.add(new Song("Dreaming", "Smallpools", R.mipmap.ic_dreaming_song_art_round));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                menuItem.setCheckable(true);

                mDrawerLayout.closeDrawers();

                switch (menuItem.getItemId()) {
                    case R.id.albums:
                        Intent albumsIntent = new Intent(getBaseContext(), AlbumsActivity.class);
                        startActivity(albumsIntent);
                        return true;
                    case R.id.artists:
                        Intent artistIntent = new Intent(getBaseContext(), ArtistActivity.class);
                        startActivity(artistIntent);
                        return true;
                    case R.id.now_playing:
                        Intent nowPlayingIntent = new Intent(getBaseContext(), NowPlayingActivity.class);
                        startActivity(nowPlayingIntent);
                        return true;
                    default:
                        return true;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
