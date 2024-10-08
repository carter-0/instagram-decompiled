package X;

/* renamed from: X.M6f  reason: case insensitive filesystem */
public final class C65968M6f implements Runnable {
    public final /* synthetic */ MTX A00;
    public final /* synthetic */ Exception A01;

    public C65968M6f(MTX mtx, Exception exc) {
        this.A00 = mtx;
        this.A01 = exc;
    }

    public final void run() {
        this.A00.onFailure(this.A01);
    }
}
