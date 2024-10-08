package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileLabelType implements Parcelable {
    UNRECOGNIZED("ProductTileLabelType_unspecified"),
    ADD_TO_BAG("add_to_bag"),
    DROPS_LAUNCH_INFO("drops_launch_info"),
    FEATURED_PRODUCT_PERMISSION_STATUS("featured_product_permission_status"),
    FREE_SHIPPING("free_shipping"),
    IN_REVIEW("in_review"),
    LOW_STOCK("low_stock"),
    MERCHANT_NAME("merchant_name"),
    MERCHANT_NAME_AND_PRICE("merchant_name_and_price"),
    NOT_APPROVED("not_approved"),
    PER_UNIT_PRICE("per_unit_price"),
    PRICE("price"),
    PRODUCT_NAME("product_name"),
    PRODUCT_NAME_AND_PRICE("product_name_and_price"),
    RATING("rating"),
    SEPARATOR("separator"),
    VIEW_ON_WEBSITE("view_on_website"),
    VIEW_SIMILAR("view_similar");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileLabelType[] productTileLabelTypeArr;
        A02 = 0oU.A00(productTileLabelTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (ProductTileLabelType productTileLabelType : values()) {
            linkedHashMap.put(productTileLabelType.A00, productTileLabelType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(37);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileLabelType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
