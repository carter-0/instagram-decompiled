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

public enum AudioBrowserCategoryType implements Parcelable {
    UNRECOGNIZED("AudioBrowserCategoryType_unspecified"),
    DEFAULT("default_category_type"),
    PILLS("pills"),
    SOUND_EFFECTS("sound_effects"),
    SPOTIFY_GENRES("spotify_genres"),
    SPOTIFY_MOODS("spotify_moods");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        AudioBrowserCategoryType[] audioBrowserCategoryTypeArr;
        A02 = 0oU.A00(audioBrowserCategoryTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (AudioBrowserCategoryType audioBrowserCategoryType : values()) {
            A0x.put(audioBrowserCategoryType.A00, audioBrowserCategoryType);
        }
        A01 = A0x;
        CREATOR = new SWT(51);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AudioBrowserCategoryType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
