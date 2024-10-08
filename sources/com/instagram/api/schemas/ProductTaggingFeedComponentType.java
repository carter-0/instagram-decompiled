package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTaggingFeedComponentType implements Parcelable {
    UNRECOGNIZED("ProductTaggingFeedComponentType_unspecified"),
    BLOKS("bloks"),
    COMMERCE_ITEM("commerce_item"),
    DIVIDER("divider"),
    EXPANSION("expansion"),
    NULL_STATE("null_state"),
    TEXT_WITH_ENTITIES_BLOCK("text_with_entities_block");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTaggingFeedComponentType[] productTaggingFeedComponentTypeArr;
        A02 = 0oU.A00(productTaggingFeedComponentTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductTaggingFeedComponentType productTaggingFeedComponentType : values()) {
            linkedHashMap.put(productTaggingFeedComponentType.A00, productTaggingFeedComponentType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(29);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTaggingFeedComponentType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
