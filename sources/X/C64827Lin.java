package X;

import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;

/* renamed from: X.Lin  reason: case insensitive filesystem */
public final class C64827Lin implements AnonymousClass0lh {
    public final LFO A00;
    public final AppreciationGiftingDataSource A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final LHF A04;

    public final void onSessionWillEnd() {
        LFO lfo = this.A00;
        lfo.A02.A01();
        lfo.A05.A01();
    }

    public C64827Lin(LFO lfo, LHF lhf, AppreciationGiftingDataSource appreciationGiftingDataSource) {
        this.A00 = lfo;
        this.A01 = appreciationGiftingDataSource;
        this.A04 = lhf;
        02z A012 = 106.A01(C59702JUj.A00);
        this.A02 = A012;
        this.A03 = 10b.A03(A012);
    }
}
