package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import X.V80;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoPrivacyDisclosureInfo extends 17P implements PrivacyDisclosureInfo {
    public static final C3035269k CREATOR = new CTB(41);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPrivacyDisclosureInfo, com.instagram.api.schemas.PrivacyDisclosureInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V80.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B43() {
        return A0i(-599624620);
    }

    public final String Bfo() {
        return A0i(1629792697);
    }

    public final PrivacyDisclosureInfoImpl F7i() {
        return new PrivacyDisclosureInfoImpl(A0i(-599624620), A0i(1629792697));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPrivacyDisclosureInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
