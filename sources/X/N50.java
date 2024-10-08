package X;

public final class N50 extends AnonymousClass0T0 implements C74438Put {
    public final C66720MbR A00;
    public final String A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N50) {
                N50 n50 = (N50) obj;
                if (!0qQ.A0K(this.A01, n50.A01) || this.A02 != n50.A02 || !0qQ.A0K(this.A00, n50.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Aqe() {
        return this.A01;
    }

    public final Integer Aqk() {
        return this.A02;
    }

    public final boolean CeS() {
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TE.A0O(this.A01) + C69730NrF.A00(this.A02)) * 31);
    }

    public N50(C66720MbR mbR, Integer num, String str) {
        AnonymousClass7TG.A1O(str, num);
        this.A01 = str;
        this.A02 = num;
        this.A00 = mbR;
    }
}
