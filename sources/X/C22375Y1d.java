package X;

/* renamed from: X.Y1d  reason: case insensitive filesystem */
public final class C22375Y1d implements Runnable {
    public final /* synthetic */ C22018Xss A00;

    public C22375Y1d(C22018Xss xss) {
        this.A00 = xss;
    }

    public final void run() {
        C22018Xss xss = this.A00;
        C341467mw r6 = xss.A09;
        r6.A01("recAR");
        byte[] bArr = new byte[xss.A00];
        while (xss.A0F == AnonymousClass05K.A0C) {
            if (C22018Xss.A00(xss, bArr) == 1) {
                long j = xss.A05;
                if (j > 0) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        r6.A01("recRECs");
    }
}
