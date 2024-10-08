package X;

/* renamed from: X.BAy  reason: case insensitive filesystem */
public final class C42023BAy extends AnonymousClass0T0 {
    public final C60903JtN A00;
    public final N49 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42023BAy) {
                C42023BAy bAy = (C42023BAy) obj;
                if (!0qQ.A0K(this.A01, bAy.A01) || !0qQ.A0K(this.A00, bAy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C42023BAy(N49 n49, C60903JtN jtN) {
        this.A01 = n49;
        this.A00 = jtN;
    }
}
