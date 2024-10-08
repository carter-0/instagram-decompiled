package X;

public final class N4z extends AnonymousClass0T0 implements C74438Put {
    public final String A00;
    public final Integer A01;

    public N4z(Integer num, String str) {
        0qQ.A0B(num, 2);
        this.A00 = str;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4z) {
                N4z n4z = (N4z) obj;
                if (!0qQ.A0K(this.A00, n4z.A00) || this.A01 != n4z.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aqe() {
        return this.A00;
    }

    public final Integer Aqk() {
        return this.A01;
    }

    public final boolean CeS() {
        return false;
    }

    public final int hashCode() {
        int A0O = (AnonymousClass7TE.A0O(this.A00) + C69730NrF.A00(this.A01)) * 31;
        int A002 = C54732HQn.A00();
        return ((A0O + A002) * 31) + A002;
    }
}
