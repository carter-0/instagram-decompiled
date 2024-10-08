package com.instagram.api.schemas;

import X.0qQ;
import X.0sn;
import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44324Cd6;
import X.CTB;
import X.MJ3;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class ImmutablePandoRingSpec extends 17P implements RingSpec {
    public static final C3035269k CREATOR = CTB.A00(69);

    public final RingSpecPoint B1X() {
        return (RingSpecPoint) A04(1948971308, ImmutablePandoRingSpecPoint.class);
    }

    public final RingSpecPoint Byj() {
        return (RingSpecPoint) A04(-1526387853, ImmutablePandoRingSpecPoint.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRingSpec, com.instagram.api.schemas.RingSpec] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44324Cd6.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRingSpec] */
    public final List Ap5() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1354842768);
        0qQ.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    public final List BNn() {
        List list = (List) 17P.A00(this, new MJ3(-1197189282, 34, this), -1197189282);
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final RingSpecImpl F8l() {
        List Ap5 = Ap5();
        RingSpecPointImpl F8m = B1X().F8m();
        List BNn = BNn();
        return new RingSpecImpl(F8m, Byj().F8m(), A0Q(), Ap5, BNn);
    }

    public final String getName() {
        return A0Q();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoRingSpec] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
