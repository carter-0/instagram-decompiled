package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41874B4s;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoClipsMashupFollowButtonInfo extends 17P implements ClipsMashupFollowButtonInfo {
    public static final C3035269k CREATOR = CTC.A00(29);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo, com.instagram.api.schemas.ClipsMashupFollowButtonInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41874B4s.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo] */
    public final Boolean BvP() {
        return getOptionalBooleanValueByHashCode(715401370);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo] */
    public final Boolean CYi() {
        return getOptionalBooleanValueByHashCode(961967720);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo] */
    public final ClipsMashupFollowButtonInfoImpl F1Y() {
        return new ClipsMashupFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(961967720), getOptionalBooleanValueByHashCode(715401370));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsMashupFollowButtonInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
