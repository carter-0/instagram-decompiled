package X;

/* renamed from: X.S2v  reason: case insensitive filesystem */
public final class C10963S2v {
    public int A00;
    public 0sP A01;
    public 0sP A02;
    public final C11039S6r A03;
    public final RRD A04;
    public final RRN A05;

    public final void A00(S5Q s5q, 0sP r12, 0sP r13) {
        0qQ.A0B(s5q, 0);
        this.A02 = r12;
        this.A01 = r13;
        C11039S6r s6r = this.A03;
        C13347TVu tVu = new C13347TVu((Object) this, 22);
        S1Z s1z = s6r.A02;
        AnonymousClass7TE.A1Z(new C66187MGy(s1z, "upload_edit_start", (AnonymousClass4D7) null, 0), s1z.A02);
        s6r.A03.execute(new TJT(s1z, s6r, tVu, ((long) this.A05.A00) * 1000));
        this.A04.A04(s5q, this);
    }

    public C10963S2v(RRN rrn, C11039S6r s6r, RRD rrd) {
        this.A04 = rrd;
        this.A05 = rrn;
        this.A03 = s6r;
        this.A00 = rrn.A01;
    }
}
