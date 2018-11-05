package com.android.mangaliso_elvynn.music_player_app_structure;

public class Artist {
    private String ArtistName;
    private int mResId;

    Artist(String ArtistName, int mResId) {
        this.ArtistName = ArtistName;
        this.mResId = mResId;
    }

    String getArtistName() {
        return ArtistName;
    }

    void setArtistName(String ArtistName) {
        this.ArtistName = ArtistName;
    }

    int getResId() {
        return mResId;
    }

    void setResId(int mResId) {
        this.mResId = mResId;
    }
}
