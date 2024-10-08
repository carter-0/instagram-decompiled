package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductCardSubtitleType implements Parcelable {
    UNRECOGNIZED("ProductCardSubtitleType_unspecified"),
    IN_REVIEW("in_review"),
    MERCHANT_NAME("merchant_name"),
    MERCHANT_NAME_AND_PRICE("merchant_name_and_price"),
    MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING("merchant_name_and_price_no_free_shipping"),
    MERCHANT_NAME_AS_TEXT_AND_PRICE("merchant_name_as_text_and_price"),
    NOT_APPROVED("not_approved"),
    ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING("one_line_product_with_merchant_name_and_price_no_free_shipping"),
    PRICE("price"),
    PRICE_WITH_MERCHANT_NO_OVERLAY("price_with_merchant_no_overlay"),
    PRICE_WITH_MERCHANT_OVERLAY("price_with_merchant_overlay"),
    PRICE_WITH_SOLD_OUT("price_with_sold_out");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductCardSubtitleType[] productCardSubtitleTypeArr;
        A02 = 0oU.A00(productCardSubtitleTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (ProductCardSubtitleType productCardSubtitleType : values()) {
            linkedHashMap.put(productCardSubtitleType.A00, productCardSubtitleType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(19);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductCardSubtitleType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
