package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41875B4t;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGrowthFrictionInfo extends 17P implements GrowthFrictionInfo {
    public static final C3035269k CREATOR = CTC.A00(80);

    public final GrowthFrictionInterventionCategories BIc() {
        return (GrowthFrictionInterventionCategories) A05(-2079327108, ImmutablePandoGrowthFrictionInterventionCategories.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.GrowthFrictionInfo, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41875B4t.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo] */
    public final boolean BAW() {
        return getBooleanValueByHashCode(-815097976);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo] */
    public final GrowthFrictionInfoImpl F3Y() {
        GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-815097976);
        GrowthFrictionInterventionCategories BIc = BIc();
        if (BIc != null) {
            growthFrictionInterventionCategoriesImpl = BIc.F3a();
        } else {
            growthFrictionInterventionCategoriesImpl = null;
        }
        return new GrowthFrictionInfoImpl(growthFrictionInterventionCategoriesImpl, booleanValueByHashCode);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
