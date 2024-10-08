package X;

public final class PLL implements C74426Pug {
    public final C70989OVd A00;

    public final void A7I(C74268Prw prw) {
        0sP pqM;
        boolean z;
        NCn A002;
        C70989OVd oVd = this.A00;
        C71143Odx odx = oVd.A0Z;
        if (prw instanceof PPA) {
            05G r1 = oVd.A0H.A01;
            N9N n9n = (N9N) r1.getValue();
            boolean z2 = n9n.A04;
            boolean z3 = n9n.A06;
            boolean z4 = n9n.A05;
            boolean z5 = n9n.A07;
            r1.FIA(new N9N(n9n.A00, n9n.A01, n9n.A02, n9n.A03, z2, z3, z4, z5, false, n9n.A09, n9n.A08));
        } else if (prw instanceof C72813PLb) {
            C74187PqT.A00(odx, prw);
        } else if (prw instanceof PLY) {
            odx.A0B(((PLY) prw).A00);
        } else {
            if (prw instanceof C72827PLp) {
                NCZ ncz = odx.A06;
                if (ncz == null || (A002 = NCZ.A00(ncz)) == null) {
                    z = false;
                } else {
                    z = A002.isCameraCurrentlyFacingFront();
                }
                oVd.A0B.A00(DbT.A0l(z));
                pqM = C74146Ppn.A00;
            } else if (prw instanceof C72819PLh) {
                C71143Odx.A04(odx, new GN2(18, odx, 00k.A0a(((C72819PLh) prw).A00), false));
                return;
            } else if (prw instanceof C65610Lwl) {
                pqM = new C74180PqM(((C65610Lwl) prw).A00, 9);
            } else {
                0KC.A0D("RtcLivePresentationManager", 002.A0R("Unexpected RtcStateAction: ", C66581MXm.A0y(prw)));
                return;
            }
            C71143Odx.A04(odx, pqM);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0r6 Exz(C262224Cq r2) {
        return 106.A01(C72835PLx.A00);
    }

    public PLL(C70989OVd oVd) {
        this.A00 = oVd;
    }
}
