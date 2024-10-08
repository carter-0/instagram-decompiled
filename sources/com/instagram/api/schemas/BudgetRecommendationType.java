package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BudgetRecommendationType implements Parcelable {
    UNRECOGNIZED("BudgetRecommendationType_unspecified"),
    LOW_OUTCOME_BUDGET_WARNING("LOW_OUTCOME_BUDGET_WARNING"),
    MIN_CPC_SUGGESTION("MIN_CPC_SUGGESTION"),
    NO_CONVERSION_WARNING("NO_CONVERSION_WARNING"),
    RECOMMENDED_DEFAULT_BUDGET_CPA_BASED("RECOMMENDED_DEFAULT_BUDGET_CPA_BASED"),
    RECOMMENDED_DEFAULT_BUDGET_LEAD_GEN("RECOMMENDED_DEFAULT_BUDGET_LEAD_GEN"),
    RECOMMENDED_DEFAULT_BUDGET_PPP_BASED("RECOMMENDED_DEFAULT_BUDGET_PPP_BASED"),
    SIMILAR_ADVERTISER_BUDGET_RECOMMENDATION("SIMILAR_ADVERTISER_BUDGET_RECOMMENDATION"),
    ZERO_OUTCOME_BUDGET_WARNING("ZERO_OUTCOME_BUDGET_WARNING"),
    ZERO_OUTCOME_BUDGET_WARNING_TEST1("ZERO_OUTCOME_BUDGET_WARNING_TEST1");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BudgetRecommendationType[] budgetRecommendationTypeArr;
        A02 = 0oU.A00(budgetRecommendationTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (BudgetRecommendationType budgetRecommendationType : values()) {
            linkedHashMap.put(budgetRecommendationType.A00, budgetRecommendationType);
        }
        A01 = linkedHashMap;
        CREATOR = new SWT(72);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BudgetRecommendationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
