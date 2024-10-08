package X;

/* renamed from: X.UNn  reason: case insensitive filesystem */
public final class C15070UNn extends AnonymousClass0T0 implements XA6 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15070UNn) {
                C15070UNn uNn = (C15070UNn) obj;
                if (this.A00 != uNn.A00 || !0qQ.A0K(this.A01, uNn.A01) || !0qQ.A0K(this.A02, uNn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, this.A00 * 31));
    }

    public C15070UNn(int i, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
