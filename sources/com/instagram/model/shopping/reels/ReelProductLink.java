package com.instagram.model.shopping.reels;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.C44940Cna;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ReelProductLink extends AnonymousClass0T0 implements Parcelable, ReelProductLinkIntf {
    public static final Parcelable.Creator CREATOR = new LVO(33);
    public final ProductDetailsProductItemDict A00;

    public final ReelProductLink FFq(1E9 r1) {
        return this;
    }

    public final ReelProductLink FFr(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReelProductLink) && 0qQ.A0K(this.A00, ((ReelProductLink) obj).A00));
    }

    public final int hashCode() {
        ProductDetailsProductItemDict productDetailsProductItemDict = this.A00;
        if (productDetailsProductItemDict == null) {
            return 0;
        }
        return productDetailsProductItemDict.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bfu() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAProductLink", C44940Cna.A00(this));
    }

    public ReelProductLink(ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = productDetailsProductItemDict;
    }

    public final ReelProductLinkIntf EAD(1E9 r1) {
        return this;
    }
}
