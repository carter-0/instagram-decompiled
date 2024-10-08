package com.instagram.model.shopping.productfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass57K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.user.model.User;

public final class ProductCollectionTile extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(16);
    public ProductCollectionCoverImpl A00 = null;
    public AnonymousClass57K A01 = null;
    public User A02 = null;
    public Long A03 = null;
    public String A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionTile) {
                ProductCollectionTile productCollectionTile = (ProductCollectionTile) obj;
                if (!0qQ.A0K(this.A04, productCollectionTile.A04) || this.A01 != productCollectionTile.A01 || !0qQ.A0K(this.A05, productCollectionTile.A05) || !0qQ.A0K(this.A07, productCollectionTile.A07) || !0qQ.A0K(this.A06, productCollectionTile.A06) || !0qQ.A0K(this.A02, productCollectionTile.A02) || !0qQ.A0K(this.A00, productCollectionTile.A00) || !0qQ.A0K(this.A03, productCollectionTile.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        AnonymousClass57K r1 = this.A01;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, r1);
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        C41848B3p.A1K(parcel, this.A03);
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }
}
