package X;

public final class DI0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public DI0(1Xj r1, AnonymousClass3W1 r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass3W1 r2 = this.A02;
        int A0o = this.A01.A0o();
        if (A0o != r2.A04) {
            r2.A04 = A0o;
            AnonymousClass3W1.A00(r2, 38);
        }
        r2.A2W = false;
        r2.A0X = this.A00;
    }
}
