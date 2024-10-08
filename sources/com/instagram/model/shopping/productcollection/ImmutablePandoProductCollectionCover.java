package com.instagram.model.shopping.productcollection;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44923CnG;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;

public final class ImmutablePandoProductCollectionCover extends 17P implements ProductCollectionCover {
    public static final C3035269k CREATOR = CTA.A00(51);

    public final ProductImageContainer BFw() {
        return (ProductImageContainer) A05(100313435, ImmutablePandoProductImageContainer.class);
    }

    public final IgShowreelNativeAnimationIntf BwB() {
        return (IgShowreelNativeAnimationIntf) A05(-824538620, ImmutablePandoIgShowreelNativeAnimation.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ProductCollectionCover, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionCover] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44923CnG.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductCollectionCoverImpl FFa() {
        ProductImageContainerImpl productImageContainerImpl;
        ProductImageContainer BFw = BFw();
        IgShowreelNativeAnimation igShowreelNativeAnimation = null;
        if (BFw != null) {
            productImageContainerImpl = BFw.FFc();
        } else {
            productImageContainerImpl = null;
        }
        IgShowreelNativeAnimationIntf BwB = BwB();
        if (BwB != null) {
            igShowreelNativeAnimation = BwB.FFy();
        }
        return new ProductCollectionCoverImpl(productImageContainerImpl, igShowreelNativeAnimation);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionCover] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
