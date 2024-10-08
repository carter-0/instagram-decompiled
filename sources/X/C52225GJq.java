package X;

/* renamed from: X.GJq  reason: case insensitive filesystem */
public final class C52225GJq implements AnonymousClass2UZ {
    public final /* synthetic */ 2V5 A00;
    public final /* synthetic */ C52219GJk A01;

    public C52225GJq(2V5 r1, C52219GJk gJk) {
        this.A01 = gJk;
        this.A00 = r1;
    }

    public final void Dwu(2V5 r6) {
        1Xj r0;
        C52219GJk gJk = this.A01;
        if (gJk.A06) {
            C267324bN r1 = gJk.A01;
            if (r1.CcK() && (r0 = r1.A02) != null && r0.A5p()) {
                long A0R = AnonymousClass7TE.A0R(r6.A00);
                this.A00.A00(Long.valueOf(AnonymousClass30M.A06(AnonymousClass30J.SECONDS, AnonymousClass30K.A04(AnonymousClass30J.MILLISECONDS, A0R)) + 1));
            }
        }
    }
}
