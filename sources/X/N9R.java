package X;

public final class N9R extends AnonymousClass0T0 implements C74270Pry {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9R) {
                N9R n9r = (N9R) obj;
                if (!0qQ.A0K(this.A01, n9r.A01) || !0qQ.A0K(this.A02, n9r.A02) || this.A00 != n9r.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01)) + this.A00;
    }

    public N9R(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
