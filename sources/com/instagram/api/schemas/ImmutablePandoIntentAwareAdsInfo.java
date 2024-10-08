package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C54798HTf;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIntentAwareAdsInfo extends 17P implements IntentAwareAdsInfoIntf {
    public static final C3035269k CREATOR = new CTB(8);

    public final IntentAwareAdsFormatInfo B7S() {
        return (IntentAwareAdsFormatInfo) A05(1458276342, ImmutablePandoIntentAwareAdsFormatInfo.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo, com.instagram.api.schemas.IntentAwareAdsInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C54798HTf.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BHg() {
        return A0i(2096152009);
    }

    public final String BUR() {
        return A0i(-146593709);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo] */
    public final Integer BUY() {
        return getOptionalIntValueByHashCode(-346560081);
    }

    public final String BUa() {
        return A0i(1296666401);
    }

    public final String Br2() {
        return A0i(-1989826711);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo] */
    public final Integer Br3() {
        return getOptionalIntValueByHashCode(-201146121);
    }

    public final String Br4() {
        return A0i(221664491);
    }

    public final String C9y() {
        return A0i(375833953);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo] */
    public final Boolean CbN() {
        return getOptionalBooleanValueByHashCode(1692758042);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo, X.17P] */
    public final IntentAwareAdsInfo F5F() {
        IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl;
        IntentAwareAdsFormatInfo B7S = B7S();
        if (B7S != null) {
            intentAwareAdsFormatInfoImpl = B7S.F5E();
        } else {
            intentAwareAdsFormatInfoImpl = null;
        }
        String A0i = A0i(2096152009);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1692758042);
        String A0i2 = A0i(-146593709);
        return new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(-346560081), getOptionalIntValueByHashCode(-201146121), A0i, A0i2, A0i(1296666401), A0i(-1989826711), A0i(221664491), A0i(375833953));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
