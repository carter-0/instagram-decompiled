package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudioBrowserPlaylistType implements Parcelable {
    UNRECOGNIZED("AudioBrowserPlaylistType_unspecified"),
    ARTIST_SPOTLIGHT("artist_spotlight"),
    CONTEXTUAL_MUSIC_RECS("contextual_music_recs"),
    DEFAULT("default_playlist_type"),
    FOR_YOU("for_you"),
    NUMBERED("numbered"),
    RECENTLY_LIKED_CLIPS("recently_liked_clips"),
    SOUND_EFFECTS("sound_effects"),
    SPOTIFY("spotify"),
    SPOTIFY_RECENTLY_PLAYED("spotify_recently_played");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudioBrowserPlaylistType[] audioBrowserPlaylistTypeArr;
        A02 = 0oU.A00(audioBrowserPlaylistTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AudioBrowserPlaylistType audioBrowserPlaylistType : values()) {
            A0x.put(audioBrowserPlaylistType.A00, audioBrowserPlaylistType);
        }
        A01 = A0x;
        CREATOR = new SWT(53);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioBrowserPlaylistType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
