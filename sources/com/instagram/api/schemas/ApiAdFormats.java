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

public enum ApiAdFormats implements Parcelable {
    UNRECOGNIZED("ApiAdFormats_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ApiAdFormats[] apiAdFormatsArr;
        A02 = 0oU.A00(apiAdFormatsArr);
        LinkedHashMap A0x2 = DbS.A0x(DbY.A00(r4));
        for (ApiAdFormats apiAdFormats : values()) {
            A0x2.put(apiAdFormats.A00, apiAdFormats);
        }
        A01 = A0x2;
        CREATOR = new SWT(39);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ApiAdFormats(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
