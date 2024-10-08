package X;

/* renamed from: X.Lim  reason: case insensitive filesystem */
public final class C64826Lim implements AnonymousClass0lh {
    public final LFO A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final LHF A03;

    public final void onSessionWillEnd() {
        LFO lfo = this.A00;
        lfo.A02.A01();
        lfo.A05.A01();
    }

    public C64826Lim(LFO lfo, LHF lhf) {
        this.A00 = lfo;
        this.A03 = lhf;
        02z A012 = 106.A01(C59702JUj.A00);
        this.A01 = A012;
        this.A02 = 10b.A03(A012);
    }
}
