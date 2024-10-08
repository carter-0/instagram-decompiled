package X;

/* renamed from: X.PXv  reason: case insensitive filesystem */
public final class C73160PXv implements Runnable {
    public final /* synthetic */ C11199SEz A00;
    public final /* synthetic */ Runnable A01;

    public C73160PXv(C11199SEz sEz, Runnable runnable) {
        this.A00 = sEz;
        this.A01 = runnable;
    }

    public final void run() {
        C11199SEz.A03.execute(this.A01);
    }
}
