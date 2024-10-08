package X;

/* renamed from: X.46d  reason: invalid class name and case insensitive filesystem */
public final class C2605546d implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass46Z A01;

    public C2605546d(AnonymousClass46Z r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void run() {
        int i = this.A00;
        AnonymousClass46Z r0 = this.A01;
        if (i == -1) {
            r0.onFailure();
        } else {
            r0.onSuccess();
        }
    }
}
