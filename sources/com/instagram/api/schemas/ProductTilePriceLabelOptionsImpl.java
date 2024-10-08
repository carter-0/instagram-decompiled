package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTilePriceLabelOptionsImpl extends AnonymousClass0T0 implements Parcelable, ProductTilePriceLabelOptions {
    public static final Parcelable.Creator CREATOR = DE6.A00(42);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final ProductTilePriceLabelOptionsImpl F84() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTilePriceLabelOptionsImpl) {
                ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl = (ProductTilePriceLabelOptionsImpl) obj;
                if (!(this.A00 == productTilePriceLabelOptionsImpl.A00 && this.A01 == productTilePriceLabelOptionsImpl.A01 && this.A02 == productTilePriceLabelOptionsImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final boolean BvB() {
        return this.A00;
    }

    public final boolean BvC() {
        return this.A01;
    }

    public final boolean Bvy() {
        return this.A02;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int A09 = AnonymousClass7TF.A09(this.A01, i * 31);
        int i2 = 1237;
        if (this.A02) {
            i2 = 1231;
        }
        return A09 + i2;
    }

    public ProductTilePriceLabelOptionsImpl(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
