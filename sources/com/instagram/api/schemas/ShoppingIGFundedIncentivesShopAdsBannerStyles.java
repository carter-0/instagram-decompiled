package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingIGFundedIncentivesShopAdsBannerStyles implements Parcelable {
    UNRECOGNIZED("ShoppingIGFundedIncentivesShopAdsBannerStyles_unspecified"),
    NEW_DESIGN("new_design"),
    REGULAR_DESIGN("regular_design"),
    REGULAR_DESIGN_CTA_BOI("regular_design_cta_boi"),
    REGULAR_DESIGN_CTA_SF("regular_design_cta_sf");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShoppingIGFundedIncentivesShopAdsBannerStyles[] shoppingIGFundedIncentivesShopAdsBannerStylesArr;
        A02 = 0oU.A00(shoppingIGFundedIncentivesShopAdsBannerStylesArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles : values()) {
            A0x.put(shoppingIGFundedIncentivesShopAdsBannerStyles.A00, shoppingIGFundedIncentivesShopAdsBannerStyles);
        }
        A01 = A0x;
        CREATOR = new DE6(78);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingIGFundedIncentivesShopAdsBannerStyles(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
