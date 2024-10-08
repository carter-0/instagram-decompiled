package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CM9 extends 17P implements DUO {
    public List A00;

    public final List B3f() {
        return this.A00;
    }

    public final DUO E7Z(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1167125638, ImmutablePandoUserDict.class);
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

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.CM9, X.17P] */
    public final BFT F5y(1E9 r6) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1167125638, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r6, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r6, arrayList, it2);
                }
                return new BFT(getIntValueByHashCode(1324364035), A0k(-798298666), A0P(), arrayList);
            }
        }
        arrayList = null;
        return new BFT(getIntValueByHashCode(1324364035), A0k(-798298666), A0P(), arrayList);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUO, X.CM9] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CaI.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CM9] */
    public final int Bak() {
        return getIntValueByHashCode(1324364035);
    }

    public final String Bhp() {
        return A0k(-798298666);
    }

    public final BFT F5z(1E6 r2) {
        return F5y(C41846B3n.A0S(r2));
    }

    public final String getText() {
        return A0P();
    }
}
