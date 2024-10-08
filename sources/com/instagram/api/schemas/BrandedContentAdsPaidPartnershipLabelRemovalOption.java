package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BrandedContentAdsPaidPartnershipLabelRemovalOption implements Parcelable {
    UNRECOGNIZED("BrandedContentAdsPaidPartnershipLabelRemovalOption_unspecified"),
    DUAL_HEADER_AND("dual_header_and"),
    DUAL_HEADER_WITH("dual_header_with");
    
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
        BrandedContentAdsPaidPartnershipLabelRemovalOption[] brandedContentAdsPaidPartnershipLabelRemovalOptionArr;
        A02 = 0oU.A00(brandedContentAdsPaidPartnershipLabelRemovalOptionArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption : values()) {
            linkedHashMap.put(brandedContentAdsPaidPartnershipLabelRemovalOption.A00, brandedContentAdsPaidPartnershipLabelRemovalOption);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(62);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BrandedContentAdsPaidPartnershipLabelRemovalOption(String str) {
        this.A00 = str;
    }
}
