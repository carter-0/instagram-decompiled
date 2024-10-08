package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44112CWd;
import X.CTC;
import X.DKV;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerBottomCTA extends 17P implements CreatorViewerBottomCTA {
    public static final C3035269k CREATOR = CTC.A00(45);

    public final CreatorViewerBottomCTAType AhL() {
        return (CreatorViewerBottomCTAType) A0M(1278830493, DKV.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA, com.instagram.api.schemas.CreatorViewerBottomCTA] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44112CWd.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerBottomCTAImpl F2J() {
        return new CreatorViewerBottomCTAImpl(AhL(), A0P());
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
