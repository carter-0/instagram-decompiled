package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum SellerBadgeSurfaces implements Parcelable {
    UNRECOGNIZED("SellerBadgeSurfaces_unspecified"),
    PDP_ABOUT_THIS_SHOP("PDP_ABOUT_THIS_SHOP"),
    PRODUCT_DESCRIPTION_PAGE("PRODUCT_DESCRIPTION_PAGE"),
    SHOPS_DIRECTORY("SHOPS_DIRECTORY"),
    SHOP_TAB("SHOP_TAB");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        SellerBadgeSurfaces[] sellerBadgeSurfacesArr;
        A02 = 0oU.A00(sellerBadgeSurfacesArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (SellerBadgeSurfaces sellerBadgeSurfaces : values()) {
            linkedHashMap.put(sellerBadgeSurfaces.A00, sellerBadgeSurfaces);
        }
        A01 = linkedHashMap;
        CREATOR = new DE6(73);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    SellerBadgeSurfaces(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
