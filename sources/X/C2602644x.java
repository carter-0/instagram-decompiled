package X;

/* renamed from: X.44x  reason: invalid class name and case insensitive filesystem */
public final class C2602644x implements Runnable {
    public final /* synthetic */ 26N A00;
    public final /* synthetic */ Runnable A01;

    public C2602644x(26N r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.A00++;
        this.A01.run();
    }
}
