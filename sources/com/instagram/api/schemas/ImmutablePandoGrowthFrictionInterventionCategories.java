package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41876B4u;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGrowthFrictionInterventionCategories extends 17P implements GrowthFrictionInterventionCategories {
    public static final C3035269k CREATOR = CTC.A00(82);

    public final GrowthFrictionInterventionDetail B6i() {
        return (GrowthFrictionInterventionDetail) A05(-1268958287, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    public final GrowthFrictionInterventionDetail BRb() {
        return (GrowthFrictionInterventionDetail) A05(950345194, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    public final GrowthFrictionInterventionDetail C3r() {
        return (GrowthFrictionInterventionDetail) A05(114586, ImmutablePandoGrowthFrictionInterventionDetail.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionCategories, com.instagram.api.schemas.GrowthFrictionInterventionCategories] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41876B4u.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final GrowthFrictionInterventionCategoriesImpl F3a() {
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl;
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl2;
        GrowthFrictionInterventionDetail B6i = B6i();
        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl3 = null;
        if (B6i != null) {
            growthFrictionInterventionDetailImpl = B6i.F3b();
        } else {
            growthFrictionInterventionDetailImpl = null;
        }
        GrowthFrictionInterventionDetail BRb = BRb();
        if (BRb != null) {
            growthFrictionInterventionDetailImpl2 = BRb.F3b();
        } else {
            growthFrictionInterventionDetailImpl2 = null;
        }
        GrowthFrictionInterventionDetail C3r = C3r();
        if (C3r != null) {
            growthFrictionInterventionDetailImpl3 = C3r.F3b();
        }
        return new GrowthFrictionInterventionCategoriesImpl(growthFrictionInterventionDetailImpl, growthFrictionInterventionDetailImpl2, growthFrictionInterventionDetailImpl3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionCategories] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
