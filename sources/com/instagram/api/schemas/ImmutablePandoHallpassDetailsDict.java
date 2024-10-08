package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.CTC;
import X.CYS;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoHallpassDetailsDict extends 17P implements HallpassDetailsDict {
    public static final C3035269k CREATOR = CTC.A00(85);
    public List A00;

    public final List BxT() {
        return this.A00;
    }

    public final HallpassDetailsDict E7U(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-410551881, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoHallpassDetailsDict, com.instagram.api.schemas.HallpassDetailsDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CYS.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BAL() {
        return A0j(1029998000);
    }

    public final HallpassDetailsDictImpl F3e(1E9 r8) {
        ArrayList arrayList;
        String A0i = A0i(94842723);
        String A0j = A0j(1029998000);
        String A0W = A0W();
        ImmutableList A08 = A08(-410551881, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r8, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r8, arrayList, it2);
                }
                return new HallpassDetailsDictImpl(A0i, A0j, A0W, arrayList);
            }
        }
        arrayList = null;
        return new HallpassDetailsDictImpl(A0i, A0j, A0W, arrayList);
    }

    public final String getColor() {
        return A0i(94842723);
    }

    public final String getName() {
        return A0W();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoHallpassDetailsDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
