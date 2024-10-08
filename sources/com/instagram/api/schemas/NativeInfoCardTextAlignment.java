package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NativeInfoCardTextAlignment implements Parcelable {
    UNRECOGNIZED("NativeInfoCardTextAlignment_unspecified"),
    center("center"),
    left("left");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        NativeInfoCardTextAlignment[] nativeInfoCardTextAlignmentArr;
        A02 = 0oU.A00(nativeInfoCardTextAlignmentArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (NativeInfoCardTextAlignment nativeInfoCardTextAlignment : values()) {
            linkedHashMap.put(nativeInfoCardTextAlignment.A00, nativeInfoCardTextAlignment);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(92);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    NativeInfoCardTextAlignment(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
