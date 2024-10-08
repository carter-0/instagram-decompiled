package X;

public final class T6Q implements AnonymousClass1T9 {
    public final SC7 A00;
    public final 1QS A01;
    public final 1QU A02;
    public final C13750TgM A03;
    public final S7W A04;
    public final boolean A05;

    public T6Q(SC7 sc7, 1QS r3, 1QU r4, C13750TgM tgM, S7W s7w, boolean z) {
        0qQ.A0B(s7w, 5);
        this.A03 = tgM;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = z;
        this.A04 = s7w;
        this.A00 = sc7;
    }

    public final void FJj(1Fe r6) {
        0qQ.A0B(r6, 0);
        1QU r2 = this.A02;
        r2.A01(r6);
        0eP AIf = AnonymousClass1Cz.A03.AIf(this.A01, r2);
        int A0M = AnonymousClass7TE.A0M(AIf.A00);
        boolean A1a = AnonymousClass7TE.A1a(AIf.A01);
        Integer valueOf = Integer.valueOf(A0M);
        boolean z = !A1a;
        Boolean valueOf2 = Boolean.valueOf(z);
        C13750TgM tgM = this.A03;
        0qQ.A0A(valueOf);
        0qQ.A0A(valueOf2);
        tgM.AGl(A0M, z);
    }

    public final void cancel() {
        this.A04.A00(this.A01, "cancellation_initiated");
        if (this.A05) {
            this.A03.cancel();
        }
    }

    public final int getRequestId() {
        return this.A01.A04;
    }
}
