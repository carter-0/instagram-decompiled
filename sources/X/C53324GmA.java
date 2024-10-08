package X;

/* renamed from: X.GmA  reason: case insensitive filesystem */
public final class C53324GmA extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass3UM A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53324GmA) {
                C53324GmA gmA = (C53324GmA) obj;
                if (!0qQ.A0K(this.A01, gmA.A01) || this.A00 != gmA.A00 || !0qQ.A0K(this.A06, gmA.A06) || !0qQ.A0K(this.A05, gmA.A05) || !0qQ.A0K(this.A07, gmA.A07) || !0qQ.A0K(this.A08, gmA.A08) || !0qQ.A0K(this.A04, gmA.A04) || !0qQ.A0K(this.A03, gmA.A03) || this.A02 != gmA.A02 || this.A09 != gmA.A09 || this.A0A != gmA.A0A || this.A0B != gmA.A0B || this.A0C != gmA.A0C) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53324GmA(AnonymousClass3UM r2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 9);
        this.A01 = r2;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = str5;
        this.A03 = str6;
        this.A02 = num;
        this.A09 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A0C = z4;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A06, (AnonymousClass7TE.A0K(this.A01) + this.A00) * 31);
        return DbS.A06(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, (((((((((AnonymousClass7TF.A08(this.A05, A082) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A03)) * 31) + C49013Enp.A00(this.A02)) * 31))));
    }
}
