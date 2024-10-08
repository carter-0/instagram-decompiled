package com.instagram.model.shopping;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.model.shopping.sizechart.SizeChart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class ProductVariantDimension implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(89);
    public ProductVariantVisualStyle A00;
    public SizeChart A01;
    public String A02;
    public String A03;
    public List A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductVariantDimension) {
            ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj;
            if (this.A02.equals(productVariantDimension.A02) && this.A03.equals(productVariantDimension.A03) && this.A00 == productVariantDimension.A00) {
                return this.A05.equals(productVariantDimension.A05);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02))) + this.A05.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A05);
        parcel.writeSerializable(this.A00);
    }

    public ProductVariantDimension(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A03 = readString2;
        parcel.readStringList(arrayList);
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A00 = (ProductVariantVisualStyle) readSerializable;
    }

    public ProductVariantDimension() {
        this.A05 = new ArrayList();
    }
}
