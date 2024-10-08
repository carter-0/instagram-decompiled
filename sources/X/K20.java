package X;

public final class K20 extends C63040KqV {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K20) {
                K20 k20 = (K20) obj;
                if (!"gifting failure".equals("gifting failure") || !0qQ.A0K(this.A02, k20.A02) || !0qQ.A0K(this.A06, k20.A06) || !0qQ.A0K(this.A01, k20.A01) || !0qQ.A0K(this.A07, k20.A07) || !0qQ.A0K(this.A04, k20.A04) || !0qQ.A0K(this.A05, k20.A05) || !0qQ.A0K(this.A03, k20.A03) || this.A00 != k20.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public K20(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C51974G9v.A1S(str, str2, str3, str4, str5);
        AnonymousClass7TF.A1F(str6, 7, str7);
        this.A02 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A03 = str7;
        this.A00 = i;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A02, -890099868))))))) + this.A00;
    }
}
