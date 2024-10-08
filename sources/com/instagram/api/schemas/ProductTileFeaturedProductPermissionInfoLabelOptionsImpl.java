package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileFeaturedProductPermissionInfoLabelOptionsImpl extends AnonymousClass0T0 implements Parcelable, ProductTileFeaturedProductPermissionInfoLabelOptions {
    public static final Parcelable.Creator CREATOR = DE6.A00(35);
    public final ProductTileTextStyleType A00;
    public final String A01;

    public final ProductTileFeaturedProductPermissionInfoLabelOptionsImpl F80() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileFeaturedProductPermissionInfoLabelOptionsImpl) {
                ProductTileFeaturedProductPermissionInfoLabelOptionsImpl productTileFeaturedProductPermissionInfoLabelOptionsImpl = (ProductTileFeaturedProductPermissionInfoLabelOptionsImpl) obj;
                if (!0qQ.A0K(this.A01, productTileFeaturedProductPermissionInfoLabelOptionsImpl.A01) || this.A00 != productTileFeaturedProductPermissionInfoLabelOptionsImpl.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final String BzQ() {
        return this.A01;
    }

    public final ProductTileTextStyleType C28() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public ProductTileFeaturedProductPermissionInfoLabelOptionsImpl(ProductTileTextStyleType productTileTextStyleType, String str) {
        AnonymousClass7TG.A1O(str, productTileTextStyleType);
        this.A01 = str;
        this.A00 = productTileTextStyleType;
    }
}
