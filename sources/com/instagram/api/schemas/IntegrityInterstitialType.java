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

public enum IntegrityInterstitialType implements Parcelable {
    UNRECOGNIZED("IntegrityInterstitialType_unspecified"),
    BLOCK_ACCESS("BLOCK_ACCESS"),
    COHORT_BLOCK("COHORT_BLOCK"),
    COHORT_BLOCK_CA("COHORT_BLOCK_CA"),
    WARN_USER("WARN_USER");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        IntegrityInterstitialType[] integrityInterstitialTypeArr;
        A02 = 0oU.A00(integrityInterstitialTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (IntegrityInterstitialType integrityInterstitialType : values()) {
            A0x.put(integrityInterstitialType.A00, integrityInterstitialType);
        }
        A01 = A0x;
        CREATOR = new FK5(44);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IntegrityInterstitialType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
