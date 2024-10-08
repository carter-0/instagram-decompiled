package X;

/* renamed from: X.S5z  reason: case insensitive filesystem */
public final class C11022S5z {
    public final S6Z A00;
    public final S6V A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11022S5z) {
                C11022S5z s5z = (C11022S5z) obj;
                if (!0qQ.A0K(this.A02, s5z.A02) || !0qQ.A0K(this.A00, s5z.A00) || !0qQ.A0K(this.A01, s5z.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2 = this.A02;
        S6Z s6z = this.A00;
        String str3 = null;
        if (s6z != null) {
            str = s6z.A01;
        } else {
            str = null;
        }
        S6V s6v = this.A01;
        if (s6v != null) {
            str3 = s6v.A02;
        }
        return Pxf.A0B(str2, str, str3);
    }

    public C11022S5z(S6Z s6z, S6V s6v, String str) {
        this.A02 = str;
        this.A00 = s6z;
        this.A01 = s6v;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ECPContactInformation(fullName=");
        A1A.append(this.A02);
        A1A.append(", email=");
        A1A.append(this.A00);
        A1A.append(", phone=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
