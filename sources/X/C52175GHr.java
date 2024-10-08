package X;

/* renamed from: X.GHr  reason: case insensitive filesystem */
public final class C52175GHr extends AnonymousClass0T0 implements JN2 {
    public final int A00;
    public final 1Xj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52175GHr) {
                C52175GHr gHr = (C52175GHr) obj;
                if (!0qQ.A0K(this.A01, gHr.A01) || this.A00 != gHr.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C52175GHr(1Xj r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
