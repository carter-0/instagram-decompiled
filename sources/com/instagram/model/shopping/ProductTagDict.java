package com.instagram.model.shopping;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass91G;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.List;

public final class ProductTagDict extends AnonymousClass0T0 implements Parcelable, ProductTagDictIntf {
    public static final Parcelable.Creator CREATOR = new C376399Hv(47);
    public final ProductDetailsProductItemDict A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final List A04;

    public final ProductTagDict FFM(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTagDict) {
                ProductTagDict productTagDict = (ProductTagDict) obj;
                if (!0qQ.A0K(this.A02, productTagDict.A02) || !0qQ.A0K(this.A03, productTagDict.A03) || !0qQ.A0K(this.A01, productTagDict.A01) || !0qQ.A0K(this.A04, productTagDict.A04) || !0qQ.A0K(this.A00, productTagDict.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A03;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A04;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        if (productDetailsProductItemDict != null) {
            i = productDetailsProductItemDict.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Number> list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Number floatValue : list) {
                parcel.writeFloat(floatValue.floatValue());
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final Integer Awa() {
        return this.A02;
    }

    public final Integer BDI() {
        return this.A03;
    }

    public final List Bdo() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A00;
    }

    public final Boolean Caf() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedItemProductTagDict", AnonymousClass91G.A00(this));
    }

    public ProductTagDict(ProductDetailsProductItemDict productDetailsProductItemDict, Boolean bool, Integer num, Integer num2, List list) {
        this.A02 = num;
        this.A03 = num2;
        this.A01 = bool;
        this.A04 = list;
        this.A00 = productDetailsProductItemDict;
    }

    public final ProductTagDictIntf EA4(1E9 r1) {
        return this;
    }
}
