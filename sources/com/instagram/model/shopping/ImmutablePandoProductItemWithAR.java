package com.instagram.model.shopping;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.CTA;
import X.Cn3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ImmutablePandoProductItemWithAR extends 17P implements ProductItemWithARIntf {
    public static final C3035269k CREATOR = CTA.A00(40);
    public ProductDetailsProductItemDictIntf A00;

    public final ProductArEffectMetadataIntf AcJ() {
        return (ProductArEffectMetadataIntf) A04(-812513777, ImmutablePandoProductArEffectMetadata.class);
    }

    public final ProductDetailsProductItemDictIntf BgJ() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A04(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductItemWithAR, com.instagram.model.shopping.ProductItemWithARIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Cn3.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductItemWithARIntf EA3(1E9 r2) {
        ProductDetailsProductItemDictIntf BgJ = BgJ();
        BgJ.EAY(r2);
        this.A00 = BgJ;
        return this;
    }

    public final ProductItemWithAR FFK(1E9 r4) {
        return new ProductItemWithAR(AcJ().FFJ(), BgJ().FGq(r4));
    }

    public final ProductItemWithAR FFL(1E6 r2) {
        return FFK(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.ImmutablePandoProductItemWithAR] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
