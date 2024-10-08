package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MusicDropStreamingServiceEnum implements Parcelable {
    UNRECOGNIZED("MusicDropStreamingServiceEnum_unspecified"),
    SMART_LINK("smart_link"),
    SPOTIFY("spotify"),
    APPLE_MUSIC("apple_music"),
    YOUTUBE_MUSIC("youtube_music"),
    MIXCLOUD("mixcloud"),
    AMAZON_MUSIC("amazon_music"),
    SOUNDCLOUD("soundcloud"),
    TIDAL("tidal"),
    DEEZER("deezer"),
    BEATPORT("beatport");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MusicDropStreamingServiceEnum[] musicDropStreamingServiceEnumArr;
        A02 = 0oU.A00(musicDropStreamingServiceEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (MusicDropStreamingServiceEnum musicDropStreamingServiceEnum : values()) {
            A0x.put(musicDropStreamingServiceEnum.A00, musicDropStreamingServiceEnum);
        }
        A01 = A0x;
        CREATOR = FK5.A00(87);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MusicDropStreamingServiceEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
