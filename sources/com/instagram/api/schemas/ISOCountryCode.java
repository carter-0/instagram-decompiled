package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ISOCountryCode implements Parcelable {
    UNRECOGNIZED("ISOCountryCode_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ISOCountryCode[] iSOCountryCodeArr;
        A02 = 0oU.A00(iSOCountryCodeArr);
        LinkedHashMap A0x2 = DbS.A0x(DbY.A00(r4));
        for (ISOCountryCode iSOCountryCode : values()) {
            A0x2.put(iSOCountryCode.A00, iSOCountryCode);
        }
        A01 = A0x2;
        CREATOR = new FK5(34);
    }

    /* access modifiers changed from: public */
    ISOCountryCode(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
