package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductMediaType implements Parcelable {
    UNRECOGNIZED("ProductMediaType_unspecified"),
    IG_MEDIA("ig_media"),
    PRODUCT_IMAGE("product_image");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductMediaType[] productMediaTypeArr;
        A02 = 0oU.A00(productMediaTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductMediaType productMediaType : values()) {
            linkedHashMap.put(productMediaType.A00, productMediaType);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(25);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductMediaType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
