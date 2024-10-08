package X;

/* renamed from: X.PUw  reason: case insensitive filesystem */
public final class C73063PUw implements Runnable {
    public final /* synthetic */ C70671OFs A00;

    public C73063PUw(C70671OFs oFs) {
        this.A00 = oFs;
    }

    public final void run() {
        C70671OFs oFs = this.A00;
        synchronized (oFs.A03) {
            oFs.A00 = C51965G9l.A0v(oFs.A01);
            oFs.A01 = null;
        }
    }
}
