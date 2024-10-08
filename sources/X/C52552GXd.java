package X;

/* renamed from: X.GXd  reason: case insensitive filesystem */
public final class C52552GXd implements Runnable {
    public final /* synthetic */ AnonymousClass32L A00;

    public C52552GXd(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass32L r2 = this.A00;
        if (r2.isResumed()) {
            2dZ.A0t.A03(r2.requireActivity()).A0T();
        }
    }
}
