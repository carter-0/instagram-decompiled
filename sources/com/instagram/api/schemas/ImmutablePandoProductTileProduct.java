package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C45266CtV;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileProduct extends 17P implements ProductTileProduct {
    public static final C3035269k CREATOR = CTB.A00(58);

    public final /* synthetic */ C45266CtV AKL() {
        return new C45266CtV(this);
    }

    public final FBProductItemDetailsDict B4U() {
        return (FBProductItemDetailsDict) A05(-1852636052, ImmutablePandoFBProductItemDetailsDict.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileProduct] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
