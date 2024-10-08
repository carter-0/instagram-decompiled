package com.instagram.model.reels.netego;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingNetegoType implements Parcelable {
    UNRECOGNIZED("ShoppingNetegoType_unspecified"),
    CONTINUE_SHOPPING_IN_STORY("continue_shopping_in_story"),
    MINORITY_OWNED_BUSINESS_SHOPS_YOU_MAY_LIKE("minority_owned_business_shops_you_may_like"),
    RECONSIDERATION_PRODUCTS_FOR_YOU("reconsideration_products_for_you");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShoppingNetegoType[] shoppingNetegoTypeArr;
        A02 = 0oU.A00(shoppingNetegoTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ShoppingNetegoType shoppingNetegoType : values()) {
            linkedHashMap.put(shoppingNetegoType.A00, shoppingNetegoType);
        }
        A01 = linkedHashMap;
        CREATOR = new C71269Ogb(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingNetegoType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
