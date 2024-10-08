package X;

/* renamed from: X.JcL  reason: case insensitive filesystem */
public final class C59955JcL implements Runnable {
    public final /* synthetic */ C59741JVz A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public C59955JcL(C59741JVz jVz, Runnable runnable, boolean z) {
        this.A01 = runnable;
        this.A00 = jVz;
        this.A02 = z;
    }

    public final void run() {
        this.A01.run();
        this.A00.A0M(this.A02);
    }
}
