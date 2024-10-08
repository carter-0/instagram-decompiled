package X;

/* renamed from: X.Wlq  reason: case insensitive filesystem */
public final class C20130Wlq implements Runnable {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ Throwable A01;

    public C20130Wlq(C341737nR r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        this.A00.onError(this.A01);
    }
}
