package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import X.CbC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoOriginalityFollowButtonInfo extends 17P implements OriginalityFollowButtonInfo {
    public static final C3035269k CREATOR = CTB.A00(34);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo, com.instagram.api.schemas.OriginalityFollowButtonInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CbC.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo] */
    public final Boolean BvP() {
        return getOptionalBooleanValueByHashCode(715401370);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo] */
    public final Boolean CYi() {
        return getOptionalBooleanValueByHashCode(961967720);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo] */
    public final OriginalityFollowButtonInfoImpl F7G() {
        return new OriginalityFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(961967720), getOptionalBooleanValueByHashCode(715401370));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalityFollowButtonInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
