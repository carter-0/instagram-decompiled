package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGClickToMessagingCardTypeEnum implements Parcelable {
    UNRECOGNIZED("IGClickToMessagingCardTypeEnum_unspecified"),
    FAQS_STICKER_CARD("FAQS_STICKER_CARD"),
    FAQ_AND_COMPOSER_STICKER_CARD("FAQ_AND_COMPOSER_STICKER_CARD");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGClickToMessagingCardTypeEnum[] iGClickToMessagingCardTypeEnumArr;
        A02 = 0oU.A00(iGClickToMessagingCardTypeEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IGClickToMessagingCardTypeEnum iGClickToMessagingCardTypeEnum : values()) {
            A0x.put(iGClickToMessagingCardTypeEnum.A00, iGClickToMessagingCardTypeEnum);
        }
        A01 = A0x;
        CREATOR = FK5.A00(14);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGClickToMessagingCardTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
