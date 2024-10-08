package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingPivotItemType implements Parcelable {
    UNRECOGNIZED("ShoppingPivotItemType_unspecified"),
    BRANDS_WITH_PRODUCTS("brands_with_products"),
    FEATURED_PRODUCTS("featured_products"),
    MULTIBRAND_PRODUCT("multibrand_product"),
    RECONSIDERATION_PRODUCTS("reconsideration_products"),
    SINGLEBRAND_PRODUCT("singlebrand_product");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShoppingPivotItemType[] shoppingPivotItemTypeArr;
        A02 = 0oU.A00(shoppingPivotItemTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ShoppingPivotItemType shoppingPivotItemType : values()) {
            linkedHashMap.put(shoppingPivotItemType.A00, shoppingPivotItemType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(79);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingPivotItemType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
