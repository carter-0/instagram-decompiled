package X;

/* renamed from: X.3C5  reason: invalid class name */
public final class AnonymousClass3C5 implements AnonymousClass394 {
    public final 1Vf A00;
    public final C251983oI A01;
    public final 1Vg A02;
    public final 1Vg A03;

    public final void AOP(String str) {
        C251983oI r3 = this.A01;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = this.A03;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADh(1, str);
        r3.beginTransaction();
        try {
            acquire.ATQ();
            r3.setTransactionSuccessful();
        } finally {
            r3.endTransaction();
            r2.release(acquire);
        }
    }

    public AnonymousClass3C5(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new AnonymousClass3C6(r2, this);
        this.A03 = new AnonymousClass3C8(r2, this);
        this.A02 = new AnonymousClass3CA(r2, this);
    }
}
