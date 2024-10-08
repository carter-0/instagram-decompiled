package X;

import android.os.Handler;

public final class Y2Q implements Runnable {
    public byte[] A00;
    public final /* synthetic */ C22018Xss A01;

    public Y2Q(C22018Xss xss) {
        this.A01 = xss;
    }

    public final void run() {
        C22018Xss xss = this.A01;
        C341467mw r2 = xss.A09;
        r2.A01("recARa");
        byte[] bArr = this.A00;
        if (bArr == null) {
            bArr = new byte[xss.A00];
            this.A00 = bArr;
        }
        int A002 = C22018Xss.A00(xss, bArr);
        Handler handler = xss.A06;
        handler.removeCallbacks(this);
        if (A002 != 0) {
            if (A002 == 1 || A002 == 2) {
                long j = xss.A05;
                if (j > 0) {
                    handler.postDelayed(this, j);
                    return;
                }
            } else {
                r2.A01("recRECs");
                this.A00 = null;
                return;
            }
        }
        handler.post(this);
    }
}
