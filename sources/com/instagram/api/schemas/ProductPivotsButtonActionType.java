package com.instagram.api.schemas;

import X.0oU;
import X.DE6;
import X.DbY;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductPivotsButtonActionType implements Parcelable {
    UNRECOGNIZED("ProductPivotsButtonActionType_unspecified"),
    CART_FROM_MERCHANT("bag_from_merchant"),
    CHECKOUT_RECONSIDERATION("checkout_reconsideration"),
    CTA("cta"),
    CTA_WITH_DISMISS("cta_with_dismiss"),
    DISMISS("dismiss"),
    DROPS_DESTINATION("drops_destination"),
    INCENTIVE_COLLECTION("incentive_details"),
    PRODUCTS_FROM_FOLLOWED_BRANDS("products_from_followed_brands"),
    PRODUCTS_FROM_LIKED_MEDIA("products_from_liked_media"),
    PRODUCTS_FROM_SAVED_MEDIA("products_from_saved_media"),
    PROFILE_SHOP_PRODUCT_COLLECTIONS_FEED("profile_shop_product_collections_feed"),
    RECENTLY_VIEWED_FROM_MERCHANT("recently_viewed_from_merchant"),
    SAVED("saved"),
    SAVED_FROM_MERCHANT("saved_from_merchant"),
    SAVED_FROM_MERCHANTS("saved_from_merchants"),
    VIEW_CHECKOUT_PRODUCT_FEED("view_checkout_product_feed");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductPivotsButtonActionType[] productPivotsButtonActionTypeArr;
        A02 = 0oU.A00(productPivotsButtonActionTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (ProductPivotsButtonActionType productPivotsButtonActionType : values()) {
            linkedHashMap.put(productPivotsButtonActionType.A00, productPivotsButtonActionType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(26);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductPivotsButtonActionType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
