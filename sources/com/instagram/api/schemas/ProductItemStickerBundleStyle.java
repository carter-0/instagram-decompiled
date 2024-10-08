package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductItemStickerBundleStyle implements Parcelable {
    UNRECOGNIZED("ProductItemStickerBundleStyle_unspecified"),
    MULTI_PRODUCT_ITEM_TEXT_STICKER_BLACK_WHITE_ID("multi_product_item_text_sticker_black_white"),
    MULTI_PRODUCT_ITEM_TEXT_STICKER_MEDIA_PRIMARY_COLOR_ID("multi_product_item_text_sticker_media_primary_color"),
    MULTI_PRODUCT_ITEM_TEXT_STICKER_SUBTLE_ID("multi_product_item_text_sticker_subtle"),
    MULTI_PRODUCT_ITEM_TEXT_STICKER_VIBRANT_ID("multi_product_item_text_sticker_vibrant"),
    PRODUCT_ITEM_DROPS_REMINDER_STICKER_ID("product_item_drops_reminder_sticker"),
    PRODUCT_ITEM_DROPS_RESHARE_STICKER_ID("product_item_drops_reshare_sticker"),
    PRODUCT_ITEM_LIST_CELL_STICKER_BLACK_WHITE_ID("product_item_list_cell_sticker_black_white"),
    PRODUCT_ITEM_LIST_CELL_STICKER_SUBTLE_ID("product_item_list_cell_sticker_subtle"),
    PRODUCT_ITEM_TEXT_STICKER_BLACK_WHITE_ID("product_item_text_sticker_black_white"),
    PRODUCT_ITEM_TEXT_STICKER_MEDIA_PRIMARY_COLOR_ID("product_item_text_sticker_media_primary_color"),
    PRODUCT_ITEM_TEXT_STICKER_SUBTLE_ID("product_item_text_sticker_subtle"),
    PRODUCT_ITEM_TEXT_STICKER_VIBRANT_ID("product_item_text_sticker_vibrant"),
    PRODUCT_ITEM_TILE_STICKER_BLACK_WHITE_ID("product_item_tile_sticker_black_white");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductItemStickerBundleStyle[] productItemStickerBundleStyleArr;
        A02 = 0oU.A00(productItemStickerBundleStyleArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductItemStickerBundleStyle productItemStickerBundleStyle : values()) {
            linkedHashMap.put(productItemStickerBundleStyle.A00, productItemStickerBundleStyle);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(24);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductItemStickerBundleStyle(String str) {
        this.A00 = str;
    }
}
