package X;

public final class N3L extends AnonymousClass0T0 {
    public final long A00;
    public final C69354Njt A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3L) {
                N3L n3l = (N3L) obj;
                if (!0qQ.A0K(this.A0C, n3l.A0C) || this.A00 != n3l.A00 || !0qQ.A0K(this.A0D, n3l.A0D) || !0qQ.A0K(this.A06, n3l.A06) || !0qQ.A0K(this.A08, n3l.A08) || !0qQ.A0K(this.A07, n3l.A07) || !0qQ.A0K(this.A0B, n3l.A0B) || !0qQ.A0K(this.A0A, n3l.A0A) || !0qQ.A0K(this.A09, n3l.A09) || this.A01 != n3l.A01 || this.A03 != n3l.A03 || this.A04 != n3l.A04 || this.A05 != n3l.A05 || this.A02 != n3l.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        String str4;
        int A082 = AnonymousClass7TF.A08(this.A0D, C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A0C)));
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A09, (((((((AnonymousClass7TF.A08(this.A06, A082) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + C41845B3m.A00(this.A0A)) * 31));
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "VERTICAL";
        } else {
            str = "HORIZONTAL";
        }
        int A0F = C51971G9r.A0F(str, intValue, A072);
        int intValue2 = this.A04.intValue();
        if (1 != intValue2) {
            str2 = "PRIMARY";
        } else {
            str2 = "SECONDARY";
        }
        int A0F2 = C51971G9r.A0F(str2, intValue2, A0F);
        int intValue3 = this.A05.intValue();
        if (1 != intValue3) {
            str3 = "PRIMARY";
        } else {
            str3 = "SECONDARY";
        }
        int A0F3 = C51971G9r.A0F(str3, intValue3, A0F2);
        int intValue4 = this.A02.intValue();
        switch (intValue4) {
            case 1:
                str4 = "COMPOSER_BLOCK";
                break;
            case 2:
                str4 = "ABOVE_COMPOSER_BANNER";
                break;
            default:
                str4 = "TOP_BANNER";
                break;
        }
        return A0F3 + C51966G9m.A04(str4, intValue4);
    }

    public N3L(C69354Njt njt, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        C51974G9v.A1R(num, num2, num3, num4);
        this.A0C = str;
        this.A00 = j;
        this.A0D = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A0B = str6;
        this.A0A = str7;
        this.A09 = str8;
        this.A01 = njt;
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A02 = num4;
    }
}
