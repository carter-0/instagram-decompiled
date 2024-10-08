package X;

/* renamed from: X.DHt  reason: case insensitive filesystem */
public final class C45990DHt implements Runnable {
    public final /* synthetic */ C46215DQt A00;
    public final /* synthetic */ Throwable A01;

    public C45990DHt(C46215DQt dQt, Throwable th) {
        this.A00 = dQt;
        this.A01 = th;
    }

    public final void run() {
        this.A00.onError(this.A01);
    }
}
