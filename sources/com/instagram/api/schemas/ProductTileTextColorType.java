package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileTextColorType implements Parcelable {
    UNRECOGNIZED("ProductTileTextColorType_unspecified"),
    PRIMARY_BUTTON("primary_button"),
    PRIMARY_TEXT("primary_text");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileTextColorType[] productTileTextColorTypeArr;
        A02 = 0oU.A00(productTileTextColorTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ProductTileTextColorType productTileTextColorType : values()) {
            A0x.put(productTileTextColorType.A00, productTileTextColorType);
        }
        A01 = A0x;
        CREATOR = new DE6(45);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileTextColorType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
