package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CXR;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoEventPageNavigationMetadata extends 17P implements EventPageNavigationMetadata {
    public static final C3035269k CREATOR = CTC.A00(64);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata, com.instagram.api.schemas.EventPageNavigationMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CXR.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata] */
    public final Integer BlS() {
        return getOptionalIntValueByHashCode(458282754);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata] */
    public final EventPageNavigationMetadataImpl F2m() {
        return new EventPageNavigationMetadataImpl(A0T(), getOptionalIntValueByHashCode(458282754), A0U());
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getSubtitle() {
        return A0U();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
