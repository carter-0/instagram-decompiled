package X;

/* renamed from: X.M6l  reason: case insensitive filesystem */
public final class C65974M6l implements Runnable {
    public final /* synthetic */ MV5 A00;
    public final /* synthetic */ Throwable A01;

    public C65974M6l(MV5 mv5, Throwable th) {
        this.A00 = mv5;
        this.A01 = th;
    }

    public final void run() {
        MV5 mv5 = this.A00;
        mv5.onFinish();
        mv5.DEG(new Exception(this.A01));
    }
}
