package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44325Cd7;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoRingSpecPoint extends 17P implements RingSpecPoint {
    public static final C3035269k CREATOR = CTB.A00(70);

    public final float CGs() {
        return A02(120);
    }

    public final float CHR() {
        return A02(121);
    }

    public final RingSpecPointImpl F8m() {
        return new RingSpecPointImpl(A02(120), A02(121));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.RingSpecPoint, com.instagram.api.schemas.ImmutablePandoRingSpecPoint] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44325Cd7.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRingSpecPoint] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
