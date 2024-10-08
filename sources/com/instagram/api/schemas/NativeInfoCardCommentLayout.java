package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum NativeInfoCardCommentLayout implements Parcelable {
    UNRECOGNIZED("NativeInfoCardCommentLayout_unspecified"),
    horizontal("horizontal");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        NativeInfoCardCommentLayout[] nativeInfoCardCommentLayoutArr;
        A02 = 0oU.A00(nativeInfoCardCommentLayoutArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (NativeInfoCardCommentLayout nativeInfoCardCommentLayout : values()) {
            linkedHashMap.put(nativeInfoCardCommentLayout.A00, nativeInfoCardCommentLayout);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(91);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    NativeInfoCardCommentLayout(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
