package X;

/* renamed from: X.3oP  reason: invalid class name and case insensitive filesystem */
public final class C252003oP implements AnonymousClass1T9 {
    public AnonymousClass1T9 A00;
    public final int A01;

    public final void FJj(1Fe r3) {
        17k.A07(this.A00, "setDelegate should get called before this");
        this.A00.FJj(r3);
    }

    public final void cancel() {
        17k.A07(this.A00, "setDelegate should get called before this");
        this.A00.cancel();
    }

    public final int getRequestId() {
        return this.A01;
    }

    public C252003oP(int i) {
        this.A01 = i;
    }
}
