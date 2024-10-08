package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NfA  reason: case insensitive filesystem */
public final class C69129NfA extends OTZ {
    public boolean A00;
    public final 05G A01 = DbS.A10(new N9N((Boolean) null, (Long) null, (Long) null, (String) null, false, false, false, true, true, false, true));
    public final UserSession A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;

    public final void A00(boolean z) {
        C71116OdA odA;
        C69662Npk npk;
        boolean z2 = z;
        if (z && AnonymousClass7TF.A1Y(((N9N) this.A01.getValue()).A00, true)) {
            UserSession userSession = this.A02;
            if (!(!182.A06(0Tu.A05, userSession, 36323951466524288L) || (odA = (C71116OdA) userSession.A00(C71116OdA.class)) == null || (npk = odA.A02) == null)) {
                C71116OdA.A00(npk, odA, false, true);
            }
        }
        05G r1 = this.A01;
        N9N n9n = (N9N) r1.getValue();
        boolean z3 = n9n.A04;
        boolean z4 = n9n.A06;
        boolean z5 = n9n.A05;
        boolean z6 = n9n.A07;
        r1.FIA(new N9N(n9n.A00, n9n.A01, n9n.A02, n9n.A03, z3, z4, z5, z6, n9n.A0A, n9n.A09, z2));
    }

    public C69129NfA(UserSession userSession, O9R o9r, C62320sa r15, C62320sa r16, C62320sa r17) {
        super(o9r);
        this.A02 = userSession;
        this.A04 = r15;
        this.A05 = r16;
        this.A03 = r17;
    }
}
