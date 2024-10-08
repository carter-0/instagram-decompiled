package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class CRD extends 17P implements DTX {
    public DUM A00;
    public 1Xj A01;

    public final 1Xj BFS() {
        return this.A01;
    }

    public final DUM BgE() {
        DUM dum = this.A00;
        if (dum == null) {
            return (DUM) A05(1400556101, CKY.class);
        }
        return dum;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRD, X.DTX] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, Ck9.A00(this));
    }

    public final DTX E9j(1E9 r2) {
        this.A01 = C41847B3o.A0u(r2, this, 1660139965);
        DUM BgE = BgE();
        if (BgE != null) {
            BgE.E7T(r2);
        } else {
            BgE = null;
        }
        this.A00 = BgE;
        return this;
    }

    public final BIQ FE9(1E9 r4) {
        1Xj r1;
        1Xj A0u = C41847B3o.A0u(r4, this, 1660139965);
        C42046BEz bEz = null;
        if (A0u != null) {
            r1 = C41846B3n.A0Y(r4, A0u);
        } else {
            r1 = null;
        }
        DUM BgE = BgE();
        if (BgE != null) {
            bEz = BgE.F3c(r4);
        }
        return new BIQ(bEz, r1);
    }
}
