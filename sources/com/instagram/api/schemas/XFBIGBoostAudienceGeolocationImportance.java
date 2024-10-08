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

public enum XFBIGBoostAudienceGeolocationImportance implements Parcelable {
    UNRECOGNIZED("XFBIGBoostAudienceGeolocationImportance_unspecified"),
    NOT_IMPORTANT("NOT_IMPORTANT"),
    SOMEWHAT_IMPORTANT("SOMEWHAT_IMPORTANT");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        XFBIGBoostAudienceGeolocationImportance[] xFBIGBoostAudienceGeolocationImportanceArr;
        A02 = 0oU.A00(xFBIGBoostAudienceGeolocationImportanceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance : values()) {
            A0x.put(xFBIGBoostAudienceGeolocationImportance.A00, xFBIGBoostAudienceGeolocationImportance);
        }
        A01 = A0x;
        CREATOR = FK6.A00(70);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XFBIGBoostAudienceGeolocationImportance(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
