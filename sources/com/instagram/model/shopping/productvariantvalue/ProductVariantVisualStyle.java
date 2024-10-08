package com.instagram.model.shopping.productvariantvalue;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductVariantVisualStyle implements Parcelable {
    UNRECOGNIZED("ProductVariantVisualStyle_unspecified"),
    PICKER("picker"),
    THUMBNAIL("thumbnail");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductVariantVisualStyle[] productVariantVisualStyleArr;
        A02 = 0oU.A00(productVariantVisualStyleArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductVariantVisualStyle productVariantVisualStyle : values()) {
            linkedHashMap.put(productVariantVisualStyle.A00, productVariantVisualStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new LVO(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductVariantVisualStyle(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
