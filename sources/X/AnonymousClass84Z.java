package X;

/* renamed from: X.84Z  reason: invalid class name */
public final class AnonymousClass84Z implements Runnable {
    public final /* synthetic */ AnonymousClass84Y A00;
    public final /* synthetic */ C312676ew A01;
    public final /* synthetic */ C312136ds A02;

    public AnonymousClass84Z(AnonymousClass84Y r1, C312676ew r2, C312136ds r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C314366i5 r1;
        C312676ew r2 = this.A01;
        if (r2.A0B != null) {
            r1 = r2.A0B;
        } else {
            C312676ew.A00(r2);
            r1 = r2.A0B;
            r1.getClass();
        }
        r1.A04(this.A02);
        this.A00.DBW(r2.A0B);
    }
}
