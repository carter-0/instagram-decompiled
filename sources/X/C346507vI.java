package X;

/* renamed from: X.7vI  reason: invalid class name and case insensitive filesystem */
public final class C346507vI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C341687nM A01;
    public final /* synthetic */ String A02;

    public C346507vI(int i, String str, C341687nM r3) {
        this.A00 = i;
        this.A01 = r3;
        this.A02 = str;
    }

    public final void run() {
        int i = this.A00;
        if (i == 0 || i == 4) {
            this.A01.onSuccess();
            return;
        }
        C382299dT r2 = new C382299dT(this.A02);
        r2.A00("fba_error_code", String.valueOf(i));
        this.A01.DCg(r2);
    }
}
