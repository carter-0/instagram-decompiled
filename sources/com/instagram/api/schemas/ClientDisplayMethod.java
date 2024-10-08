package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClientDisplayMethod implements Parcelable {
    UNRECOGNIZED("ClientDisplayMethod_unspecified"),
    ALWAYS("always"),
    EITHER_LIKE_OR_IMPRESSION_TRIGGER("either_like_or_impression_trigger"),
    IMPRESSION_TRIGGER("impression_trigger"),
    LIKE_TRIGGER("like_trigger");
    
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
        ClientDisplayMethod[] clientDisplayMethodArr;
        A02 = 0oU.A00(clientDisplayMethodArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ClientDisplayMethod clientDisplayMethod : values()) {
            linkedHashMap.put(clientDisplayMethod.A00, clientDisplayMethod);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(68);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClientDisplayMethod(String str) {
        this.A00 = str;
    }
}
