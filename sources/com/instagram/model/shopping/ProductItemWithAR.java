package com.instagram.model.shopping;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.C71269Ogb;
import X.Cn3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ProductItemWithAR extends AnonymousClass0T0 implements Parcelable, ProductItemWithARIntf {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(86);
    public final ProductArEffectMetadata A00;
    public final ProductDetailsProductItemDict A01;

    public ProductItemWithAR(ProductArEffectMetadata productArEffectMetadata, ProductDetailsProductItemDict productDetailsProductItemDict) {
        0qQ.A0B(productArEffectMetadata, 1);
        0qQ.A0B(productDetailsProductItemDict, 2);
        this.A00 = productArEffectMetadata;
        this.A01 = productDetailsProductItemDict;
    }

    public final ProductItemWithAR FFK(1E9 r1) {
        return this;
    }

    public final ProductItemWithAR FFL(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductItemWithAR) {
                ProductItemWithAR productItemWithAR = (ProductItemWithAR) obj;
                if (!0qQ.A0K(this.A00, productItemWithAR.A00) || !0qQ.A0K(this.A01, productItemWithAR.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final /* bridge */ /* synthetic */ ProductArEffectMetadataIntf AcJ() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf BgJ() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProductItemWithARDict", Cn3.A00(this));
    }

    public final ProductItemWithARIntf EA3(1E9 r1) {
        return this;
    }
}
