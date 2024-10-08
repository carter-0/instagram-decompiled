package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ConfirmationTitleStyle implements Parcelable {
    UNRECOGNIZED("ConfirmationTitleStyle_unspecified"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    LARGE_LEFT("large_left");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ConfirmationTitleStyle[] confirmationTitleStyleArr;
        A02 = 0oU.A00(confirmationTitleStyleArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ConfirmationTitleStyle confirmationTitleStyle : values()) {
            linkedHashMap.put(confirmationTitleStyle.A00, confirmationTitleStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(86);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ConfirmationTitleStyle(String str) {
        this.A00 = str;
    }
}
