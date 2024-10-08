package X;

import java.util.concurrent.Callable;

public final class TN4 implements Callable {
    public final int A00;

    public TN4(int i) {
        this.A00 = i;
    }

    public final Object call() {
        if (this.A00 == 0) {
            return null;
        }
        1Pq A0S = Pxf.A0S();
        A0S.A02("https://connect.facebook.net/en_US/iab.autofill.js");
        A0S.A01(AnonymousClass05K.A0N);
        A0S.A05 = true;
        1QS A002 = A0S.A00();
        AnonymousClass1QT A0E = JTQ.A0E();
        A0E.A03 = 1Fe.A02;
        A0E.A0A = "AutofillScript";
        return Pxf.A0R(A002, A0E);
    }
}
