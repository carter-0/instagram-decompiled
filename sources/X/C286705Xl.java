package X;

/* renamed from: X.5Xl  reason: invalid class name and case insensitive filesystem */
public final class C286705Xl {
    public boolean A00 = true;
    public final C267304bL A01;
    public final C284895Os A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public final Object A00() {
        if (this.A04) {
            return null;
        }
        Object obj = this.A03;
        if (obj != null) {
            return obj;
        }
        AnonymousClass5XN.A04("Unexpected form of a provided value");
        throw AnonymousClass00P.createAndThrow();
    }

    public C286705Xl(C267304bL r2, C284895Os r3, Object obj, boolean z, boolean z2) {
        this.A01 = r2;
        this.A04 = z;
        this.A02 = r3;
        this.A05 = z2;
        this.A03 = obj;
    }
}
