package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileTextStyleType implements Parcelable {
    UNRECOGNIZED("ProductTileTextStyleType_unspecified"),
    BODY_1("body_1"),
    BODY_1_EMPHASIZED("body_1_emphasized"),
    ERROR("error");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileTextStyleType[] productTileTextStyleTypeArr;
        A02 = 0oU.A00(productTileTextStyleTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductTileTextStyleType productTileTextStyleType : values()) {
            linkedHashMap.put(productTileTextStyleType.A00, productTileTextStyleType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(46);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileTextStyleType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
