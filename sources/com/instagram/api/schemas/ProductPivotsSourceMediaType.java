package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductPivotsSourceMediaType implements Parcelable {
    UNRECOGNIZED("ProductPivotsSourceMediaType_unspecified"),
    FEATURED_PRODUCTS_MEDIA_FEED("featured_products_media_feed"),
    FEATURED_PRODUCTS_MERCHANT_MANAGEMENT("featured_products_merchant_management"),
    FEATURED_PRODUCTS_PDP("featured_products_pdp"),
    FEATURED_PRODUCTS_STOREFRONT("featured_products_storefront"),
    INTEREST_ACCOUNT_POST_WITH_NON_CHECKOUT_SHOP("interest_account_post_with_non_checkout_shop"),
    INTEREST_ACCOUNT_POST_WITH_MENTION("interest_account_post_with_shopping_account_mention"),
    INTEREST_ACCOUNT_POST_WITH_TAG("interest_account_post_with_shopping_account_tag"),
    NON_SHOPPABLE_POST_FROM_NON_CHECKOUT_BUSINESS("non_shoppable_post_from_non_checkout_shopping_account"),
    NON_SHOPPABLE_POST_FROM_BUSINESS("non_shoppable_post_from_shopping_account"),
    SHOPPABLE_POST_FROM_CREATOR("shoppable_post_from_creator");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductPivotsSourceMediaType[] productPivotsSourceMediaTypeArr;
        A02 = 0oU.A00(productPivotsSourceMediaTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (ProductPivotsSourceMediaType productPivotsSourceMediaType : values()) {
            linkedHashMap.put(productPivotsSourceMediaType.A00, productPivotsSourceMediaType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(28);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductPivotsSourceMediaType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
