package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CWZ;
import X.DKT;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCreatorDigestSignalInfo extends 17P implements CreatorDigestSignalInfo {
    public static final C3035269k CREATOR = CTC.A00(44);

    public final InspirationSignalType BwM() {
        return (InspirationSignalType) A0N(673104497, DKT.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorDigestSignalInfo, com.instagram.api.schemas.CreatorDigestSignalInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWZ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final CreatorDigestSignalInfoImpl F2H() {
        return new CreatorDigestSignalInfoImpl(BwM(), A0U(), A0Y());
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCreatorDigestSignalInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
