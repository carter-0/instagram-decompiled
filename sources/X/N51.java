package X;

public final class N51 extends AnonymousClass0T0 implements C74438Put {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public N51(Integer num, String str, String str2, String str3) {
        0qQ.A0B(num, 2);
        this.A01 = str;
        this.A00 = num;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final String Aqe() {
        return this.A01;
    }

    public final Integer Aqk() {
        return this.A00;
    }

    public final boolean CeS() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N51) {
            N51 n51 = (N51) obj;
            if (!0qQ.A0K(n51.A01, this.A01) || n51.A00 != this.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + C69730NrF.A00(this.A00);
    }
}
