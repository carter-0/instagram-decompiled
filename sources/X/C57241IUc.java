package X;

/* renamed from: X.IUc  reason: case insensitive filesystem */
public final class C57241IUc implements AnonymousClass2xU {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C53979GxN A02;
    public final /* synthetic */ C54321H7q A03;
    public final /* synthetic */ 0r1 A04;

    public C57241IUc(C53979GxN gxN, C54321H7q h7q, 0r1 r3, float f, int i) {
        this.A01 = i;
        this.A02 = gxN;
        this.A04 = r3;
        this.A00 = f;
        this.A03 = h7q;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.H7q, android.view.View] */
    public final void DQp(AnonymousClass3W1 r9, int i) {
        0qQ.A0B(r9, 0);
        if (i == 68) {
            float f = r9.A01;
            int i2 = this.A01;
            float f2 = f - ((float) i2);
            if (f2 > 0.0f) {
                2V5 r6 = C53979GxN.A07;
                if (C51970G9q.A02(r6) == 0.0f) {
                    C53979GxN gxN = this.A02;
                    gxN.A05.D1G(gxN.A00, gxN.A01, i2, false);
                }
                C51967G9n.A19(r6, f2);
                C51967G9n.A19(C53979GxN.A08, 1.0f);
                0r1 r62 = this.A04;
                if (!r62.A00 && r9.A0i == AnonymousClass3TF.SETTLING && f2 >= this.A00) {
                    ? r5 = this.A03;
                    r5.performHapticFeedback(0);
                    C53979GxN gxN2 = this.A02;
                    gxN2.A05.D1G(gxN2.A00, gxN2.A01, i2, true);
                    new C52046GCs(gxN2.A02, gxN2.A03).A05(r5, (C238863Ds) null, (Integer) null);
                    r62.A00 = true;
                    return;
                }
                return;
            }
            this.A04.A00 = false;
            C51967G9n.A19(C53979GxN.A08, 0.0f);
            C51967G9n.A19(C53979GxN.A07, f2);
        }
    }
}
