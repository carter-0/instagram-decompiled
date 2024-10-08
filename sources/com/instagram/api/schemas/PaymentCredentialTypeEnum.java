package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbS;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum PaymentCredentialTypeEnum implements Parcelable {
    UNRECOGNIZED("PaymentCredentialTypeEnum_unspecified");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        PaymentCredentialTypeEnum[] paymentCredentialTypeEnumArr;
        A02 = 0oU.A00(paymentCredentialTypeEnumArr);
        LinkedHashMap A0x2 = DbS.A0x(DbY.A00(r4));
        for (PaymentCredentialTypeEnum paymentCredentialTypeEnum : values()) {
            A0x2.put(paymentCredentialTypeEnum.A00, paymentCredentialTypeEnum);
        }
        A01 = A0x2;
        CREATOR = new DE6(9);
    }

    /* access modifiers changed from: public */
    PaymentCredentialTypeEnum(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
