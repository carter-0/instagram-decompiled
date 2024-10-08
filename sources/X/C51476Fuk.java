package X;

/* renamed from: X.Fuk  reason: case insensitive filesystem */
public final class C51476Fuk implements Runnable {
    public final /* synthetic */ FV4 A00;
    public final /* synthetic */ F39 A01;
    public final /* synthetic */ boolean A02;

    public C51476Fuk(FV4 fv4, F39 f39, boolean z) {
        this.A00 = fv4;
        this.A01 = f39;
        this.A02 = z;
    }

    public final void run() {
        FV4 fv4 = this.A00;
        F39 f39 = this.A01;
        boolean z = this.A02;
        fv4.A01 = f39;
        if (z) {
            fv4.A00 = f39.A00();
        }
    }
}
