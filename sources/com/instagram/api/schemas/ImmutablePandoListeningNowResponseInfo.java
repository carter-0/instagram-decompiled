package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.1E9;
import X.C3035269k;
import X.C44207CZu;
import X.CTB;
import X.DL5;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoListeningNowResponseInfo extends 17P implements ListeningNowResponseInfoIntf {
    public static final C3035269k CREATOR = new CTB(10);
    public MusicInfo A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final ListeningNowState BNC() {
        return (ListeningNowState) A0M(134891364, DL5.A00);
    }

    public final MusicInfo BUr() {
        MusicInfo musicInfo = this.A00;
        if (musicInfo == null) {
            return (MusicInfo) A05(-780321144, ImmutablePandoMusicInfo.class);
        }
        return musicInfo;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ListeningNowResponseInfoIntf, com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44207CZu.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo] */
    public final Integer BXH() {
        return getOptionalIntValueByHashCode(1956716504);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo] */
    public final Boolean CcP() {
        return getOptionalBooleanValueByHashCode(936256575);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoListeningNowResponseInfo] */
    public final ListeningNowResponseInfo F5U(1E9 r6) {
        MusicInfoImpl musicInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(936256575);
        ListeningNowState BNC = BNC();
        MusicInfo BUr = BUr();
        if (BUr != null) {
            musicInfoImpl = BUr.F6V(r6);
        } else {
            musicInfoImpl = null;
        }
        return new ListeningNowResponseInfo(BNC, musicInfoImpl, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(1956716504));
    }
}
