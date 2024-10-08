package X;

/* renamed from: X.6tb  reason: invalid class name and case insensitive filesystem */
public final class C321116tb implements Runnable {
    public final /* synthetic */ C321016tR A00;

    public C321116tb(C321016tR r1) {
        this.A00 = r1;
    }

    public final void run() {
        C321016tR r3 = this.A00;
        boolean z = false;
        if (r3.A0B != AnonymousClass05K.A0N) {
            z = true;
        }
        r3.A0N = z;
        r3.invalidateSelf();
    }
}
