package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGUserHighlightsTrayType implements Parcelable {
    UNRECOGNIZED("IGUserHighlightsTrayType_unspecified"),
    CARDS("CARDS"),
    DEFAULT("DEFAULT"),
    POGS("POGS"),
    SUBTAB("SUBTAB");
    
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
        IGUserHighlightsTrayType[] iGUserHighlightsTrayTypeArr;
        A02 = 0oU.A00(iGUserHighlightsTrayTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGUserHighlightsTrayType iGUserHighlightsTrayType : values()) {
            linkedHashMap.put(iGUserHighlightsTrayType.A00, iGUserHighlightsTrayType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(41);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGUserHighlightsTrayType(String str) {
        this.A00 = str;
    }
}
