package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mjr  reason: case insensitive filesystem */
public final class C67195Mjr {
    public boolean A00;
    public final 1aU A01;
    public final 1aT A02;
    public final 1a8 A03 = new 1a8((C269794fh) null);
    public final 1aU A04;
    public final 1aU A05;
    public final 1aU A06;
    public final 1aT A07 = AnonymousClass2FF.A0A().A0W();
    public final HashMap A08 = AnonymousClass7TE.A1E();

    public final void A00() {
        1aU A0M;
        1a8 r5 = this.A03;
        PU7.A00(this.A04, r5, this, 1);
        Iterator A0t = AnonymousClass7TF.A0t(this.A08);
        while (A0t.hasNext()) {
            C69666Npo npo = (C69666Npo) A0t.next();
            1aU A0L = this.A06.A0N(new C66789Mca((Object) npo, 13)).A0L(new C72118Owd(32)).A0L(new C72120Owf((Object) npo, 65));
            if (npo instanceof C67243Mkd) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A02(A0L, new C73934PmE(npo, 42), 25);
            } else if (npo instanceof C67244Mke) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A02(A0L, new C73934PmE(npo, 41), 25);
            } else if (npo instanceof C68923Nb2) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A02(A0L, new C73934PmE(npo, 40), 24);
            } else if (npo instanceof C68930Nb9) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A01(A0L, npo, 70);
            } else if (npo instanceof C68927Nb6) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A03(A0L, C74178PqK.A00(npo, 4), 46);
            } else if (npo instanceof C68926Nb5) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A03(A0L, C74178PqK.A00(npo, 3), 45);
            } else if (npo instanceof C68929Nb8) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A03(A0L, C74178PqK.A00(npo, 2), 44);
            } else if (npo instanceof C68928Nb7) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A03(A0L, C74178PqK.A00(npo, 1), 43);
            } else if (npo instanceof C68925Nb4) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A03(A0L, C74178PqK.A00(npo, 0), 42);
            } else if (npo instanceof C68924Nb3) {
                0qQ.A0B(A0L, 0);
                A0M = C72120Owf.A02(A0L, new C74181PqN(npo, 47), 36);
            } else {
                C68931NbA nbA = (C68931NbA) npo;
                0qQ.A0B(A0L, 0);
                A0M = A0L.A0M(new C72027Ov1(7, C300325ww.A00(nbA.A00), nbA));
            }
            1aT r2 = this.A07;
            r2.getClass();
            r5.A02(A0M, new PU7(r2, 0));
        }
    }

    public final void A01(C74245PrZ prZ) {
        this.A07.accept(prZ);
    }

    public C67195Mjr(1aU r7, C269794fh r8, List list, List list2) {
        NQL A0W = 1aF.A01(new C66921MfF((Object) null)).A0W();
        this.A02 = A0W;
        this.A05 = C72118Owd.A00(r7, 27).A0H().A0B();
        this.A01 = C72118Owd.A00(A0W.A0N(new C67018Mgr(1)), 28).A0D().A0C();
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C70737OIu oIu = (C70737OIu) it.next();
            A1E.put(oIu.A01(), oIu);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C69666Npo npo = (C69666Npo) it2.next();
            this.A08.put(npo.A00(), npo);
        }
        1aU A082 = 1aU.A08(Arrays.asList(new 1aU[]{this.A05.A0H(), this.A07}));
        C72118Owd owd = new C72118Owd(29);
        1aJ r4 = A082.A00;
        C67196Mjs mjs = new C67196Mjs(owd);
        int i = XCq.A00;
        1aP.A00(i, "prefetch");
        1aU A0P = new 1aU(new C21106XEw(r4, mjs, AnonymousClass05K.A00, i)).A0P(r8);
        1aT r1 = this.A02;
        C66922MfG mfG = new C66922MfG(this, A1E);
        1aJ r42 = A0P.A00;
        1aJ r3 = r1.A00;
        C21099XEn xEn = new C21099XEn(mfG);
        1aP.A01(r3, "other is null");
        1aU A0F = new 1aU(new C21103XEs(xEn, r42, r3)).A0F();
        this.A06 = A0F.A0K(new C72118Owd(30)).A0F();
        this.A04 = C72118Owd.A00(A0F, 31);
    }
}
