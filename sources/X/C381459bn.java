package X;

/* renamed from: X.9bn  reason: invalid class name and case insensitive filesystem */
public final class C381459bn extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381459bn) {
                C381459bn r5 = (C381459bn) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, this.A00 * 31) + this.A02.hashCode();
    }

    public C381459bn(int i, String str, String str2) {
        AnonymousClass7TG.A1Q(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
