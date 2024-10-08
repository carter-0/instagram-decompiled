package X;

/* renamed from: X.Akg  reason: case insensitive filesystem */
public final class C40872Akg implements Runnable {
    public final /* synthetic */ AnonymousClass7UC A00;

    public C40872Akg(AnonymousClass7UC r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7UC r1 = this.A00;
        if (r1.A01.isResumed()) {
            r1.A00(false);
        }
    }
}
