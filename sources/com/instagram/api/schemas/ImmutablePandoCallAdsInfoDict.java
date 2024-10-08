package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CVJ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoCallAdsInfoDict extends 17P implements CallAdsInfoDictIntf {
    public static final C3035269k CREATOR = CTC.A00(24);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict, com.instagram.api.schemas.CallAdsInfoDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CVJ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Bai() {
        return A0i(-1034922840);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict] */
    public final boolean BuT() {
        return getBooleanValueByHashCode(-74850092);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict, X.17P] */
    public final CallAdsInfoDict F19() {
        return new CallAdsInfoDict(A0i(-1034922840), getBooleanValueByHashCode(-74850092));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCallAdsInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
