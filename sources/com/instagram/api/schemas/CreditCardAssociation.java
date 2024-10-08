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

public enum CreditCardAssociation implements Parcelable {
    UNRECOGNIZED("CreditCardAssociation_unspecified"),
    AMERICANEXPRESS("AMERICANEXPRESS"),
    CUP("CUP"),
    DINERSCLUB("DINERSCLUB"),
    DISCOVER("DISCOVER"),
    ELO("ELO"),
    INTERAC("INTERAC"),
    JCB("JCB"),
    MAESTRO("MAESTRO"),
    MASTERCARD("MASTERCARD"),
    PIN_ONLY("PIN_ONLY"),
    RUPAY("RUPAY"),
    UNKNOWN("UNKNOWN");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        CreditCardAssociation[] creditCardAssociationArr;
        A02 = 0oU.A00(creditCardAssociationArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (CreditCardAssociation creditCardAssociation : values()) {
            A0x.put(creditCardAssociation.A00, creditCardAssociation);
        }
        A01 = A0x;
        CREATOR = new DE7(47);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    CreditCardAssociation(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
