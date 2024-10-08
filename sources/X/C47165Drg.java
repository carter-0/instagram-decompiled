package X;

/* renamed from: X.Drg  reason: case insensitive filesystem */
public final class C47165Drg extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final boolean A09;
    public final boolean A0A;

    public C47165Drg(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A09 = z;
        this.A07 = z2;
        this.A0A = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47165Drg) {
                C47165Drg drg = (C47165Drg) obj;
                if (!0qQ.A0K(this.A04, drg.A04) || !0qQ.A0K(this.A06, drg.A06) || this.A00 != drg.A00 || !0qQ.A0K(this.A03, drg.A03) || !0qQ.A0K(this.A05, drg.A05) || !0qQ.A0K(this.A01, drg.A01) || !0qQ.A0K(this.A02, drg.A02) || this.A09 != drg.A09 || this.A07 != drg.A07 || this.A0A != drg.A0A || this.A08 != drg.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        int A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A09, (((((((((AnonymousClass7TF.A08(this.A06, A0O) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31));
        return DbS.A06(this.A08, (AnonymousClass7TF.A09(this.A0A, A092) + C54732HQn.A00()) * 31);
    }
}
