package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44544Cge;
import X.CTA;
import X.DN3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoTrackMetadata extends 17P implements TrackMetadata {
    public static final C3035269k CREATOR = CTA.A00(11);

    public final List Ay7() {
        return A0p(1557415452, DN3.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI, com.instagram.api.schemas.TrackMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44544Cge.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long Ay8() {
        return A0L(-1208870349);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final Integer BfI() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final Integer C9r() {
        return getOptionalIntValueByHashCode(513375630);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final Boolean Cde() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI, X.17P] */
    public final TrackMetadataImpl FCw() {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1120317563);
        List Ay7 = Ay7();
        return new TrackMetadataImpl(getOptionalBooleanValueByHashCode(1915067790), getOptionalIntValueByHashCode(-267229226), getOptionalIntValueByHashCode(513375630), A0L(-1208870349), A0i(1181455637), Ay7, booleanValueByHashCode, getBooleanValueByHashCode(1033668234));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final boolean getAllowMediaCreationWithMusic() {
        return getBooleanValueByHashCode(1120317563);
    }

    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoTrackMetadata, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
