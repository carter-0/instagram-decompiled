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

public enum IGAdsTrustInfoTypeEnum implements Parcelable {
    UNRECOGNIZED("IGAdsTrustInfoTypeEnum_unspecified"),
    ACCOUNT_FOLLOWER("ACCOUNT_FOLLOWER"),
    BC_OPTIONS("BC_OPTIONS"),
    DESTINATION_URL("DESTINATION_URL"),
    HEADLINE("HEADLINE"),
    LOCATION("LOCATION"),
    PAYMENT_OPTIONS("PAYMENT_OPTIONS"),
    RATINGS_REVIEW("RATINGS_REVIEW"),
    RESPONSE_TIME("RESPONSE_TIME"),
    RETURN_POLICY("RETURN_POLICY");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IGAdsTrustInfoTypeEnum[] iGAdsTrustInfoTypeEnumArr;
        A02 = 0oU.A00(iGAdsTrustInfoTypeEnumArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum : values()) {
            A0x.put(iGAdsTrustInfoTypeEnum.A00, iGAdsTrustInfoTypeEnum);
        }
        A01 = A0x;
        CREATOR = FK5.A00(8);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGAdsTrustInfoTypeEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
