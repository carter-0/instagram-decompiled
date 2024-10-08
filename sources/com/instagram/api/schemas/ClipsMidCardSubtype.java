package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsMidCardSubtype implements Parcelable {
    ;
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsMidCardSubtype[] clipsMidCardSubtypeArr;
        A02 = 0oU.A00(clipsMidCardSubtypeArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (ClipsMidCardSubtype clipsMidCardSubtype : values()) {
            A0x.put(clipsMidCardSubtype.A00, clipsMidCardSubtype);
        }
        A01 = A0x;
        CREATOR = new SWT(99);
    }

    /* access modifiers changed from: public */
    ClipsMidCardSubtype(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
