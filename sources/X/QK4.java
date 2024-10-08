package X;

public final class QK4 extends C11347SOg {
    public QK4() {
        super("ACTION_GO_FORWARD");
    }

    public static void A00(C11347SOg sOg, C340037kb r4) {
        C11347SOg sOg2 = new C11347SOg("navigation");
        sOg.A04(sOg2);
        QJz qJz = new QJz();
        qJz.A05 = r4.canGoBack();
        sOg2.A04(qJz);
        QK4 qk4 = new QK4();
        qk4.A05 = r4.canGoForward();
        sOg2.A04(qk4);
    }
}
