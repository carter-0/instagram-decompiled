package X;

/* renamed from: X.Urc  reason: case insensitive filesystem */
public final class C16275Urc extends C18001Vjd {
    public final C18001Vjd A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16275Urc) {
                C16275Urc urc = (C16275Urc) obj;
                if (!0qQ.A0K(this.A02, urc.A02) || !0qQ.A0K(this.A01, urc.A01) || !0qQ.A0K(this.A00, urc.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C16275Urc(C18001Vjd vjd, Integer num, String str) {
        super(vjd.A01, AnonymousClass05K.A0u, str, "see_all", 1.0f);
        this.A02 = str;
        this.A01 = num;
        this.A00 = vjd;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02)) * 31 * 31);
    }
}
