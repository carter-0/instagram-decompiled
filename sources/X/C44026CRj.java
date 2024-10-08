package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.CRj  reason: case insensitive filesystem */
public final class C44026CRj extends 17P implements C270844hO {
    public C239663Hm A00;
    public C46299DUc A01;
    public AnonymousClass3HY A02;

    public final C239663Hm Ahx() {
        C239663Hm r0 = this.A00;
        if (r0 == null) {
            return (C239663Hm) A05(-1618876223, CIG.class);
        }
        return r0;
    }

    public final C46299DUc BeE() {
        C46299DUc dUc = this.A01;
        if (dUc == null) {
            return (C46299DUc) A05(195461543, CN5.class);
        }
        return dUc;
    }

    public final AnonymousClass3HY BkV() {
        AnonymousClass3HY r0 = this.A02;
        if (r0 == null) {
            return (AnonymousClass3HY) A05(3496474, C44024CRg.class);
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4hO, X.CRj] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44889Cmf.A00(this));
    }

    public final C270844hO E9y(1E9 r3) {
        C239663Hm Ahx = Ahx();
        AnonymousClass3HY r1 = null;
        if (Ahx != null) {
            Ahx.E76(r3);
        } else {
            Ahx = null;
        }
        this.A00 = Ahx;
        C46299DUc BeE = BeE();
        if (BeE != null) {
            BeE.E7x(r3);
        } else {
            BeE = null;
        }
        this.A01 = BeE;
        AnonymousClass3HY BkV = BkV();
        if (BkV != null) {
            BkV.E9v(r3);
            r1 = BkV;
        }
        this.A02 = r1;
        return this;
    }

    public final C270834hN FEv(1E9 r5) {
        C239653Hl r2;
        C42064BFr bFr;
        C239663Hm Ahx = Ahx();
        AnonymousClass3HX r3 = null;
        if (Ahx != null) {
            r2 = Ahx.F0z(r5);
        } else {
            r2 = null;
        }
        C46299DUc BeE = BeE();
        if (BeE != null) {
            bFr = BeE.F7c(r5);
        } else {
            bFr = null;
        }
        AnonymousClass3HY BkV = BkV();
        if (BkV != null) {
            r3 = BkV.FEq(r5);
        }
        return new C270834hN(r2, bFr, r3);
    }
}
