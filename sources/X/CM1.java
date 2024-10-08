package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CM1 extends 17P implements C46251DSg {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DSg, X.CM1] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CaB.A00(this));
    }

    public final List Bni() {
        return A08(-1983070683, CMB.class);
    }

    public final BFQ F5o(1E9 r4) {
        ArrayList arrayList;
        List<DTI> Bni = Bni();
        if (Bni != null) {
            arrayList = AnonymousClass7TG.A0r(Bni);
            for (DTI F61 : Bni) {
                arrayList.add(F61.F61(r4));
            }
        } else {
            arrayList = null;
        }
        return new BFQ(arrayList);
    }

    public final BFQ F5p(1E6 r2) {
        return F5o(C41847B3o.A0q(r2));
    }
}
