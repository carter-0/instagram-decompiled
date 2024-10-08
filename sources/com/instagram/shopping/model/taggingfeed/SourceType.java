package com.instagram.shopping.model.taggingfeed;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SourceType implements Parcelable {
    UNRECOGNIZED("SourceType_unspecified"),
    OPT_SHOP("opt_shop"),
    OPT_SOURCE_SELECTION("opt_source_selection"),
    PRODUCT_CATALOG("product_catalog"),
    PURCHASED_PRODUCTS("purchased_products"),
    SAVED_PRODUCTS("saved_products"),
    SELLER("seller"),
    SOURCE_SELECTION("source_selection"),
    STOREFRONT_COLLECTION("storefront_collection"),
    STOREFRONT_DISCOUNT("storefront_discount"),
    SUGGESTED_PRODUCT_SET("suggested_product_set");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SourceType[] sourceTypeArr;
        A02 = 0oU.A00(sourceTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (SourceType sourceType : values()) {
            A0x.put(sourceType.A00, sourceType);
        }
        A01 = A0x;
        CREATOR = new W6F(61);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SourceType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
