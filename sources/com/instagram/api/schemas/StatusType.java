package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StatusType implements Parcelable {
    UNRECOGNIZED("StatusType_unspecified"),
    AUTO("auto");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StatusType[] statusTypeArr;
        A02 = 0oU.A00(statusTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (StatusType statusType : values()) {
            linkedHashMap.put(statusType.A00, statusType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(87);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StatusType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
