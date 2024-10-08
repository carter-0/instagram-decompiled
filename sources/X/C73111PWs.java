package X;

/* renamed from: X.PWs  reason: case insensitive filesystem */
public final /* synthetic */ class C73111PWs implements Runnable {
    public final /* synthetic */ C68637NQq A00;

    public /* synthetic */ C73111PWs(C68637NQq nQq) {
        this.A00 = nQq;
    }

    public final void run() {
        C68637NQq nQq = this.A00;
        nQq.A00 = 0;
        nQq.A04 = true;
        nQq.A0C.start();
    }
}
