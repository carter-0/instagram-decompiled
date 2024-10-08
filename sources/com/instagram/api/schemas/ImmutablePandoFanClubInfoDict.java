package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.B49;
import X.C3035269k;
import X.C41845B3m;
import X.C45445CwY;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoFanClubInfoDict extends 17P implements FanClubInfoDict {
    public static final C3035269k CREATOR = CTC.A00(67);

    public final /* synthetic */ C45445CwY AKB() {
        return new C45445CwY(this);
    }

    public final FanClubFanConsiderationPageFeatureEligibilityResponse B3z() {
        return (FanClubFanConsiderationPageFeatureEligibilityResponse) A05(-1428488931, ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict, com.instagram.api.schemas.FanClubInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B49.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Boolean Ae7() {
        return getOptionalBooleanValueByHashCode(-600279422);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Integer Aq0() {
        return getOptionalIntValueByHashCode(-2056597344);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Boolean BB1() {
        return getOptionalBooleanValueByHashCode(1479814607);
    }

    public final String BKZ() {
        return A0j(229563654);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Integer C2R() {
        return getOptionalIntValueByHashCode(1871614584);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Boolean CT7() {
        return getOptionalBooleanValueByHashCode(339805228);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final Boolean CT9() {
        return getOptionalBooleanValueByHashCode(-437875759);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict, X.17P] */
    public final FanClubInfoDictImpl F2y() {
        FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-600279422);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-2056597344);
        String A0j = A0j(1490909208);
        String A0i = A0i(-1755178424);
        FanClubFanConsiderationPageFeatureEligibilityResponse B3z = B3z();
        if (B3z != null) {
            fanClubFanConsiderationPageFeatureEligibilityResponseImpl = B3z.F2x();
        } else {
            fanClubFanConsiderationPageFeatureEligibilityResponseImpl = null;
        }
        return new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponseImpl, optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(1479814607), getOptionalBooleanValueByHashCode(339805228), getOptionalBooleanValueByHashCode(-437875759), optionalIntValueByHashCode, getOptionalIntValueByHashCode(1871614584), A0j, A0i, A0j(229563654));
    }

    public final String getFanClubId() {
        return A0j(1490909208);
    }

    public final String getFanClubName() {
        return A0i(-1755178424);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFanClubInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
