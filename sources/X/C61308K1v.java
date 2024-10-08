package X;

/* renamed from: X.K1v  reason: case insensitive filesystem */
public final class C61308K1v extends C62704Kl4 {
    public final C61039Jvd A00;
    public final C61077JwF A01;

    public C61308K1v(C61039Jvd jvd, C61077JwF jwF) {
        0qQ.A0B(jwF, 2);
        this.A00 = jvd;
        this.A01 = jwF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61308K1v) {
                C61308K1v k1v = (C61308K1v) obj;
                if (!0qQ.A0K(this.A00, k1v.A00) || !0qQ.A0K(this.A01, k1v.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
