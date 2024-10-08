package com.instagram.guides.intf.model;

import X.2Ob;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.simpleplace.SimplePlace;
import com.instagram.user.model.Product;
import java.util.Arrays;
import java.util.List;

public class MinimalGuideItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(67);
    public SimplePlace A00;
    public Product A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MinimalGuideItem)) {
            return false;
        }
        MinimalGuideItem minimalGuideItem = (MinimalGuideItem) obj;
        return 2Ob.A00(this.A03, minimalGuideItem.A03) && 2Ob.A00(this.A04, minimalGuideItem.A04) && 2Ob.A00(this.A02, minimalGuideItem.A02) && 2Ob.A00(this.A05, minimalGuideItem.A05) && 2Ob.A00(this.A01, minimalGuideItem.A01) && 2Ob.A00(this.A00, minimalGuideItem.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A02, this.A05, this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
