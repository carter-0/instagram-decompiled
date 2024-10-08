package X;

public final class N52 extends AnonymousClass0T0 implements C74438Put {
    public final N2c A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public N52(N2c n2c, Integer num, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(num, 2);
        this.A04 = str;
        this.A01 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = n2c;
        this.A03 = str4;
        this.A02 = str5;
        this.A07 = AnonymousClass7TF.A1V(n2c);
    }

    public final String Aqe() {
        return this.A04;
    }

    public final Integer Aqk() {
        return this.A01;
    }

    public final boolean CeS() {
        return this.A07;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N52) {
            N52 n52 = (N52) obj;
            if (!0qQ.A0K(n52.A04, this.A04) || n52.A01 != this.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A04) + C69730NrF.A00(this.A01);
    }
}
