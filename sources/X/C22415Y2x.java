package X;

/* renamed from: X.Y2x  reason: case insensitive filesystem */
public final class C22415Y2x implements Runnable {
    public final Throwable A00;
    public final /* synthetic */ XDD A01;

    public C22415Y2x(XDD xdd, Throwable th) {
        this.A01 = xdd;
        this.A00 = th;
    }

    public final void run() {
        try {
            XDD xdd = this.A01;
            xdd.A02.onError(this.A00);
            xdd.A03.dispose();
        } catch (Throwable th) {
            this.A01.A03.dispose();
            throw th;
        }
    }
}
