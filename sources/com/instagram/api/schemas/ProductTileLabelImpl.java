package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileLabelImpl extends AnonymousClass0T0 implements Parcelable, ProductTileLabel {
    public static final Parcelable.Creator CREATOR = DE6.A00(36);
    public final ProductTileLabelType A00;
    public final ProductTileLayoutContent A01;

    public ProductTileLabelImpl(ProductTileLabelType productTileLabelType, ProductTileLayoutContent productTileLayoutContent) {
        0qQ.A0B(productTileLabelType, 1);
        this.A00 = productTileLabelType;
        this.A01 = productTileLayoutContent;
    }

    public final ProductTileLabelImpl F81() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileLabelImpl) {
                ProductTileLabelImpl productTileLabelImpl = (ProductTileLabelImpl) obj;
                if (this.A00 != productTileLabelImpl.A00 || !0qQ.A0K(this.A01, productTileLabelImpl.A01)) {
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
    }

    public final ProductTileLabelType BKO() {
        return this.A00;
    }

    public final ProductTileLayoutContent BLo() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
