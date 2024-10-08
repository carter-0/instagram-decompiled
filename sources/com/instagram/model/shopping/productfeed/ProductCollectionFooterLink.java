package com.instagram.model.shopping.productfeed;

import X.2PP;
import X.AnonymousClass47L;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ProductCollectionFooterLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVO.A00(14);
    public AnonymousClass47L A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCollectionFooterLink)) {
            return false;
        }
        ProductCollectionFooterLink productCollectionFooterLink = (ProductCollectionFooterLink) obj;
        return 2PP.A00(this.A00, productCollectionFooterLink.A00) && 2PP.A00(this.A02, productCollectionFooterLink.A02) && 2PP.A00(this.A01, productCollectionFooterLink.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
