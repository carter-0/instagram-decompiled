package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileBannerType implements Parcelable {
    UNRECOGNIZED("ProductTileBannerType_unspecified"),
    EXCLUSIVE("exclusive"),
    FREE_SHIPPING("free_shipping"),
    IN_CART("in_cart"),
    LOW_INVENTORY("low_inventory"),
    LOW_STOCK("low_stock");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileBannerType[] productTileBannerTypeArr;
        A02 = 0oU.A00(productTileBannerTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductTileBannerType productTileBannerType : values()) {
            linkedHashMap.put(productTileBannerType.A00, productTileBannerType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(31);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileBannerType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
