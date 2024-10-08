package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum AudioMetadataLabels implements Parcelable {
    UNRECOGNIZED("AudioMetadataLabels_unspecified"),
    NEW_RELEASE("new_release"),
    PRE_RELEASE("pre_release"),
    SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG("spotify_playlist_as_spotlight_banner_song");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudioMetadataLabels[] audioMetadataLabelsArr;
        A02 = 0oU.A00(audioMetadataLabelsArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AudioMetadataLabels audioMetadataLabels : values()) {
            linkedHashMap.put(audioMetadataLabels.A00, audioMetadataLabels);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioMetadataLabels(String str) {
        this.A00 = str;
    }
}
