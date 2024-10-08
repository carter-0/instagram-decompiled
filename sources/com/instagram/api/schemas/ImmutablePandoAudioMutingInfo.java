package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.C14023ToP;
import X.C3035269k;
import X.C376379Ht;
import X.DK8;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAudioMutingInfo extends 17P implements AudioMutingInfoIntf {
    public static final C3035269k CREATOR = new C376379Ht(0);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final MusicMuteAudioReason BV9() {
        return (MusicMuteAudioReason) A0N(-1619042518, DK8.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.api.schemas.AudioMutingInfoIntf, com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C14023ToP.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final boolean Ab2() {
        return getBooleanValueByHashCode(-330398791);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final boolean BV8() {
        return getBooleanValueByHashCode(1595120176);
    }

    public final String BVA() {
        return A0h(87336860);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final boolean Bvg() {
        return getBooleanValueByHashCode(9716456);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoAudioMutingInfo] */
    public final AudioMutingInfo F0f() {
        return new AudioMutingInfo(BV9(), A0h(87336860), getBooleanValueByHashCode(-330398791), getBooleanValueByHashCode(1595120176), getBooleanValueByHashCode(9716456));
    }
}
