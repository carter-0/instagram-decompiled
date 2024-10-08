package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RIXUActionSource implements Parcelable {
    UNRECOGNIZED("RIXUActionSource_unspecified"),
    END_OF_FEED_SUGGESTIONS("end_of_feed_suggestions"),
    EXPLORE_MEDIA_CHAIN_SUGGESTED("explore_media_chain_suggested"),
    FEED_BLENDING("feed_blending"),
    FEED_NETEGO("feed_netego");
    
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
        RIXUActionSource[] rIXUActionSourceArr;
        A02 = 0oU.A00(rIXUActionSourceArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (RIXUActionSource rIXUActionSource : values()) {
            linkedHashMap.put(rIXUActionSource.A00, rIXUActionSource);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RIXUActionSource(String str) {
        this.A00 = str;
    }
}
