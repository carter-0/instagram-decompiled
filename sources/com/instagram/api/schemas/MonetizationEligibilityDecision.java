package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MonetizationEligibilityDecision implements Parcelable {
    UNRECOGNIZED("MonetizationEligibilityDecision_unspecified"),
    AT_RISK_OF_BECOMING_INELIGIBLE("at_risk_of_becoming_ineligible"),
    ELIGIBLE("eligible"),
    ELIGIBLE_PENDING_OPT_IN("eligible_pending_opt_in"),
    NOT_ELIGIBLE("not_eligible"),
    NOT_PAYOUTS_ELIGIBLE("not_payouts_eligible");
    
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
        MonetizationEligibilityDecision[] monetizationEligibilityDecisionArr;
        A02 = 0oU.A00(monetizationEligibilityDecisionArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MonetizationEligibilityDecision monetizationEligibilityDecision : values()) {
            linkedHashMap.put(monetizationEligibilityDecision.A00, monetizationEligibilityDecision);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(65);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MonetizationEligibilityDecision(String str) {
        this.A00 = str;
    }
}
