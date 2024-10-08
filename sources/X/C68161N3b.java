package X;

/* renamed from: X.N3b  reason: case insensitive filesystem */
public final class C68161N3b extends AnonymousClass0T0 {
    public final long A00;
    public final 2Eq A01;
    public final C74249Prd A02;
    public final Boolean A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68161N3b) {
                C68161N3b n3b = (C68161N3b) obj;
                if (!0qQ.A0K(this.A07, n3b.A07) || !0qQ.A0K(this.A06, n3b.A06) || this.A00 != n3b.A00 || !0qQ.A0K(this.A0A, n3b.A0A) || !0qQ.A0K(this.A01, n3b.A01) || this.A0C != n3b.A0C || !0qQ.A0K(this.A05, n3b.A05) || !0qQ.A0K(this.A03, n3b.A03) || !0qQ.A0K(this.A09, n3b.A09) || this.A04 != n3b.A04 || !0qQ.A0K(this.A02, n3b.A02) || !0qQ.A0K(this.A08, n3b.A08) || this.A0B != n3b.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C68161N3b(2Eq r2, C74249Prd prd, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        0qQ.A0B(prd, 11);
        this.A07 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A0A = str3;
        this.A01 = r2;
        this.A0C = z;
        this.A05 = l;
        this.A03 = bool;
        this.A09 = str4;
        this.A04 = num;
        this.A02 = prd;
        this.A08 = str5;
        this.A0B = z2;
    }

    public final boolean A00() {
        if (JTS.A06(this.A05) > 0 || AnonymousClass7TF.A1Y(this.A03, true)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int A072 = C51972G9s.A07(this.A00, (AnonymousClass7TE.A0O(this.A07) + AnonymousClass7TG.A0E(this.A06)) * 31);
        int A092 = (((((AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A08(this.A0A, A072) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "EDITED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "EXPIRED";
                break;
            case 4:
                str = "UPDATED";
                break;
            default:
                str = "ADDED";
                break;
        }
        int A0F = C51971G9r.A0F(str, intValue, A092);
        return DbS.A06(this.A0B, (AnonymousClass7TF.A07(this.A02, A0F) + C41845B3m.A00(this.A08)) * 31);
    }
}
