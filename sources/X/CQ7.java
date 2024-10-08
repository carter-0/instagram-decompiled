package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CQ7 extends 17P implements DUD {
    public 1Xj A00;
    public List A01;

    public final 1Xj Bh1() {
        return this.A00;
    }

    public final List BiI() {
        return this.A01;
    }

    public final DUD E9J(1E9 r4) {
        ArrayList arrayList;
        this.A00 = C41847B3o.A0u(r4, this, 689310300);
        ImmutableList A08 = A08(370429585, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUD, X.CQ7] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44488Cfk.A00(this));
    }

    public final Long AvQ() {
        return A0L(3076014);
    }

    public final C42102BHf FC8(1E9 r7) {
        1Xj r4;
        Long A0L = A0L(3076014);
        Class<ImmutablePandoMediaDict> cls = ImmutablePandoMediaDict.class;
        1Xj A0u = C41847B3o.A0u(r7, this, 689310300);
        ArrayList arrayList = null;
        if (A0u != null) {
            r4 = C41846B3n.A0Y(r7, A0u);
        } else {
            r4 = null;
        }
        ImmutableList A08 = A08(370429585, cls);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r7, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41848B3p.A1V(r7, arrayList, it2);
                }
            }
        }
        return new C42102BHf(r4, A0L, C41845B3m.A0q(this), arrayList);
    }

    public final String getUsername() {
        return C41845B3m.A0q(this);
    }
}
