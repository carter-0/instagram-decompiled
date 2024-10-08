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

public enum FundingSourceType implements Parcelable {
    UNRECOGNIZED("FundingSourceType_unspecified"),
    ALTPAY("ALTPAY"),
    APPLE_IAP("APPLE_IAP"),
    CREDIT_CARD("CREDIT_CARD"),
    DIRECT_DEBIT("DIRECT_DEBIT"),
    DUMMY("DUMMY"),
    EARNINGS_PAYOUT("EARNINGS_PAYOUT"),
    FACEBOOK_EXTENDED_CREDIT("FACEBOOK_EXTENDED_CREDIT"),
    FACEBOOK_TOKEN("FACEBOOK_TOKEN"),
    INVOICE("INVOICE"),
    ORDER("ORDER"),
    PAYPAL_BILLING_AGREEMENT("PAYPAL_BILLING_AGREEMENT"),
    PAYPAL_TOKEN("PAYPAL_TOKEN"),
    STORED_BALANCE("STORED_BALANCE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        FundingSourceType[] fundingSourceTypeArr;
        A02 = 0oU.A00(fundingSourceTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (FundingSourceType fundingSourceType : values()) {
            A0x.put(fundingSourceType.A00, fundingSourceType);
        }
        A01 = A0x;
        CREATOR = new DE7(74);
    }

    /* access modifiers changed from: public */
    FundingSourceType(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
