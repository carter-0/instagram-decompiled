package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ContentAppreciationFanOfferType implements Parcelable {
    UNRECOGNIZED("ContentAppreciationFanOfferType_unspecified"),
    FIRST_FUNDING_DISCOUNT("first_funding_discount");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ContentAppreciationFanOfferType[] contentAppreciationFanOfferTypeArr;
        A02 = 0oU.A00(contentAppreciationFanOfferTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ContentAppreciationFanOfferType contentAppreciationFanOfferType : values()) {
            A0x.put(contentAppreciationFanOfferType.A00, contentAppreciationFanOfferType);
        }
        A01 = A0x;
        CREATOR = new DE7(22);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ContentAppreciationFanOfferType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
