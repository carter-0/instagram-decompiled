package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextPostAppPostUnavailableReason implements Parcelable {
    UNRECOGNIZED("TextPostAppPostUnavailableReason_unspecified"),
    HIDDEN("hidden");
    
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
        TextPostAppPostUnavailableReason[] textPostAppPostUnavailableReasonArr;
        A02 = 0oU.A00(textPostAppPostUnavailableReasonArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (TextPostAppPostUnavailableReason textPostAppPostUnavailableReason : values()) {
            linkedHashMap.put(textPostAppPostUnavailableReason.A00, textPostAppPostUnavailableReason);
        }
        A01 = linkedHashMap;
        CREATOR = new FK6(38);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextPostAppPostUnavailableReason(String str) {
        this.A00 = str;
    }
}
