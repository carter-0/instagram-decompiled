package X;

/* renamed from: X.GeZ  reason: case insensitive filesystem */
public final class C52899GeZ extends C267794cD implements C267814cG {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C287615aU A03;

    public final void AQM(AnonymousClass5Q4 r15) {
        long j;
        float f;
        AnonymousClass5Q4 r3 = r15;
        r15.AQW();
        if (this.A02) {
            j = AnonymousClass5RW.A01;
            f = 0.3f;
        } else if (this.A01 || this.A00) {
            j = AnonymousClass5RW.A01;
            f = 0.1f;
        } else {
            return;
        }
        r3.AQs((C288195bW) null, C289635dw.A00, 1.0f, 3, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j & 63)], AnonymousClass5RW.A03(j), AnonymousClass5RW.A02(j), AnonymousClass5RW.A01(j), f), 0, r15.Bwg());
    }

    public final /* synthetic */ void DPk() {
    }

    public C52899GeZ(C287615aU r1) {
        this.A03 = r1;
    }

    public final void A0E() {
        AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 0), A05());
    }
}
