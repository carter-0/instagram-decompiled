package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C46070DLb;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions extends 17P implements ProductTileFeaturedProductPermissionInfoLabelOptions {
    public static final C3035269k CREATOR = CTB.A00(52);

    public final ProductTileTextStyleType C28() {
        return (ProductTileTextStyleType) A0M(140120328, C46070DLb.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BzQ() {
        return A0h(-891202214);
    }

    public final ProductTileFeaturedProductPermissionInfoLabelOptionsImpl F80() {
        return new ProductTileFeaturedProductPermissionInfoLabelOptionsImpl(C28(), A0h(-891202214));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileFeaturedProductPermissionInfoLabelOptions] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
