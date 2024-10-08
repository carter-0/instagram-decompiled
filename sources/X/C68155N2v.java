package X;

/* renamed from: X.N2v  reason: case insensitive filesystem */
public final class C68155N2v extends AnonymousClass0T0 {
    public final int A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C68155N2v(Float f, Integer num, Integer num2, Integer num3, String str, String str2, int i) {
        0qQ.A0B(num, 1);
        this.A03 = num;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = num2;
        this.A04 = num3;
        this.A01 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68155N2v) {
                C68155N2v n2v = (C68155N2v) obj;
                if (this.A03 != n2v.A03 || this.A00 != n2v.A00 || !0qQ.A0K(this.A06, n2v.A06) || !0qQ.A0K(this.A05, n2v.A05) || this.A02 != n2v.A02 || !0qQ.A0K(this.A04, n2v.A04) || !0qQ.A0K(this.A01, n2v.A01)) {
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
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "SF_PRO_BOLD_TEXT";
                break;
            case 2:
                str = "ROBOTO";
                break;
            case 3:
                str = "ROBOTO_BOLD";
                break;
            case 4:
                str = "INSTAGRAM_SANS";
                break;
            default:
                str = "SF_PRO_TEXT";
                break;
        }
        int A08 = (AnonymousClass7TF.A08(this.A06, (C51968G9o.A0F(str, intValue) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 1:
                str2 = "CENTER";
                break;
            case 2:
                str2 = "END";
                break;
            default:
                str2 = "START";
                break;
        }
        return ((C51971G9r.A0F(str2, intValue2, A08) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
