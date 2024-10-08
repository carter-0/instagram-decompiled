package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileProductNameLabelOptionsImpl extends AnonymousClass0T0 implements Parcelable, ProductTileProductNameLabelOptions {
    public static final Parcelable.Creator CREATOR = DE6.A00(44);
    public final int A00;
    public final boolean A01;

    public final ProductTileProductNameLabelOptionsImpl F85() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileProductNameLabelOptionsImpl) {
                ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = (ProductTileProductNameLabelOptionsImpl) obj;
                if (!(this.A00 == productTileProductNameLabelOptionsImpl.A00 && this.A01 == productTileProductNameLabelOptionsImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int BWx() {
        return this.A00;
    }

    public final boolean BvB() {
        return this.A01;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public ProductTileProductNameLabelOptionsImpl(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
