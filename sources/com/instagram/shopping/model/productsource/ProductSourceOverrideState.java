package com.instagram.shopping.model.productsource;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.ProductSource;

public final class ProductSourceOverrideState extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(54);
    public final ProductSource A00;
    public final ProductSourceOverrideStatus A01;
    public final String A02;

    public ProductSourceOverrideState(ProductSource productSource, ProductSourceOverrideStatus productSourceOverrideStatus, String str) {
        0qQ.A0B(productSourceOverrideStatus, 1);
        this.A01 = productSourceOverrideStatus;
        this.A02 = str;
        this.A00 = productSource;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductSourceOverrideState) {
                ProductSourceOverrideState productSourceOverrideState = (ProductSourceOverrideState) obj;
                if (this.A01 != productSourceOverrideState.A01 || !0qQ.A0K(this.A02, productSourceOverrideState.A02) || !0qQ.A0K(this.A00, productSourceOverrideState.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
