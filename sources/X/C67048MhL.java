package X;

/* renamed from: X.MhL  reason: case insensitive filesystem */
public final class C67048MhL implements Runnable {
    public final /* synthetic */ C66976MgA A00;
    public final /* synthetic */ boolean A01;

    public C67048MhL(C66976MgA mgA, boolean z) {
        this.A01 = z;
        this.A00 = mgA;
    }

    public final void run() {
        AnonymousClass4AE r0;
        if (this.A01 && (r0 = this.A00.A03) != null) {
            r0.A00();
        }
    }
}
