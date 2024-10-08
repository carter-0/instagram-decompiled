package com.instagram.model.shopping.reels;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C44940Cna;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ImmutablePandoReelProductLink extends 17P implements ReelProductLinkIntf {
    public static final C3035269k CREATOR = CTA.A00(61);
    public ProductDetailsProductItemDictIntf A00;

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final ReelProductLinkIntf EAD(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    public final ReelProductLink FFq(1E9 r3) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r3);
        } else {
            productDetailsProductItemDict = null;
        }
        return new ReelProductLink(productDetailsProductItemDict);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.reels.ImmutablePandoReelProductLink, com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ReelProductLinkIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44940Cna.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ReelProductLink FFr(1E6 r2) {
        return FFq(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.model.shopping.reels.ImmutablePandoReelProductLink, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
