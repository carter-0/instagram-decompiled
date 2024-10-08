package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.S1q  reason: case insensitive filesystem */
public abstract class C10937S1q {
    public final S7F A00;
    public final ExecutorService A01;
    public final C9562Rcz A02;

    public final synchronized void A00(SJY sjy) {
        S7F s7f = this.A00;
        SJY A002 = s7f.A00(sjy);
        if (A002 != null) {
            s7f.A04(A002, new SJY(A002.A02, A002.A00(), A002.A01 - 10, A002.A00 + 1));
            s7f.A02();
        }
    }

    public C10937S1q(AnonymousClass45J r2, C9562Rcz rcz, ExecutorService executorService) {
        this.A01 = executorService;
        this.A02 = rcz;
        this.A00 = new S7F(r2);
    }
}
