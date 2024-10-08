package X;

/* renamed from: X.Qnp  reason: case insensitive filesystem */
public final class C8309Qnp extends C9687Rf5 {
    public final RF4 A00;
    public final C8862RDd A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9687Rf5)) {
                return false;
            }
            C8862RDd rDd = this.A01;
            C8309Qnp qnp = (C8309Qnp) ((C9687Rf5) obj);
            C8862RDd rDd2 = qnp.A01;
            if (rDd == null) {
                if (rDd2 != null) {
                    return false;
                }
            } else if (!rDd.equals(rDd2)) {
                return false;
            }
            RF4 rf4 = this.A00;
            RF4 rf42 = qnp.A00;
            return rf4 == null ? rf42 == null : rf4.equals(rf42);
        }
    }

    public final int hashCode() {
        return ((AnonymousClass7TG.A0C(this.A01) ^ 1000003) * 1000003) ^ AnonymousClass7TE.A0L(this.A00);
    }

    public C8309Qnp(RF4 rf4, C8862RDd rDd) {
        this.A01 = rDd;
        this.A00 = rf4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NetworkConnectionInfo{networkType=");
        A1A.append(this.A01);
        A1A.append(", mobileSubtype=");
        return C66582MXn.A0v(this.A00, A1A);
    }
}
