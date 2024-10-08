package X;

/* renamed from: X.FtL  reason: case insensitive filesystem */
public final class C51389FtL implements Runnable {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ C273664mz A01;

    public C51389FtL(1P0 r1, C273664mz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        this.A00.onSuccess(this.A01);
    }
}
