package com.instagram.music.common.model;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public enum InstagramAudioApplySource implements Parcelable {
    ARTIST_SPOTLIGHT(1),
    PLAYLISTS(2),
    SAVED(3),
    SEARCH(4),
    THIRD_PARTY_APP(5),
    SPOTIFY_PLAYLIST(6);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        InstagramAudioApplySource[] instagramAudioApplySourceArr;
        A01 = 0oU.A00(instagramAudioApplySourceArr);
        CREATOR = LVO.A00(46);
    }

    /* access modifiers changed from: public */
    InstagramAudioApplySource(int i) {
        this.A00 = i;
    }
}
