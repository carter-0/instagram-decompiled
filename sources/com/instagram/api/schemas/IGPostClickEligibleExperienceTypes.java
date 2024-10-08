package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum IGPostClickEligibleExperienceTypes implements Parcelable {
    UNRECOGNIZED("IGPostClickEligibleExperienceTypes_unspecified"),
    IAB_APP_PROMOTION_WEB_TO_APP("IAB_APP_PROMOTION_WEB_TO_APP"),
    IAB_AUTOFILL_ADS_PERSONALIZATION("IAB_AUTOFILL_ADS_PERSONALIZATION"),
    IAB_BUY_WITH_INTEGRATION("IAB_BUY_WITH_INTEGRATION"),
    IAB_BUY_WITH_PRIME("IAB_BUY_WITH_PRIME"),
    IAB_META_CHECKOUT_FIRMLY("IAB_META_CHECKOUT_FIRMLY"),
    IAB_META_CHECKOUT_METAPAYMENTS_SDK("IAB_META_CHECKOUT_METAPAYMENTS_SDK"),
    IAB_META_CHECKOUT_SHOPIFY_SCA("IAB_META_CHECKOUT_SHOPIFY_SCA"),
    IAB_META_CHECKOUT_SHOPIFY_SDK("IAB_META_CHECKOUT_SHOPIFY_SDK"),
    IAB_PROMO_ADS_AUTOFILL("IAB_PROMO_ADS_AUTOFILL");
    
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
        IGPostClickEligibleExperienceTypes[] iGPostClickEligibleExperienceTypesArr;
        A02 = 0oU.A00(iGPostClickEligibleExperienceTypesArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes : values()) {
            linkedHashMap.put(iGPostClickEligibleExperienceTypes.A00, iGPostClickEligibleExperienceTypes);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(37);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    IGPostClickEligibleExperienceTypes(String str) {
        this.A00 = str;
    }
}
