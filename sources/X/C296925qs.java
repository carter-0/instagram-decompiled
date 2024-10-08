package X;

/* renamed from: X.5qs  reason: invalid class name and case insensitive filesystem */
public final class C296925qs extends C296935qt implements C296955qv, C296975qx {
    public long A00 = -1;
    public final C295825oy A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C296925qs(C295825oy r3, C296905qq r4, boolean z) {
        super(r4, r3.A0A);
        0qQ.A0B(r3, 2);
        this.A01 = r3;
        this.A02 = z;
    }

    public final 1Xj BPf() {
        1Xj r0 = this.A01.A00().A02;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final long BaJ() {
        return this.A00;
    }

    public final boolean CP9() {
        return this.A02;
    }

    public final String getId() {
        return this.A01.A0A;
    }

    public final void EfJ(long j) {
        this.A00 = j;
    }
}
