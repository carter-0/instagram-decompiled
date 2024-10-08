package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CT4 extends 17P implements DU1 {
    public List A00;

    public final List AdK() {
        return this.A00;
    }

    public final DU1 EAa(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-917027213, ImmutablePandoUserDict.class);
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

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.CT4, X.17P] */
    public final BJ1 FGt(1E9 r5) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-917027213, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r5, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r5, arrayList, it2);
                }
                return new BJ1(getOptionalIntValueByHashCode(-2015407780), arrayList);
            }
        }
        arrayList = null;
        return new BJ1(getOptionalIntValueByHashCode(-2015407780), arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CT4, X.DU1] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45134Cqs.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CT4] */
    public final Integer AdM() {
        return getOptionalIntValueByHashCode(-2015407780);
    }

    public final BJ1 FGu(1E6 r2) {
        return FGt(C41846B3n.A0S(r2));
    }
}
