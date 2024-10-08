package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C46057DKo;
import X.CTC;
import X.CYA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoGoalsToastInfo extends 17P implements GoalsToastInfo {
    public static final C3035269k CREATOR = CTC.A00(76);

    public final GoalsToastType C81() {
        return (GoalsToastType) A0N(-434802094, C46057DKo.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.GoalsToastInfo, com.instagram.api.schemas.ImmutablePandoGoalsToastInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CYA.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return C41847B3o.A1C(this);
    }

    public final String Avk() {
        return A0i(1169975446);
    }

    public final String B9c() {
        return A0j(194328007);
    }

    public final String C7x() {
        return A0i(-1773366604);
    }

    public final GoalsToastInfoImpl F3S() {
        return new GoalsToastInfoImpl(C81(), C41847B3o.A1C(this), A0i(1169975446), A0j(194328007), A0i(-1773366604));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoGoalsToastInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
