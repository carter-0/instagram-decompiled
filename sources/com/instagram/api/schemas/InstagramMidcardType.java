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

public enum InstagramMidcardType implements Parcelable {
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
        InstagramMidcardType[] instagramMidcardTypeArr;
        A02 = 0oU.A00(instagramMidcardTypeArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r4));
        for (InstagramMidcardType instagramMidcardType : values()) {
            A0x.put(instagramMidcardType.A00, instagramMidcardType);
        }
        A01 = A0x;
        CREATOR = new FK5(40);
    }

    /* access modifiers changed from: public */
    InstagramMidcardType(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
