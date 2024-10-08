package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.Liy  reason: case insensitive filesystem */
public final class C64836Liy implements AnonymousClass0lh, C66466MSu {
    public final 1vo A00;
    public final UserFlowLogger A01;
    public final C262224Cq A02;
    public final C249523jv A03;

    public final void DTu(C70707OHc oHc, long j) {
        AnonymousClass7TE.A1Z(new MGF(oHc, this, (AnonymousClass4D7) null, 12, j), this.A02);
    }

    public final void onSessionWillEnd() {
        AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 44), this.A02);
    }

    public C64836Liy(1vo r7, UserFlowLogger userFlowLogger, C262224Cq r9) {
        this.A02 = r9;
        this.A00 = r7;
        this.A01 = userFlowLogger;
        C59845JaL jaL = new C59845JaL(this, (AnonymousClass4D7) null, 13);
        19B r0 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        C262094Cc A022 = 1Ep.A02(r0, r9);
        C252673pU r1 = new C252673pU(A022, JTO.A1G(0), false);
        r1.A0N((C262204Co) A022.get(C262204Co.A00));
        r1.A0T(num, r1, jaL);
        this.A03 = r1;
    }
}
