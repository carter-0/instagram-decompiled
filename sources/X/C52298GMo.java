package X;

/* renamed from: X.GMo  reason: case insensitive filesystem */
public final class C52298GMo extends C251343mx {
    public final long A00;
    public final long A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final JN6 A04;
    public final JR2 A05;

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        JN6 jn6 = this.A04;
        if (jn6 instanceof C57658IeN) {
            return null;
        }
        if (jn6 instanceof C52171GHn) {
            AnonymousClass3W1 r2 = this.A03.A0E;
            if (r2 != null) {
                return new C52299GMp(r2, (C52171GHn) jn6, this.A05, this.A00, this.A01);
            }
            return null;
        }
        throw AnonymousClass7TE.A1K();
    }

    public C52298GMo(C267324bN r1, C52058GDe gDe, JN6 jn6, JR2 jr2, long j, long j2) {
        C51974G9v.A1P(r1, gDe, jn6, jr2);
        this.A02 = r1;
        this.A03 = gDe;
        this.A04 = jn6;
        this.A05 = jr2;
        this.A00 = j;
        this.A01 = j2;
    }
}
