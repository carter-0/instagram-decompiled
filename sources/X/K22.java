package X;

public final class K22 extends C63040KqV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K22) {
                K22 k22 = (K22) obj;
                if (!0qQ.A0K(this.A02, k22.A02) || !0qQ.A0K(this.A03, k22.A03) || !0qQ.A0K(this.A01, k22.A01) || this.A0A != k22.A0A || !0qQ.A0K(this.A05, k22.A05) || this.A09 != k22.A09 || !0qQ.A0K(this.A04, k22.A04) || this.A07 != k22.A07 || !0qQ.A0K(this.A00, k22.A00) || this.A08 != k22.A08 || this.A06 != k22.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02)))))))))));
    }

    public K22(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A0A = z;
        this.A05 = str4;
        this.A09 = z2;
        this.A04 = str5;
        this.A07 = z3;
        this.A00 = str6;
        this.A08 = z4;
        this.A06 = z5;
    }
}
