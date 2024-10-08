package com.instagram.music.common.model;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public enum MusicSearchPlaylistType implements Parcelable {
    ARTIST_SPOTLIGHT,
    FOR_YOU,
    NUMBERED,
    SPOTIFY,
    SPOTIFY_RECENTLY_PLAYED,
    DEFAULT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        MusicSearchPlaylistType[] musicSearchPlaylistTypeArr;
        A00 = 0oU.A00(musicSearchPlaylistTypeArr);
        CREATOR = LVO.A00(54);
    }
}
