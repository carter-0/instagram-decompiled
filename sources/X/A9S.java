package X;

public final class A9S {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A9S)) {
            return false;
        }
        A9S a9s = (A9S) obj;
        if (this.A02 == a9s.A02 && this.A01 == a9s.A01 && this.A03 == a9s.A03 && this.A00 == a9s.A00 && 0qQ.A0K(this.A05, a9s.A05)) {
            String str = this.A04;
            String str2 = a9s.A04;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.A02 * 31) + this.A01) * 31;
        String str = this.A05;
        if (str != null) {
            int A08 = ((AnonymousClass7TF.A08(str, i) + this.A03) * 31) + this.A00;
            String str2 = this.A04;
            if (str2 != null) {
                return (A08 * 31) + str2.hashCode();
            }
            return A08;
        }
        throw AnonymousClass7TE.A0y();
    }

    public A9S(String str, String str2, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
