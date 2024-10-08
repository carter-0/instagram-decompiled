package X;

public final class M5J implements Runnable {
    public final /* synthetic */ C62423KfY A00;

    public M5J(C62423KfY kfY) {
        this.A00 = kfY;
    }

    public final void run() {
        C65816M0i m0i = this.A00.A0E;
        if (m0i != null) {
            XPM xpm = m0i.A04;
            if (xpm != null && xpm.A0K) {
                LRP lrp = m0i.A0U;
                if (lrp.A06 != null) {
                    lrp.A01 = AnonymousClass05K.A15;
                    LRP.A00((0xF) null, lrp, "END", "INFO", "BROADCASTER");
                    lrp.A06 = null;
                }
            }
            M0Y m0y = m0i.A08;
            if (m0y != null) {
                m0y.A07.A00.hide();
                m0y.A0H.invoke();
                M0Y.A02(m0y, false);
            }
            LES A02 = m0i.A0W.A02();
            A02.A0U.Epw(C62515Kh5.STOPPED);
        }
    }
}
