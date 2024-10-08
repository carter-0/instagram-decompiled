package X;

/* renamed from: X.3ab  reason: invalid class name and case insensitive filesystem */
public final class C244073ab extends 2WX {
    public final 2WX A00;
    public final 2WX A01;

    public C244073ab(2WX r2, 2WX r3) {
        super(r2, (AnonymousClass2WY) null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C244073ab) {
                C244073ab r5 = (C244073ab) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        2WX r0 = this.A00;
        return ((r0 == null ? 0 : r0.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CombinedStyle(first=");
        sb.append(this.A00);
        sb.append(C66579MXk.A00(82));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public final void A02(0sP r2) {
        2WX r0 = this.A00;
        if (r0 != null) {
            r0.A02(r2);
        }
        this.A01.A02(r2);
    }
}
