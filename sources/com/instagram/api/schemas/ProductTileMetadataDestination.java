package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ProductTileMetadataDestination implements Parcelable {
    UNRECOGNIZED("ProductTileMetadataDestination_unspecified"),
    MEDIA_CHAIN("MEDIA_CHAIN"),
    PRODUCT_DETAILS_PAGE("PRODUCT_DETAILS_PAGE");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ProductTileMetadataDestination[] productTileMetadataDestinationArr;
        A02 = 0oU.A00(productTileMetadataDestinationArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ProductTileMetadataDestination productTileMetadataDestination : values()) {
            linkedHashMap.put(productTileMetadataDestination.A00, productTileMetadataDestination);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(40);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ProductTileMetadataDestination(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
