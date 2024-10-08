package X;

/* renamed from: X.Ald  reason: case insensitive filesystem */
public final class C40931Ald implements Runnable {
    public final /* synthetic */ C341427mr A00;
    public final /* synthetic */ C341687nM A01;

    public C40931Ald(C341427mr r1, C341687nM r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C382299dT r1 = new C382299dT("addOutput error: Failed to post message");
        r1.A01(this.A00.A03());
        this.A01.DCg(r1);
    }
}
