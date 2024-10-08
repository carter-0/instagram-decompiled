package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ProductWithMediaImageImpl extends AnonymousClass0T0 implements Parcelable, ProductWithMediaImage {
    public static final Parcelable.Creator CREATOR = DE6.A00(49);
    public final ProductDetailsProductItemDict A00;

    public ProductWithMediaImageImpl(ProductDetailsProductItemDict productDetailsProductItemDict) {
        0qQ.A0B(productDetailsProductItemDict, 1);
        this.A00 = productDetailsProductItemDict;
    }

    public final ProductWithMediaImageImpl F87(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductWithMediaImageImpl) && 0qQ.A0K(this.A00, ((ProductWithMediaImageImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BSv() {
        return this.A00;
    }
}
