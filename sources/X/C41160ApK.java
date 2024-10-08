package X;

/* renamed from: X.ApK  reason: case insensitive filesystem */
public final class C41160ApK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C387659mZ A01;
    public final /* synthetic */ boolean A02;

    public C41160ApK(C387659mZ r1, int i, boolean z) {
        this.A02 = z;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        boolean z = this.A02;
        C387659mZ r0 = this.A01;
        if (z) {
            r0.A01.EKg(this.A00, r0.A01.A00);
        } else {
            r0.A01.A08(this.A00);
        }
    }
}
