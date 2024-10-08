package X;

/* renamed from: X.40L  reason: invalid class name */
public final class AnonymousClass40L {
    public final 1Vf A00;
    public final C251983oI A01;
    public final 1Vg A02;

    public final void A00(long j) {
        C251983oI r3 = this.A01;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = this.A02;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADa(1, j);
        try {
            r3.beginTransaction();
            acquire.ATQ();
            r3.setTransactionSuccessful();
            r3.endTransaction();
            r2.release(acquire);
        } catch (Throwable th) {
            r2.release(acquire);
            throw th;
        }
    }

    public AnonymousClass40L(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new C261734As(r2, this);
        this.A02 = new C261744At(r2, this);
    }

    public AnonymousClass40L() {
    }
}
