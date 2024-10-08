package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class ShoppingBrandWithProductsImpl extends AnonymousClass0T0 implements Parcelable, ShoppingBrandWithProducts {
    public static final Parcelable.Creator CREATOR = DE6.A00(76);
    public final User A00;
    public final ProductDetailsSellerBadgeContent A01;
    public final ShoppingBrandWithProductsSubtitle A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public final ShoppingBrandWithProductsImpl F90(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingBrandWithProductsImpl) {
                ShoppingBrandWithProductsImpl shoppingBrandWithProductsImpl = (ShoppingBrandWithProductsImpl) obj;
                if (!0qQ.A0K(this.A03, shoppingBrandWithProductsImpl.A03) || !0qQ.A0K(this.A04, shoppingBrandWithProductsImpl.A04) || !0qQ.A0K(this.A05, shoppingBrandWithProductsImpl.A05) || !0qQ.A0K(this.A01, shoppingBrandWithProductsImpl.A01) || !0qQ.A0K(this.A02, shoppingBrandWithProductsImpl.A02) || !0qQ.A0K(this.A00, shoppingBrandWithProductsImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final String Ar0() {
        return this.A03;
    }

    public final List BgX() {
        return this.A04;
    }

    public final List Bga() {
        return this.A05;
    }

    public final User CCd() {
        return this.A00;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return AnonymousClass7TE.A0N(this.A00, (((((AnonymousClass7TF.A07(this.A04, A0O) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public ShoppingBrandWithProductsImpl(ProductDetailsSellerBadgeContent productDetailsSellerBadgeContent, ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle, User user, String str, List list, List list2) {
        AnonymousClass7TG.A1O(str, list);
        0qQ.A0B(user, 6);
        this.A03 = str;
        this.A04 = list;
        this.A05 = list2;
        this.A01 = productDetailsSellerBadgeContent;
        this.A02 = shoppingBrandWithProductsSubtitle;
        this.A00 = user;
    }
}
