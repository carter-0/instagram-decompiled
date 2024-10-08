package com.instagram.model.shopping.productimagecontainer;

import X.17P;
import X.AnonymousClass7TH;
import X.AnonymousClass91I;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;

public final class ImmutablePandoProductImageContainer extends 17P implements ProductImageContainer {
    public static final C3035269k CREATOR = CTA.A00(53);

    public final ImageInfo BGO() {
        return (ImageInfo) A04(-1876344045, ImmutablePandoImageInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productimagecontainer.ProductImageContainer, com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, AnonymousClass91I.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductImageContainerImpl FFc() {
        return new ProductImageContainerImpl(BGO().FEa(), A0i(-318184504));
    }

    public final String getPreview() {
        return A0i(-318184504);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
