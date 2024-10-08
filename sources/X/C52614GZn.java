package X;

/* renamed from: X.GZn  reason: case insensitive filesystem */
public final class C52614GZn {
    public final GZF A00;
    public final C284945Oz A01;

    public final float A00(int i) {
        GZF gzf = this.A00;
        if (i < 0 || i > gzf.A04()) {
            throw C51971G9r.A0l("page ", " is not within the range 0 to ", i, gzf.A04());
        }
        C52613GZm gZm = gzf.A0N;
        return ((float) (i - gZm.A05.BI6())) - gZm.A04.B6X();
    }

    public C52614GZn(GZF gzf, C62320sa r3) {
        this.A00 = gzf;
        this.A01 = C51970G9q.A0S(r3);
    }
}
