package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XFBYPRequestStatus implements Parcelable {
    UNRECOGNIZED("XFBYPRequestStatus_unspecified"),
    ACCEPTED("ACCEPTED"),
    CANCELED("CANCELED"),
    PENDING("PENDING"),
    REJECTED("REJECTED");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XFBYPRequestStatus[] xFBYPRequestStatusArr;
        A02 = 0oU.A00(xFBYPRequestStatusArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XFBYPRequestStatus xFBYPRequestStatus : values()) {
            A0x.put(xFBYPRequestStatus.A00, xFBYPRequestStatus);
        }
        A01 = A0x;
        CREATOR = FK6.A00(72);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBYPRequestStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
