package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.B4V;
import X.B6O;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoOriginalSoundConsumptionInfo extends 17P implements OriginalSoundConsumptionInfoIntf {
    public static final C3035269k CREATOR = CTB.A00(32);

    public final MusicMuteAudioReason BuG() {
        return (MusicMuteAudioReason) A0N(-880361262, B6O.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo, com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4V.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Ay9() {
        return A0j(-1208870349);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo, X.17P] */
    public final OriginalSoundConsumptionInfo F7D() {
        String A0j = A0j(-1208870349);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1033668234);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1915067790);
        return new OriginalSoundConsumptionInfo(BuG(), A0j, A0h(-567396441), booleanValueByHashCode, booleanValueByHashCode2);
    }

    public final String getShouldMuteAudioReason() {
        return A0h(-567396441);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo] */
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo] */
    public final boolean isTrendingInClips() {
        return getBooleanValueByHashCode(1915067790);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalSoundConsumptionInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
