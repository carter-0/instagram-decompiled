package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileContextImpl extends AnonymousClass0T0 implements Parcelable, ProductTileContext {
    public static final Parcelable.Creator CREATOR = DE6.A00(32);
    public final ProductTileContextMetadata A00;
    public final ProductTileContextVariant A01;
    public final String A02;

    public final ProductTileContextImpl F7y(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileContextImpl) {
                ProductTileContextImpl productTileContextImpl = (ProductTileContextImpl) obj;
                if (!0qQ.A0K(this.A00, productTileContextImpl.A00) || !0qQ.A0K(this.A02, productTileContextImpl.A02) || this.A01 != productTileContextImpl.A01) {
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final ProductTileContextVariant CDY() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0C(this.A00) * 31));
    }

    public ProductTileContextImpl(ProductTileContextMetadata productTileContextMetadata, ProductTileContextVariant productTileContextVariant, String str) {
        AnonymousClass7TG.A1Q(str, productTileContextVariant);
        this.A00 = productTileContextMetadata;
        this.A02 = str;
        this.A01 = productTileContextVariant;
    }
}
