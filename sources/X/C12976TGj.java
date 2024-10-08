package X;

/* renamed from: X.TGj  reason: case insensitive filesystem */
public final class C12976TGj implements Runnable {
    public final /* synthetic */ C12387Ssb A00;
    public final /* synthetic */ Exception A01;

    public C12976TGj(C12387Ssb ssb, Exception exc) {
        this.A00 = ssb;
        this.A01 = exc;
    }

    public final void run() {
        this.A00.A00.onFailure(this.A01);
    }
}
