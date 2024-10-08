package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import X.DLZ;
import android.os.Parcel;

public final class ImmutablePandoProductTileBannerMetadataDecoration extends 17P implements ProductTileBannerMetadataDecoration {
    public static final C3035269k CREATOR = CTB.A00(49);

    public final ProductTileBannerType AfH() {
        return (ProductTileBannerType) A0M(-1906809747, DLZ.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AfG() {
        return A0h(-1906828704);
    }

    public final ProductTileBannerMetadataDecorationImpl F7x() {
        return new ProductTileBannerMetadataDecorationImpl(AfH(), A0h(-1906828704));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileBannerMetadataDecoration] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
