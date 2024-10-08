package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C46071DLc;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileLabel extends 17P implements ProductTileLabel {
    public static final C3035269k CREATOR = CTB.A00(53);

    public final ProductTileLabelType BKO() {
        return (ProductTileLabelType) A0M(-1649475163, C46071DLc.A00);
    }

    public final ProductTileLayoutContent BLo() {
        return (ProductTileLayoutContent) A05(1966148708, ImmutablePandoProductTileLayoutContent.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductTileLabelImpl F81() {
        ProductTileLayoutContentImpl productTileLayoutContentImpl;
        ProductTileLabelType BKO = BKO();
        ProductTileLayoutContent BLo = BLo();
        if (BLo != null) {
            productTileLayoutContentImpl = BLo.F82();
        } else {
            productTileLayoutContentImpl = null;
        }
        return new ProductTileLabelImpl(BKO, productTileLayoutContentImpl);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileLabel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
