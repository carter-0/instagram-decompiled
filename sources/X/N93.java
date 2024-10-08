package X;

public final class N93 extends AnonymousClass0T0 implements C74269Prx {
    public final N36 A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public N93(N36 n36, String str, String str2, boolean z) {
        0qQ.A0B(str, 2);
        this.A00 = n36;
        this.A03 = str;
        this.A02 = z;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N93) {
                N93 n93 = (N93) obj;
                if (!0qQ.A0K(this.A00, n93.A00) || !0qQ.A0K(this.A03, n93.A03) || this.A02 != n93.A02 || !0qQ.A0K(this.A01, n93.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TG.A0C(this.A00) * 31)) + C41845B3m.A00(this.A01);
    }
}
