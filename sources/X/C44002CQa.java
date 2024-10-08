package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;

/* renamed from: X.CQa  reason: case insensitive filesystem */
public final class C44002CQa extends 17P implements C258003yJ {
    public C257853y4 A00;

    public final UrpIndexAction AYF() {
        return (UrpIndexAction) A0N(-1422950858, DN5.A00);
    }

    public final C257853y4 AdP() {
        C257853y4 r0 = this.A00;
        if (r0 == null) {
            return (C257853y4) A05(93166550, COU.class);
        }
        return r0;
    }

    public final DUE BPp() {
        return (DUE) A05(488513999, C44003CQb.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQa, X.3yJ] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44557Cgr.A00(this));
    }

    public final String Anf() {
        return A0i(-173873537);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQa] */
    public final Integer BGr() {
        return getOptionalIntValueByHashCode(100346066);
    }

    public final C258003yJ E9U(1E9 r2) {
        C257853y4 AdP = AdP();
        if (AdP != null) {
            AdP.E8G(r2);
        } else {
            AdP = null;
        }
        this.A00 = AdP;
        return this;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.CQa, X.17P] */
    public final C257993yI FD0(1E9 r7) {
        C257843y3 r1;
        UrpIndexAction AYF = AYF();
        C257853y4 AdP = AdP();
        BI5 bi5 = null;
        if (AdP != null) {
            r1 = AdP.F9J(r7);
        } else {
            r1 = null;
        }
        String A0i = A0i(-173873537);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(100346066);
        DUE BPp = BPp();
        if (BPp != null) {
            bi5 = BPp.FD2();
        }
        return new C257993yI(r1, AYF, bi5, optionalIntValueByHashCode, A0i);
    }

    public final C257993yI FD1(1E6 r2) {
        return FD0(C41846B3n.A0S(r2));
    }
}
