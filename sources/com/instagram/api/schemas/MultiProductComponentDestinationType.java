package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MultiProductComponentDestinationType implements Parcelable {
    UNRECOGNIZED("MultiProductComponentDestinationType_unspecified"),
    BAG_FROM_MERCHANT("bag_from_merchant"),
    CHECKOUT_RECONSIDERATION("checkout_reconsideration"),
    CTA_WITH_DISMISS("cta_with_dismiss"),
    EDITORIAL("editorial"),
    PRODUCTS_FROM_FOLLOWED_BRANDS("products_from_followed_brands"),
    PRODUCTS_FROM_LIKED_MEDIA("products_from_liked_media"),
    PRODUCTS_FROM_SAVED_MEDIA("products_from_saved_media"),
    PROFILE_SHOP_RECONSIDERATION_HSCROLLS_FEED("profile_shop_product_collections_feed"),
    RECENTLY_VIEWED_FROM_MERCHANT("recently_viewed_from_merchant"),
    SAVED("saved"),
    SAVED_FROM_MERCHANT("saved_from_merchant"),
    SAVED_FROM_MERCHANTS("saved_from_merchants");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MultiProductComponentDestinationType[] multiProductComponentDestinationTypeArr;
        A02 = 0oU.A00(multiProductComponentDestinationTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (MultiProductComponentDestinationType multiProductComponentDestinationType : values()) {
            linkedHashMap.put(multiProductComponentDestinationType.A00, multiProductComponentDestinationType);
        }
        A01 = linkedHashMap;
        CREATOR = new FK5(85);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MultiProductComponentDestinationType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
