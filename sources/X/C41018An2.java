package X;

/* renamed from: X.An2  reason: case insensitive filesystem */
public final class C41018An2 implements Runnable {
    public final /* synthetic */ AnonymousClass8GA A00;
    public final /* synthetic */ Runnable A01;

    public C41018An2(AnonymousClass8GA r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.A05 = false;
        this.A01.run();
    }
}
