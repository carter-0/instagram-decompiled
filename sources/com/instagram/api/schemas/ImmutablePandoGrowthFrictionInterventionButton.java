package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CYH;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGrowthFrictionInterventionButton extends 17P implements GrowthFrictionInterventionButton {
    public static final C3035269k CREATOR = CTC.A00(81);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton, com.instagram.api.schemas.GrowthFrictionInterventionButton] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CYH.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AYH() {
        return A0i(-1422950858);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton] */
    public final Boolean CZp() {
        return getOptionalBooleanValueByHashCode(1185544173);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton] */
    public final GrowthFrictionInterventionButtonImpl F3Z() {
        return new GrowthFrictionInterventionButtonImpl(getOptionalBooleanValueByHashCode(1185544173), A0i(-1422950858), A0X(), A0V());
    }

    public final String getText() {
        return A0X();
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGrowthFrictionInterventionButton] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
