package com.instagram.model.showreelnative;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44949Cnj;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoIgShowreelNativeAnimation extends 17P implements IgShowreelNativeAnimationIntf {
    public static final C3035269k CREATOR = new CTA(66);

    public final List Acn() {
        return A08(-2143919126, ImmutablePandoIgShowreelNativeAsset.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation, com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44949Cnj.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Abk() {
        return A0i(1884610515);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation] */
    public final List Acl() {
        return getOptionalStringListByHashCode(-1408207997);
    }

    public final String Anf() {
        return A0i(-173873537);
    }

    public final String AqT() {
        return A0i(951530617);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation] */
    public final Integer BCu() {
        return getOptionalIntValueByHashCode(-1221029593);
    }

    public final String C4b() {
        return A0i(-180214992);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation] */
    public final Integer CGY() {
        return getOptionalIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation] */
    public final IgShowreelNativeAnimation FFy() {
        ArrayList arrayList;
        String A0i = A0i(1884610515);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1408207997);
        List<IgShowreelNativeAsset> Acn = Acn();
        if (Acn != null) {
            arrayList = AnonymousClass7TG.A0r(Acn);
            for (IgShowreelNativeAsset FFz : Acn) {
                arrayList.add(FFz.FFz());
            }
        } else {
            arrayList = null;
        }
        String A0i2 = A0i(-173873537);
        String A0i3 = A0i(951530617);
        return new IgShowreelNativeAnimation(getOptionalIntValueByHashCode(-1221029593), getOptionalIntValueByHashCode(113126854), A0i, A0i2, A0i3, A0i(-180214992), optionalStringListByHashCode, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
