package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipChainType implements Parcelable {
    UNRECOGNIZED("ClipChainType_unspecified"),
    ARTIST_PICKS("artist_picks"),
    FROM_AUDIO_OWNER("from_audio_owner"),
    TEMPLATES("templates");
    
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
        ClipChainType[] clipChainTypeArr;
        A02 = 0oU.A00(clipChainTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ClipChainType clipChainType : values()) {
            linkedHashMap.put(clipChainType.A00, clipChainType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(91);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipChainType(String str) {
        this.A00 = str;
    }
}
