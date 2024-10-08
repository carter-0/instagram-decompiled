package X;

/* renamed from: X.OLa  reason: case insensitive filesystem */
public final class C70780OLa {
    public String A00;
    public final long A01;
    public final AnonymousClass07Z A02;
    public final C69065Ne2 A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public C70780OLa(AnonymousClass07Z r2, C69065Ne2 ne2, long j) {
        0qQ.A0B(ne2, 2);
        this.A01 = j;
        this.A03 = ne2;
        this.A02 = r2;
        02z A012 = 106.A01(C72378P3r.A00);
        this.A04 = A012;
        this.A05 = 10b.A03(A012);
    }

    public final void A00() {
        Object n8d;
        05G r2 = this.A04;
        Object value = r2.getValue();
        if (value instanceof N8D) {
            n8d = C72378P3r.A00;
        } else if (value instanceof C72378P3r) {
            String str = this.A00;
            if (str != null) {
                n8d = new N8D(str);
            } else {
                C73565Pfm.A02(this, AnonymousClass07a.A00(this.A02), 49);
                return;
            }
        } else {
            return;
        }
        r2.Epw(n8d);
    }
}
