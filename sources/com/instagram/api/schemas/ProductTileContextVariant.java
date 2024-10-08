package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileContextVariant implements Parcelable {
    UNRECOGNIZED("ProductTileContextVariant_unspecified"),
    FOLLOWED_BY_SOCIAL_CONTEXT("followed_by_social_context");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileContextVariant[] productTileContextVariantArr;
        A02 = 0oU.A00(productTileContextVariantArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductTileContextVariant productTileContextVariant : values()) {
            linkedHashMap.put(productTileContextVariant.A00, productTileContextVariant);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(34);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileContextVariant(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
