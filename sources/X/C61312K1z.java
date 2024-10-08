package X;

/* renamed from: X.K1z  reason: case insensitive filesystem */
public final class C61312K1z extends C63040KqV {
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
            if (obj instanceof C61312K1z) {
                C61312K1z k1z = (C61312K1z) obj;
                if (!"funding failure".equals("funding failure") || !0qQ.A0K(this.A07, k1z.A07) || !0qQ.A0K(this.A04, k1z.A04) || !0qQ.A0K(this.A06, k1z.A06) || !0qQ.A0K(this.A05, k1z.A05) || this.A00 != k1z.A00 || !0qQ.A0K(this.A02, k1z.A02) || !0qQ.A0K(this.A01, k1z.A01) || !0qQ.A0K(this.A03, k1z.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C61312K1z(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C51974G9v.A1M(str, str2, str3);
        AnonymousClass7TF.A1E(str4, 5, str5);
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A02 = str5;
        this.A01 = str6;
        this.A03 = str7;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A07, 1181165945)));
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, (AnonymousClass7TF.A08(this.A05, A08) + this.A00) * 31)));
    }
}
