package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44125CWq;
import X.C46044DKb;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorViewerSignalInfo extends 17P implements CreatorViewerSignalInfo {
    public static final C3035269k CREATOR = CTC.A00(50);

    public final CreatorViewerSignalType BwL() {
        return (CreatorViewerSignalType) A0M(673104497, C46044DKb.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CreatorViewerSignalInfo, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44125CWq.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorViewerSignalInfoImpl F2T() {
        return new CreatorViewerSignalInfoImpl(BwL(), A0P());
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
