package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TextPostAppHeaderFollowVariant implements Parcelable {
    UNRECOGNIZED("TextPostAppHeaderFollowVariant_unspecified"),
    PRIMARY("primary");
    
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
        TextPostAppHeaderFollowVariant[] textPostAppHeaderFollowVariantArr;
        A02 = 0oU.A00(textPostAppHeaderFollowVariantArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant : values()) {
            linkedHashMap.put(textPostAppHeaderFollowVariant.A00, textPostAppHeaderFollowVariant);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(46);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    TextPostAppHeaderFollowVariant(String str) {
        this.A00 = str;
    }
}
