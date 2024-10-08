package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingOnboardingState implements Parcelable {
    UNRECOGNIZED("ShoppingOnboardingState_unspecified"),
    DISABLED("disabled"),
    IN_REVIEW("in_review"),
    NOT_APPROVED("not_approved"),
    NOT_STARTED("not_started"),
    ONBOARDED("onboarded"),
    ONBOARDED_COLLAB_BRAND("onboarded_collab_brand"),
    ONBOARDED_CREATOR_AS_MARKETER("onboarded_creator_as_marketer"),
    ONBOARDED_CREATOR_AS_SELLER("onboarded_creator_as_seller");
    
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
        ShoppingOnboardingState[] shoppingOnboardingStateArr;
        A02 = 0oU.A00(shoppingOnboardingStateArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ShoppingOnboardingState shoppingOnboardingState : values()) {
            linkedHashMap.put(shoppingOnboardingState.A00, shoppingOnboardingState);
        }
        A01 = linkedHashMap;
        CREATOR = new C376419Hx(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingOnboardingState(String str) {
        this.A00 = str;
    }
}
