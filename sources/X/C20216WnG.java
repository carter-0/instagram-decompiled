package X;

/* renamed from: X.WnG  reason: case insensitive filesystem */
public final class C20216WnG implements Runnable {
    public final /* synthetic */ AnonymousClass73G A00;
    public final /* synthetic */ Throwable A01;

    public C20216WnG(AnonymousClass73G r1, Throwable th) {
        this.A00 = r1;
        this.A01 = th;
    }

    public final void run() {
        AnonymousClass73G r2 = this.A00;
        r2.A01.A00(AnonymousClass05K.A01);
        C324596za r22 = r2.A00;
        r22.onFail(new C268664dn(this.A01));
        r22.onFinish();
    }
}
