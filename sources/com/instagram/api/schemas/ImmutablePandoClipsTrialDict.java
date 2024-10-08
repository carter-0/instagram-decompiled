package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44099CVq;
import X.C55797Hnd;
import X.CTC;
import X.DKN;
import X.DKO;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoClipsTrialDict extends 17P implements ClipsTrialDict {
    public static final C3035269k CREATOR = CTC.A00(30);

    public final /* synthetic */ C55797Hnd AK8() {
        return new C55797Hnd(this);
    }

    public final MediaTrialGraduationStrategy B9i() {
        return (MediaTrialGraduationStrategy) A0N(-837452508, DKN.A00);
    }

    public final MediaTrialStatus BzK() {
        return (MediaTrialStatus) A0N(-892481550, DKO.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsTrialDict, com.instagram.api.schemas.ClipsTrialDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44099CVq.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsTrialDict] */
    public final Boolean Akq() {
        return getOptionalBooleanValueByHashCode(-1813816707);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsTrialDict] */
    public final Boolean Cay() {
        return getOptionalBooleanValueByHashCode(-1000044383);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsTrialDict] */
    public final ClipsTrialDictImpl F1p() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1813816707);
        return new ClipsTrialDictImpl(B9i(), BzK(), optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(-1000044383));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoClipsTrialDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
