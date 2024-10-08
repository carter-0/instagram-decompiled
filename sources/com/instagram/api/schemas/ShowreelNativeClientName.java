package com.instagram.api.schemas;

import X.0oU;
import X.0se;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShowreelNativeClientName implements Parcelable {
    UNRECOGNIZED("ShowreelNativeClientName_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShowreelNativeClientName[] showreelNativeClientNameArr;
        A02 = 0oU.A00(showreelNativeClientNameArr);
        int A0L2 = 0se.A0L(r5);
        if (A0L2 < 16) {
            A0L2 = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L2);
        for (ShowreelNativeClientName showreelNativeClientName : values()) {
            A0x.put(showreelNativeClientName.A00, showreelNativeClientName);
        }
        A01 = A0x;
        CREATOR = new DE6(81);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShowreelNativeClientName(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
