package X;

/* renamed from: X.8hQ  reason: invalid class name and case insensitive filesystem */
public final class C362148hQ implements AnonymousClass8GH {
    public final /* synthetic */ C362128hO A00;

    public C362148hQ(C362128hO r1) {
        this.A00 = r1;
    }

    public final boolean D26() {
        C362048hG r0 = this.A00.A01.A00;
        AnonymousClass8XA r3 = r0.A0w;
        boolean A0T = C362048hG.A0T(r0);
        28D r1 = r0.A03;
        0qQ.A0B(r1, 2);
        if (A0T) {
            r3.A0M(true);
            return true;
        } else if (r1 == 28D.A1l) {
            r3.A08.finish();
            return true;
        } else {
            27p.A01(r3.A0F).A0b();
            r3.A08.onBackPressed();
            r3.A0L.A0M.DHQ();
            return true;
        }
    }
}
