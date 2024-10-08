package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41869B4n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoFanClubStatusSyncInfo extends 17P implements FanClubStatusSyncInfo {
    public static final C3035269k CREATOR = CTC.A00(68);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo, com.instagram.api.schemas.FanClubStatusSyncInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41869B4n.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo] */
    public final boolean B0l() {
        return getBooleanValueByHashCode(-352293394);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo] */
    public final boolean C2O() {
        return getBooleanValueByHashCode(-1219769254);
    }

    public final Long C2P() {
        return A0L(518883585);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo, X.17P] */
    public final FanClubStatusSyncInfoImpl F2z() {
        return new FanClubStatusSyncInfoImpl(A0L(518883585), getBooleanValueByHashCode(-352293394), getBooleanValueByHashCode(-1219769254));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubStatusSyncInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
