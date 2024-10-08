package X;

public final class WJt implements AnonymousClass2TS {
    public final C276544tV A00;
    public final C276694tk A01;

    public WJt(C276544tV r2, C276694tk r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass2Ta AEy(C244943c0 r13, int i, int i2) {
        C276694tk r5 = this.A01;
        C307436Qc r4 = r5.A00;
        C276544tV r0 = this.A00;
        String A02 = 002.A02(r0.A04, r0.A03, "RootSignalNode.calculateLayout: ", " | ");
        try {
            if (r4.A02()) {
                r4.A01(A02);
            }
            Object A012 = C276674ti.A01(C276704tl.DEFAULT, r5, new MJB(this, i, r13, i2, 0));
            0qQ.A0A(A012);
            return (AnonymousClass2Ta) A012;
        } finally {
            if (r4.A02()) {
                r4.A00();
            }
        }
    }

    public final /* synthetic */ AnonymousClass2Ta AEz(C244943c0 r2, long j) {
        return C308016Sj.A00(r2, this, j);
    }
}
