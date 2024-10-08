package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BCPDealOutputTypeEnum implements Parcelable {
    UNRECOGNIZED("BCPDealOutputTypeEnum_unspecified"),
    BOOST_UGC_TO_AD("BOOST_UGC_TO_AD"),
    CHALLENGE_MEDIA_SUBMISSION("CHALLENGE_MEDIA_SUBMISSION");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BCPDealOutputTypeEnum[] bCPDealOutputTypeEnumArr;
        A02 = 0oU.A00(bCPDealOutputTypeEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BCPDealOutputTypeEnum bCPDealOutputTypeEnum : values()) {
            A0x.put(bCPDealOutputTypeEnum.A00, bCPDealOutputTypeEnum);
        }
        A01 = A0x;
        CREATOR = new SWT(59);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BCPDealOutputTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
