package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ACRType implements Parcelable {
    UNRECOGNIZED("ACRType_unspecified"),
    ACTIVE_STORY("active_story"),
    CAMERA_ROLL("camera_roll"),
    FEED_CAROUSEL_HISTORICAL("feed_carousel_historical"),
    HIGHLIGHT_REEL("highlight_reel"),
    SMART_REEL("smart_reel"),
    UNKNOWN("");
    
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
        ACRType[] aCRTypeArr;
        A02 = 0oU.A00(aCRTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ACRType aCRType : values()) {
            linkedHashMap.put(aCRType.A00, aCRType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(45);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ACRType(String str) {
        this.A00 = str;
    }
}
