package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C48328Ecl;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoGrowthFrictionInterventionDetail extends 17P implements GrowthFrictionInterventionDetail {
    public static final C3035269k CREATOR = CTC.A00(83);

    public final List Aj1() {
        return A0o(241352577, ImmutablePandoGrowthFrictionInterventionButton.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionDetail, com.instagram.api.schemas.GrowthFrictionInterventionDetail] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C48328Ecl.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AYH() {
        return A0h(-1422950858);
    }

    public final String BIY() {
        return A0h(-912325901);
    }

    public final GrowthFrictionInterventionDetailImpl F3b() {
        String A0h = A0h(-1422950858);
        List<GrowthFrictionInterventionButton> Aj1 = Aj1();
        ArrayList A0r = AnonymousClass7TG.A0r(Aj1);
        for (GrowthFrictionInterventionButton F3Z : Aj1) {
            A0r.add(F3Z.F3Z());
        }
        return new GrowthFrictionInterventionDetailImpl(A0h, A0h(-1724546052), A0h(-912325901), A0S(), A0V(), A0r);
    }

    public final String getDescription() {
        return A0h(-1724546052);
    }

    public final String getTitle() {
        return A0S();
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionDetail] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
