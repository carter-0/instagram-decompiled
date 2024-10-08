package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductCollectionV2Type implements Parcelable {
    UNRECOGNIZED("ProductCollectionV2Type_unspecified"),
    AT_SHOP("at_shop"),
    DISCOUNT("discount"),
    DROP("drop"),
    DROP_V2("drop_v2"),
    MOCK_AT_SHOP("mock_at_shop"),
    SALE("sale"),
    SELLER_CURATED("seller_curated"),
    SELLER_CURATED_V2("seller_curated_v2");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductCollectionV2Type[] productCollectionV2TypeArr;
        A02 = 0oU.A00(productCollectionV2TypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductCollectionV2Type productCollectionV2Type : values()) {
            linkedHashMap.put(productCollectionV2Type.A00, productCollectionV2Type);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(20);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductCollectionV2Type(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
