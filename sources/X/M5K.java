package X;

public final class M5K implements Runnable {
    public final /* synthetic */ C62423KfY A00;

    public M5K(C62423KfY kfY) {
        this.A00 = kfY;
    }

    public final void run() {
        C65816M0i m0i = this.A00.A0E;
        if (m0i != null && m0i.A05 != C62635Kj6.STARTED_MATCHING_CONTENT_DETECTED) {
            M0Y m0y = m0i.A08;
            if (m0y != null) {
                M0Y.A02(m0y, true);
            }
            LES A02 = m0i.A0W.A02();
            A02.A0U.Epw(C62515Kh5.RESUMED);
        }
    }
}
