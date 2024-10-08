package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C46037DJu;
import X.C46038DJv;
import X.CTC;
import android.os.Parcel;
import java.util.List;

public final class ImmutablePandoAchievement extends 17P implements AchievementIntf {
    public static final C3035269k CREATOR = CTC.A00(0);

    public final List AoO() {
        return A08(1802049969, ImmutablePandoCloseToEarningAchievementMedia.class);
    }

    public final EarnedOnMediaState Azr() {
        return (EarnedOnMediaState) A0N(1482500318, C46037DJu.A00);
    }

    public final AchievementButtonInfo BDq() {
        return (AchievementButtonInfo) A05(-19570535, ImmutablePandoAchievementButtonInfo.class);
    }

    public final AchievementName BVI() {
        return (AchievementName) A0M(3373707, C46038DJv.A00);
    }

    public final AchievementButtonInfo BfP() {
        return (AchievementButtonInfo) A05(-1817464817, ImmutablePandoAchievementButtonInfo.class);
    }

    public final AchievementButtonInfo BqT() {
        return (AchievementButtonInfo) A05(40167517, ImmutablePandoAchievementButtonInfo.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AXc() {
        return A0h(1898587517);
    }

    public final long AY3() {
        return A03(-257040341);
    }

    public final String Abp() {
        return A0h(2031529524);
    }

    public final String AtG() {
        return A0i(-1805264478);
    }

    public final String Azn() {
        return A0i(-386350540);
    }

    public final String Azo() {
        return A0i(1793790719);
    }

    public final String Azp() {
        return A0i(-738662418);
    }

    public final String Azq() {
        return A0i(-1506814994);
    }

    public final String Azs() {
        return A0i(1421481598);
    }

    public final String BGL() {
        return A0h(-877823861);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAchievement] */
    public final Integer BhT() {
        return getOptionalIntValueByHashCode(-1001078227);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAchievement] */
    public final Integer C7F() {
        return getOptionalIntValueByHashCode(-1882917531);
    }

    public final String CBQ() {
        return A0h(1086628188);
    }

    public final String getSecondaryText() {
        return A0i(-1170385640);
    }

    public final String getTitle() {
        return A0S();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAchievement] */
    public final int getValue() {
        return getIntValueByHashCode(111972721);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAchievement] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
