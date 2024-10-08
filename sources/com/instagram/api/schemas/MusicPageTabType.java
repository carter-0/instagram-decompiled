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

public enum MusicPageTabType implements Parcelable {
    UNRECOGNIZED("MusicPageTabType_unspecified"),
    CLIPS("clips"),
    PHOTOS("photos");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MusicPageTabType[] musicPageTabTypeArr;
        A02 = 0oU.A00(musicPageTabTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MusicPageTabType musicPageTabType : values()) {
            A0x.put(musicPageTabType.A00, musicPageTabType);
        }
        A01 = A0x;
        CREATOR = new FK5(89);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MusicPageTabType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
