package com.instagram.creatortools.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum EligibilityCriteria implements Parcelable {
    UNRECOGNIZED("EligibilityCriteria_unspecified"),
    AGE_LIMIT("age_limit"),
    COUNTRY("country"),
    DEACTIVATION("deactivation"),
    FOLLOWER_COUNT("follower_count"),
    INVITE_ONLY("invite_only");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        EligibilityCriteria[] eligibilityCriteriaArr;
        A02 = 0oU.A00(eligibilityCriteriaArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EligibilityCriteria eligibilityCriteria : values()) {
            A0x.put(eligibilityCriteria.A00, eligibilityCriteria);
        }
        A01 = A0x;
        CREATOR = new LVP(58);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EligibilityCriteria(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
