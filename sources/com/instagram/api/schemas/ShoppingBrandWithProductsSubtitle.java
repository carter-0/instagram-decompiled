package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShoppingBrandWithProductsSubtitle extends AnonymousClass0T0 implements Parcelable, ShoppingBrandWithProductsSubtitleIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(77);
    public final String A00;
    public final boolean A01;

    public ShoppingBrandWithProductsSubtitle(boolean z, String str) {
        0qQ.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    public final ShoppingBrandWithProductsSubtitle F91() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingBrandWithProductsSubtitle) {
                ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = (ShoppingBrandWithProductsSubtitle) obj;
                if (this.A01 != shoppingBrandWithProductsSubtitle.A01 || !0qQ.A0K(this.A00, shoppingBrandWithProductsSubtitle.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return C41845B3m.A01(this.A00, i * 31);
    }
}
