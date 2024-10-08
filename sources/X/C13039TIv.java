package X;

/* renamed from: X.TIv  reason: case insensitive filesystem */
public final class C13039TIv implements Runnable {
    public final /* synthetic */ C11286SJe A00;
    public final /* synthetic */ C12081Sma A01;
    public final /* synthetic */ STT A02;

    public C13039TIv(C11286SJe sJe, C12081Sma sma, STT stt) {
        this.A02 = stt;
        this.A01 = sma;
        this.A00 = sJe;
    }

    public final void run() {
        STT stt = this.A02;
        C13820Thp thp = stt.A0B;
        if (thp != null) {
            Integer num = AnonymousClass05K.A01;
            C11284SJc sJc = this.A01.A02;
            C11286SJe sJe = this.A00;
            C12381SsV ssV = new C12381SsV(new C12382SsW(sJe, sJc, stt, num), stt.A0K);
            RQK rqk = stt.A00;
            if (rqk != null) {
                thp.EMS(sJe, rqk, ssV, sJc);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        STT.A01(this.A00, this.A01.A02, stt);
    }
}
