package X;

/* renamed from: X.GrA  reason: case insensitive filesystem */
public final class C53595GrA extends AnonymousClass0T0 implements JNG {
    public final String A00;
    public final C53451Goj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53595GrA) {
                C53595GrA grA = (C53595GrA) obj;
                if (!0qQ.A0K(this.A01, grA.A01) || !0qQ.A0K(this.A00, grA.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31;
    }

    public C53595GrA(C53451Goj goj, String str) {
        this.A01 = goj;
        this.A00 = str;
    }
}
