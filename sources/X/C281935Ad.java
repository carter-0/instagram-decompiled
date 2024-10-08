package X;

/* renamed from: X.5Ad  reason: invalid class name and case insensitive filesystem */
public final class C281935Ad extends AnonymousClass0T0 {
    public final C281905Aa A00;
    public final C281905Aa A01;

    public C281935Ad(C281905Aa r2, C281905Aa r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C281935Ad) {
                C281935Ad r5 = (C281935Ad) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }
}
