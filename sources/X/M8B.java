package X;

public final class M8B implements Runnable {
    public final /* synthetic */ XPM A00;
    public final /* synthetic */ C62423KfY A01;

    public M8B(XPM xpm, C62423KfY kfY) {
        this.A01 = kfY;
        this.A00 = xpm;
    }

    public final void run() {
        int i;
        C62635Kj6 kj6;
        C65816M0i m0i = this.A01.A0E;
        if (m0i != null) {
            XPM xpm = this.A00;
            0qQ.A0B(xpm, 0);
            if (m0i.A05 == C62635Kj6.CONNECTING) {
                m0i.A02 = xpm.A0B * 1000;
                LES A02 = m0i.A0W.A02();
                int i2 = xpm.A03;
                05G r3 = A02.A0I;
                boolean z = false;
                if (A02.A0t) {
                    i = JTR.A0I(A02.A0A);
                } else {
                    i = 0;
                }
                if (i + JTR.A0I(A02.A05) >= i2 - 1) {
                    z = true;
                }
                AnonymousClass7TF.A1O(r3, z);
                A02.A00 = i2;
                if (182.A06(0Tu.A05, m0i.A0R, 36320927809545173L)) {
                    kj6 = C62635Kj6.CONNECTED_WAITING_FOR_COUNTDOWN;
                } else {
                    kj6 = C62635Kj6.CONNECTED;
                }
                m0i.A01(kj6);
                ((02m) AnonymousClass7TE.A14(((L5N) m0i.A0V.A01.getValue()).A01)).markerStart(29241390);
            }
        }
    }
}
