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

public enum MusicDropType implements Parcelable {
    UNRECOGNIZED("MusicDropType_unspecified"),
    TRACK("track");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MusicDropType[] musicDropTypeArr;
        A02 = 0oU.A00(musicDropTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MusicDropType musicDropType : values()) {
            A0x.put(musicDropType.A00, musicDropType);
        }
        A01 = A0x;
        CREATOR = FK5.A00(88);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MusicDropType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
