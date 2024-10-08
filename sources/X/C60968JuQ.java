package X;

/* renamed from: X.JuQ  reason: case insensitive filesystem */
public final class C60968JuQ extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final Integer A09;

    public C60968JuQ(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        C51969G9p.A1N(str3, 5, str5);
        this.A02 = num;
        this.A09 = num2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A08 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60968JuQ) {
                C60968JuQ juQ = (C60968JuQ) obj;
                if (!0qQ.A0K(this.A02, juQ.A02) || !0qQ.A0K(this.A09, juQ.A09) || !0qQ.A0K(this.A03, juQ.A03) || !0qQ.A0K(this.A04, juQ.A04) || !0qQ.A0K(this.A05, juQ.A05) || !0qQ.A0K(this.A06, juQ.A06) || this.A08 != juQ.A08 || this.A00 != juQ.A00 || this.A01 != juQ.A01 || !0qQ.A0K(this.A07, juQ.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        boolean z = this.A08;
        return C41845B3m.A01(this.A07, (((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A08(str, ((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31);
    }
}
