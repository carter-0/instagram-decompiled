package X;

/* renamed from: X.JuF  reason: case insensitive filesystem */
public final class C60957JuF extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60957JuF) {
                C60957JuF juF = (C60957JuF) obj;
                if (!0qQ.A0K(this.A06, juF.A06) || !0qQ.A0K(this.A07, juF.A07) || !0qQ.A0K(this.A02, juF.A02) || !0qQ.A0K(this.A05, juF.A05) || !0qQ.A0K(this.A03, juF.A03) || this.A01 != juF.A01 || this.A00 != juF.A00 || !0qQ.A0K(this.A04, juF.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A06))));
        return C41845B3m.A01(this.A04, (((AnonymousClass7TF.A08(this.A03, A08) + this.A01) * 31) + this.A00) * 31);
    }

    public C60957JuF(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        C51974G9v.A1P(str, str2, str3, str4);
        AnonymousClass7TF.A1F(str5, 5, str6);
        this.A06 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A03 = str5;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str6;
    }
}
