package X;

public final class UFj extends V28 {
    public final Integer A00;
    public final String A01;

    public UFj(String str, Integer num) {
        0qQ.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UFj) {
                UFj uFj = (UFj) obj;
                if (!0qQ.A0K(this.A01, uFj.A01) || this.A00 != uFj.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        Integer num = this.A00;
        return A0O + C51971G9r.A0D(num, C18090VlK.A01(num));
    }
}
