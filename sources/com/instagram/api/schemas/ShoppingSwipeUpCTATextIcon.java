package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingSwipeUpCTATextIcon implements Parcelable {
    UNRECOGNIZED("ShoppingSwipeUpCTATextIcon_unspecified"),
    A04(NetInfoModule.CONNECTION_TYPE_NONE);
    
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
        ShoppingSwipeUpCTATextIcon[] shoppingSwipeUpCTATextIconArr;
        A02 = 0oU.A00(shoppingSwipeUpCTATextIconArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon : values()) {
            linkedHashMap.put(shoppingSwipeUpCTATextIcon.A00, shoppingSwipeUpCTATextIcon);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(80);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingSwipeUpCTATextIcon(String str) {
        this.A00 = str;
    }
}
