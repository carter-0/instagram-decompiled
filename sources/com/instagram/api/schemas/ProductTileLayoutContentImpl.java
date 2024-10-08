package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileLayoutContentImpl extends AnonymousClass0T0 implements Parcelable, ProductTileLayoutContent {
    public static final Parcelable.Creator CREATOR = DE6.A00(38);
    public final ProductTileFeaturedProductPermissionInfoLabelOptions A00;
    public final ProductTilePriceLabelOptions A01;
    public final ProductTileProductNameLabelOptions A02;

    public final ProductTileLayoutContentImpl F82() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileLayoutContentImpl) {
                ProductTileLayoutContentImpl productTileLayoutContentImpl = (ProductTileLayoutContentImpl) obj;
                if (!0qQ.A0K(this.A00, productTileLayoutContentImpl.A00) || !0qQ.A0K(this.A01, productTileLayoutContentImpl.A01) || !0qQ.A0K(this.A02, productTileLayoutContentImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public final ProductTileFeaturedProductPermissionInfoLabelOptions B4v() {
        return this.A00;
    }

    public final ProductTilePriceLabelOptions BfJ() {
        return this.A01;
    }

    public final ProductTileProductNameLabelOptions BgM() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public ProductTileLayoutContentImpl(ProductTileFeaturedProductPermissionInfoLabelOptions productTileFeaturedProductPermissionInfoLabelOptions, ProductTilePriceLabelOptions productTilePriceLabelOptions, ProductTileProductNameLabelOptions productTileProductNameLabelOptions) {
        this.A00 = productTileFeaturedProductPermissionInfoLabelOptions;
        this.A01 = productTilePriceLabelOptions;
        this.A02 = productTileProductNameLabelOptions;
    }
}
