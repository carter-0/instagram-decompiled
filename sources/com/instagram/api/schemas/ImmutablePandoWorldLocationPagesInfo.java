package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import X.HUB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoWorldLocationPagesInfo extends 17P implements WorldLocationPagesInfo {
    public static final C3035269k CREATOR = new CTA(20);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.WorldLocationPagesInfo, com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, HUB.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo] */
    public final Integer Be3() {
        return getOptionalIntValueByHashCode(1946899632);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo] */
    public final WorldLocationPagesInfoImpl FDT() {
        return new WorldLocationPagesInfoImpl(A0i(178851754), getOptionalIntValueByHashCode(1946899632), A0i(36230376));
    }

    public final String getCoverPhoto() {
        return A0i(178851754);
    }

    public final String getWorldId() {
        return A0i(36230376);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
