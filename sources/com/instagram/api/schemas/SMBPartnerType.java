package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SMBPartnerType implements Parcelable {
    UNRECOGNIZED("SMBPartnerType_unspecified"),
    BOOK_NOW("book_now"),
    DONATION("donation"),
    FOOD_DELIVERY("food_delivery"),
    GET_QUOTE("get_quote"),
    GET_TICKETS("get_tickets"),
    GIFT_CARD("gift_card"),
    A0A("");
    
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
        SMBPartnerType[] sMBPartnerTypeArr;
        A02 = 0oU.A00(sMBPartnerTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (SMBPartnerType sMBPartnerType : values()) {
            linkedHashMap.put(sMBPartnerType.A00, sMBPartnerType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(20);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SMBPartnerType(String str) {
        this.A00 = str;
    }
}
