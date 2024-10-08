package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum CheckoutStyle implements Parcelable {
    UNRECOGNIZED("CheckoutStyle_unspecified"),
    EXTERNAL_LINK("external_link"),
    NATIVE_CHECKOUT("native_checkout"),
    OFFSITE_IAB_CHECKOUT("offsite_iab_checkout");
    
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
        CheckoutStyle[] checkoutStyleArr;
        A02 = 0oU.A00(checkoutStyleArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (CheckoutStyle checkoutStyle : values()) {
            linkedHashMap.put(checkoutStyle.A00, checkoutStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(67);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CheckoutStyle(String str) {
        this.A00 = str;
    }
}
