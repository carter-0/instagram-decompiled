package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileLayoutContent extends 17P implements ProductTileLayoutContent {
    public static final C3035269k CREATOR = CTB.A00(54);

    public final ProductTileFeaturedProductPermissionInfoLabelOptions B4v() {
        return (ProductTileFeaturedProductPermissionInfoLabelOptions) A05(671401149, ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions.class);
    }

    public final ProductTilePriceLabelOptions BfJ() {
        return (ProductTilePriceLabelOptions) A05(106934601, ImmutablePandoProductTilePriceLabelOptions.class);
    }

    public final ProductTileProductNameLabelOptions BgM() {
        return (ProductTileProductNameLabelOptions) A05(1014375387, ImmutablePandoProductTileProductNameLabelOptions.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductTileLayoutContentImpl F82() {
        ProductTileFeaturedProductPermissionInfoLabelOptionsImpl productTileFeaturedProductPermissionInfoLabelOptionsImpl;
        ProductTilePriceLabelOptionsImpl productTilePriceLabelOptionsImpl;
        ProductTileFeaturedProductPermissionInfoLabelOptions B4v = B4v();
        ProductTileProductNameLabelOptionsImpl productTileProductNameLabelOptionsImpl = null;
        if (B4v != null) {
            productTileFeaturedProductPermissionInfoLabelOptionsImpl = B4v.F80();
        } else {
            productTileFeaturedProductPermissionInfoLabelOptionsImpl = null;
        }
        ProductTilePriceLabelOptions BfJ = BfJ();
        if (BfJ != null) {
            productTilePriceLabelOptionsImpl = BfJ.F84();
        } else {
            productTilePriceLabelOptionsImpl = null;
        }
        ProductTileProductNameLabelOptions BgM = BgM();
        if (BgM != null) {
            productTileProductNameLabelOptionsImpl = BgM.F85();
        }
        return new ProductTileLayoutContentImpl(productTileFeaturedProductPermissionInfoLabelOptionsImpl, productTilePriceLabelOptionsImpl, productTileProductNameLabelOptionsImpl);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileLayoutContent] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
