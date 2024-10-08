package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41863B4h;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse extends 17P implements FanClubFanConsiderationPageFeatureEligibilityResponse {
    public static final C3035269k CREATOR = CTC.A00(66);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse, com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41863B4h.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse] */
    public final FanClubFanConsiderationPageFeatureEligibilityResponseImpl F2x() {
        return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl(getBooleanValueByHashCode(-1816105012), getBooleanValueByHashCode(-1855218733));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse] */
    public final boolean getShouldShowContentPreview() {
        return getBooleanValueByHashCode(-1816105012);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse] */
    public final boolean getShouldShowSocialContext() {
        return getBooleanValueByHashCode(-1855218733);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
