package X;

/* renamed from: X.M6n  reason: case insensitive filesystem */
public final class C65976M6n implements Runnable {
    public final /* synthetic */ MV5 A00;
    public final /* synthetic */ Throwable A01;

    public C65976M6n(MV5 mv5, Throwable th) {
        this.A00 = mv5;
        this.A01 = th;
    }

    public final void run() {
        MV5 mv5 = this.A00;
        if (mv5 != null) {
            mv5.onFinish();
            mv5.DEG((Exception) this.A01);
        }
    }
}
