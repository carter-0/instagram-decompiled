package X;

/* renamed from: X.UKt  reason: case insensitive filesystem */
public final class C15040UKt extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
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
            if (obj instanceof C15040UKt) {
                C15040UKt uKt = (C15040UKt) obj;
                if (!0qQ.A0K(this.A07, uKt.A07) || !0qQ.A0K(this.A04, uKt.A04) || !0qQ.A0K(this.A08, uKt.A08) || !0qQ.A0K(this.A06, uKt.A06) || !0qQ.A0K(this.A00, uKt.A00) || this.A0A != uKt.A0A || !0qQ.A0K(this.A05, uKt.A05) || !0qQ.A0K(this.A02, uKt.A02) || this.A0C != uKt.A0C || this.A0B != uKt.A0B || !0qQ.A0K(this.A03, uKt.A03) || !0qQ.A0K(this.A01, uKt.A01) || this.A09 != uKt.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A07);
        boolean z = this.A0A;
        int A092 = AnonymousClass7TF.A09(this.A0C, (((AnonymousClass7TF.A09(z, (((((((AnonymousClass7TF.A08(this.A04, A0O) + C54732HQn.A00()) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31);
        return DbS.A06(this.A09, ((((AnonymousClass7TF.A09(this.A0B, A092) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A01)) * 31);
    }

    public C15040UKt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A07 = str;
        this.A04 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A00 = str5;
        this.A0A = z;
        this.A05 = str6;
        this.A02 = str7;
        this.A0C = z2;
        this.A0B = z3;
        this.A03 = str8;
        this.A01 = str9;
        this.A09 = z4;
    }
}
