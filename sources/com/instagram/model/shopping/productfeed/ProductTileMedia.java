package com.instagram.model.shopping.productfeed;

import X.2PP;
import X.AnonymousClass7TE;
import X.C51971G9r;
import X.JTR;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.user.model.User;

public final class ProductTileMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(20);
    public ImageInfoImpl A00;
    public User A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTileMedia)) {
            return false;
        }
        ProductTileMedia productTileMedia = (ProductTileMedia) obj;
        return 2PP.A00(this.A02, productTileMedia.A02) && 2PP.A00(this.A00, productTileMedia.A00) && 2PP.A00(this.A03, productTileMedia.A03) && 2PP.A00(this.A01, productTileMedia.A01);
    }

    public final int hashCode() {
        int i = 0;
        int A0O = (((AnonymousClass7TE.A0O(this.A02) + C51971G9r.A0E(this.A00)) * 31) + JTR.A0G(this.A03)) * 31;
        User user = this.A01;
        if (user != null) {
            i = user.hashCode();
        }
        return A0O + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductTileMedia(ImageInfo imageInfo, User user, String str, String str2) {
        ImageInfoImpl imageInfoImpl;
        this.A02 = str;
        if (imageInfo != null) {
            imageInfoImpl = imageInfo.FEa();
        } else {
            imageInfoImpl = null;
        }
        this.A00 = imageInfoImpl;
        this.A03 = str2;
        this.A01 = user;
    }

    public ProductTileMedia() {
    }
}
