package X;

public final class M8D implements Runnable {
    public final /* synthetic */ C62423KfY A00;
    public final /* synthetic */ Integer A01;

    public M8D(C62423KfY kfY, Integer num) {
        this.A00 = kfY;
        this.A01 = num;
    }

    public final void run() {
        Integer num;
        String str;
        C65816M0i m0i = this.A00.A0E;
        if (m0i != null) {
            Integer num2 = this.A01;
            C62635Kj6 kj6 = m0i.A05;
            if (kj6 != C62635Kj6.STARTED_MATCHING_CONTENT_DETECTED && !kj6.A01()) {
                XPM xpm = m0i.A04;
                if (xpm != null && xpm.A0K) {
                    LRP lrp = m0i.A0U;
                    int intValue = num2.intValue();
                    if (intValue == 1) {
                        num = AnonymousClass05K.A01;
                    } else if (intValue == 4) {
                        num = AnonymousClass05K.A0N;
                    } else if (intValue != 2) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A0Y;
                    }
                    0qQ.A0B(num, 0);
                    if (lrp.A06 != null && lrp.A00 < 0) {
                        lrp.A01 = AnonymousClass05K.A0u;
                        lrp.A00 = System.currentTimeMillis();
                        0xF r3 = new 0xF();
                        switch (num.intValue()) {
                            case 0:
                                str = "unknown";
                                break;
                            case 1:
                                str = "backgrounding";
                                break;
                            case 2:
                                str = "about_to_finish";
                                break;
                            case 3:
                                str = "lost_connection";
                                break;
                            default:
                                str = "live_swap";
                                break;
                        }
                        0xF.A00(r3, str, "reason");
                        LRP.A00(r3, lrp, "INTERRUPT", "WARNING", "BROADCASTER");
                    }
                }
                M0Y m0y = m0i.A08;
                if (m0y != null) {
                    m0y.A0F.A00();
                }
                LES A02 = m0i.A0W.A02();
                A02.A0U.Epw(C62515Kh5.INTERRUPTED);
            }
        }
    }
}
