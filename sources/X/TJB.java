package X;

import java.io.IOException;

public final class TJB implements Runnable {
    public final /* synthetic */ C10522Rtb A00;
    public final /* synthetic */ C7313Q3p A01;
    public final /* synthetic */ IOException A02;

    public TJB(C10522Rtb rtb, C7313Q3p q3p, IOException iOException) {
        this.A02 = iOException;
        this.A00 = rtb;
        this.A01 = q3p;
    }

    public final void run() {
        IOException iOException = this.A02;
        if (iOException != null) {
            C10522Rtb rtb = this.A00;
            C7313Q3p q3p = this.A01;
            0qQ.A0B(q3p, 1);
            rtb.A01.A01(q3p, iOException);
        }
    }
}
