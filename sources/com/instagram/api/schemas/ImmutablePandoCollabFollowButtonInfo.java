package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.B4W;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCollabFollowButtonInfo extends 17P implements CollabFollowButtonInfo {
    public static final C3035269k CREATOR = CTC.A00(32);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CollabFollowButtonInfo, com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4W.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo] */
    public final Boolean BvQ() {
        return getOptionalBooleanValueByHashCode(-1754088002);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo] */
    public final Boolean CYn() {
        return getOptionalBooleanValueByHashCode(-581624414);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo] */
    public final CollabFollowButtonInfoImpl F1q() {
        return new CollabFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(-581624414), getOptionalBooleanValueByHashCode(-1754088002));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCollabFollowButtonInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
