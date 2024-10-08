package X;

/* renamed from: X.TBg  reason: case insensitive filesystem */
public final class C12866TBg implements Runnable {
    public final /* synthetic */ C12139Snk A00;

    public C12866TBg(C12139Snk snk) {
        this.A00 = snk;
    }

    public final void run() {
        C12139Snk snk = this.A00;
        C8947RGw rGw = C8947RGw.SERVICE_STOP;
        if (snk.A0E) {
            snk.A0E = false;
            snk.A0D.A0B();
            snk.A0D.A08(rGw);
            C12139Snk.A02(snk, (C8901REt) null);
        }
    }
}
