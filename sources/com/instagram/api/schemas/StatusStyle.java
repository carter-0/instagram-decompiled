package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StatusStyle implements Parcelable {
    UNRECOGNIZED("StatusStyle_unspecified"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    LOCATION("location");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StatusStyle[] statusStyleArr;
        A02 = 0oU.A00(statusStyleArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (StatusStyle statusStyle : values()) {
            A0x.put(statusStyle.A00, statusStyle);
        }
        A01 = A0x;
        CREATOR = new DE6(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StatusStyle(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
