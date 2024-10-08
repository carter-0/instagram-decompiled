package X;

/* renamed from: X.3HJ  reason: invalid class name */
public final class AnonymousClass3HJ implements AnonymousClass1T9 {
    public final /* synthetic */ 1QS A00;
    public final /* synthetic */ C239053Eo A01;
    public final /* synthetic */ 1Lt A02;

    public AnonymousClass3HJ(1QS r1, C239053Eo r2, 1Lt r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void FJj(1Fe r3) {
        C239053Eo r1 = this.A01;
        AnonymousClass1T9 r0 = r1.A01;
        if (r0 != null) {
            r0.FJj(r3);
        } else {
            r1.A02 = r3;
        }
    }

    public final void cancel() {
        C239053Eo r1 = this.A01;
        AnonymousClass1T9 r0 = r1.A01;
        if (r0 != null) {
            r0.cancel();
        } else {
            r1.A04 = true;
        }
    }

    public final int getRequestId() {
        return this.A00.A04;
    }
}
