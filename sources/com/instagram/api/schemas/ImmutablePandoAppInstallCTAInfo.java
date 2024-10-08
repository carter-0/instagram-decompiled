package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CUW;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAppInstallCTAInfo extends 17P implements AppInstallCTAInfoIntf {
    public static final C3035269k CREATOR = CTC.A00(5);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppInstallCTAInfo, com.instagram.api.schemas.AppInstallCTAInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CUW.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Abd() {
        return A0h(-1171049866);
    }

    public final String BIv() {
        return A0k(-734535149);
    }

    public final AppInstallCTAInfo F0R() {
        return new AppInstallCTAInfo(A0h(-1171049866), A0k(-734535149));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAppInstallCTAInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
