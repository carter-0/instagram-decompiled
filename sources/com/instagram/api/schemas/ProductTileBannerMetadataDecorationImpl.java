package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileBannerMetadataDecorationImpl extends AnonymousClass0T0 implements Parcelable, ProductTileBannerMetadataDecoration {
    public static final Parcelable.Creator CREATOR = DE6.A00(30);
    public final ProductTileBannerType A00;
    public final String A01;

    public final ProductTileBannerMetadataDecorationImpl F7x() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileBannerMetadataDecorationImpl) {
                ProductTileBannerMetadataDecorationImpl productTileBannerMetadataDecorationImpl = (ProductTileBannerMetadataDecorationImpl) obj;
                if (!0qQ.A0K(this.A01, productTileBannerMetadataDecorationImpl.A01) || this.A00 != productTileBannerMetadataDecorationImpl.A00) {
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

    public final String AfG() {
        return this.A01;
    }

    public final ProductTileBannerType AfH() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public ProductTileBannerMetadataDecorationImpl(ProductTileBannerType productTileBannerType, String str) {
        AnonymousClass7TG.A1O(str, productTileBannerType);
        this.A01 = str;
        this.A00 = productTileBannerType;
    }
}
