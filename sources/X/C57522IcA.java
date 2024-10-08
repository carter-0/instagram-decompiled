package X;

/* renamed from: X.IcA  reason: case insensitive filesystem */
public final class C57522IcA implements JQQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C275464qK A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C56526Hzx A03;

    public C57522IcA(C275464qK r1, C255773uh r2, C56526Hzx hzx, int i) {
        this.A03 = hzx;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        return null;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3M() {
        String A2n;
        C56526Hzx hzx = this.A03;
        C275464qK r2 = this.A01;
        C255773uh r1 = this.A02;
        C254523sc A002 = C56526Hzx.A00(r2, hzx, this.A00);
        1Xj r0 = r1.A0b;
        if (!(r0 == null || (A2n = r0.A2n()) == null)) {
            A002.A3X = DbV.A0q(A2n);
            A002.A14 = Boolean.valueOf(C51971G9r.A0j(hzx.A00).A03(A2n));
        }
        return new C254563sg(A002);
    }

    public final /* bridge */ /* synthetic */ C254253sB BqR() {
        return null;
    }
}
