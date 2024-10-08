package X;

/* renamed from: X.Aky  reason: case insensitive filesystem */
public final class C40890Aky implements Runnable {
    public final /* synthetic */ C352828Fe A00;

    public C40890Aky(C352828Fe r1) {
        this.A00 = r1;
    }

    public final void run() {
        C352838Ff r3 = (C352838Ff) this.A00.A0F.getValue();
        if (!r3.A03) {
            C352838Ff.A05(r3, true, true, false);
            return;
        }
        r3.A00 = 0;
        r3.A02 = false;
        r3.A03 = false;
        r3.A01 = C352838Ff.A02(r3);
        C352838Ff.A04(r3, new G4S(r3, 44));
        if (r3.A01 != AnonymousClass05K.A0Y) {
            0Aj A0e = AnonymousClass7TE.A0e(r3.A0A.A00, "ig_quicksnap_creation_nux_impression");
            if (A0e.isSampled()) {
                A0e.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A0e.Cgf();
            }
        }
        C352838Ff.A03(C40587Aeb.A00, r3);
        C352838Ff.A05(r3, true, true, false);
        r3.A07.A9Y(r3.A06);
    }
}
