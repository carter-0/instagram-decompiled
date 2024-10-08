package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44240Cbb;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoPopularReelWithFollowersInsightMetadata extends 17P implements PopularReelWithFollowersInsightMetadata {
    public static final C3035269k CREATOR = CTB.A00(40);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44240Cbb.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final List BQJ() {
        return A0n(2140775389);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final PopularReelWithFollowersInsightMetadataImpl F7a() {
        return new PopularReelWithFollowersInsightMetadataImpl(A0n(2140775389), getIntValueByHashCode(-792455577), getIntValueByHashCode(1911031876), getIntValueByHashCode(1456374940));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final int getLikeCount() {
        return getIntValueByHashCode(-792455577);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final int getPlayCount() {
        return getIntValueByHashCode(1911031876);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final int getReshareCount() {
        return getIntValueByHashCode(1456374940);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
