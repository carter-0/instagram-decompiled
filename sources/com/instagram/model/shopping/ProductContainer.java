package com.instagram.model.shopping;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.UnavailableProductImpl;

public final class ProductContainer extends AnonymousClass0T0 implements Parcelable {
    public static final C71269Ogb CREATOR = new C71269Ogb(83);
    public ProductDetailsProductItemDict A00 = null;
    public UnavailableProductImpl A01 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductContainer) {
                ProductContainer productContainer = (ProductContainer) obj;
                if (!0qQ.A0K(this.A00, productContainer.A00) || !0qQ.A0K(this.A01, productContainer.A01)) {
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

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductContainer(product=");
        sb.append(this.A00);
        sb.append(", unavailableProduct=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}
