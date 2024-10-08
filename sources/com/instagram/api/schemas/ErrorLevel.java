package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ErrorLevel implements Parcelable {
    UNRECOGNIZED("ErrorLevel_unspecified"),
    ERROR("ERROR");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ErrorLevel[] errorLevelArr;
        A02 = 0oU.A00(errorLevelArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ErrorLevel errorLevel : values()) {
            linkedHashMap.put(errorLevel.A00, errorLevel);
        }
        A01 = linkedHashMap;
        CREATOR = new DE7(61);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ErrorLevel(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
