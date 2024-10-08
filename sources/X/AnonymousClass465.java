package X;

/* renamed from: X.465  reason: invalid class name */
public final class AnonymousClass465 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2603145d A01;

    public AnonymousClass465(C2603145d r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        0qQ.A0B(AnonymousClass05K.A0C, 0);
        C250773m2 r1 = this.A01.A00;
        if (r1 != null) {
            r1.onNetworkInterfaceChanged(this.A00);
        }
    }
}
