package X;

public final class N9M extends AnonymousClass0T0 implements C74269Prx {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final String A04;

    public N9M() {
        this((Integer) null, "", (String) null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9M) {
                N9M n9m = (N9M) obj;
                if (this.A03 != n9m.A03 || this.A02 != n9m.A02 || !0qQ.A0K(this.A01, n9m.A01) || !0qQ.A0K(this.A00, n9m.A00) || !0qQ.A0K(this.A04, n9m.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A03))) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A04);
    }

    public N9M(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = str;
        this.A00 = num;
        this.A04 = str2;
    }
}
