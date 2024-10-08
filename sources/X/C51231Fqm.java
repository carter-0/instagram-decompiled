package X;

/* renamed from: X.Fqm  reason: case insensitive filesystem */
public final class C51231Fqm implements Runnable {
    public final /* synthetic */ C47931ENi A00;

    public C51231Fqm(C47931ENi eNi) {
        this.A00 = eNi;
    }

    public final void run() {
        AnonymousClass6ST r1 = this.A00.A00.A05;
        if (r1 == null) {
            return;
        }
        if (r1.getOwnerActivity() == null || !r1.getOwnerActivity().isDestroyed()) {
            r1.cancel();
        }
    }
}
