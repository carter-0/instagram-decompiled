package com.instagram.shopping.model.collection;

import X.00k;
import X.0qQ;
import X.2SP;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class ProductCollectionShareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(48);
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public ProductCollectionShareInfo(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        0qQ.A0B(str4, 4);
        0qQ.A0B(str5, 5);
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A01 = imageUrl;
        this.A05 = str6;
        this.A03 = str7;
        this.A02 = imageUrl2;
        this.A0A = list;
        if (imageUrl == null) {
            if (list != null) {
                imageUrl = (ImageUrl) 00k.A0H(list, 2SP.A00);
            } else {
                imageUrl = null;
            }
        }
        this.A00 = imageUrl;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        List<Parcelable> list = this.A0A;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
