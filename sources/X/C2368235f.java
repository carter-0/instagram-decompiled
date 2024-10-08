package X;

/* renamed from: X.35f  reason: invalid class name and case insensitive filesystem */
public final class C2368235f implements 1Nh {
    public 1Ng A00;
    public final Object A01 = new Object();

    public final 1Nh A99(1wn r3, Class cls) {
        0qQ.A0B(cls, 0);
        0qQ.A0B(r3, 1);
        1Ng r1 = this.A00;
        if (r1 != null) {
            r1.A03(r3, cls, this.A01);
            return this;
        }
        throw new IllegalStateException("group was already destroyed");
    }

    public final 1Nh EDz(1wn r2, Class cls) {
        0qQ.A0B(cls, 0);
        1Ng r0 = this.A00;
        if (r0 != null) {
            r0.A02(r2, cls);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ void E3F(Object obj) {
        AnonymousClass1qK r3 = (AnonymousClass1qK) obj;
        1Ng r0 = this.A00;
        if (r0 != null) {
            r0.A00(r3);
            return;
        }
        throw new IllegalStateException("group was already destroyed");
    }

    public C2368235f(1Ng r2) {
        this.A00 = r2;
    }
}
