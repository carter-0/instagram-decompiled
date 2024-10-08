package X;

/* renamed from: X.Fsv  reason: case insensitive filesystem */
public final class C51363Fsv implements Runnable {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ Throwable A01;

    public C51363Fsv(1P0 r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        1P0 r2 = this.A00;
        r2.onFail(new C268664dn(this.A01));
        r2.onFinish();
    }
}
