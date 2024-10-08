package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44524CgK;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoTextPostAppUserFediverseInfo extends 17P implements TextPostAppUserFediverseInfo {
    public static final C3035269k CREATOR = CTA.A00(8);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.TextPostAppUserFediverseInfo, com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44524CgK.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo] */
    public final Integer C5L() {
        return getOptionalIntValueByHashCode(1155122860);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo] */
    public final Integer C5M() {
        return getOptionalIntValueByHashCode(526864360);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo] */
    public final TextPostAppUserFediverseInfoImpl FCh() {
        return new TextPostAppUserFediverseInfoImpl(getOptionalIntValueByHashCode(1155122860), getOptionalIntValueByHashCode(526864360));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTextPostAppUserFediverseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
