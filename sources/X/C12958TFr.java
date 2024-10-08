package X;

/* renamed from: X.TFr  reason: case insensitive filesystem */
public final class C12958TFr implements Runnable {
    public final /* synthetic */ AnonymousClass46Z A00;
    public final /* synthetic */ C12139Snk A01;

    public C12958TFr(AnonymousClass46Z r1, C12139Snk snk) {
        this.A01 = snk;
        this.A00 = r1;
    }

    public final void run() {
        this.A00.onFailure();
    }
}
