package X;

public final class TD6 implements Runnable {
    public final /* synthetic */ QLS A00;

    public TD6(QLS qls) {
        this.A00 = qls;
    }

    public final void run() {
        QLS qls = this.A00;
        synchronized (qls) {
            if (qls.A04) {
                RKG rkg = new RKG(AnonymousClass05K.A0N);
                QLS.A00(qls);
                qls.A02(rkg);
            }
        }
    }
}
