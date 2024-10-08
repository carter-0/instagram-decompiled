package X;

/* renamed from: X.Gq1  reason: case insensitive filesystem */
public final class C53531Gq1 extends AnonymousClass0T0 implements C59500JLy {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53531Gq1) {
                C53531Gq1 gq1 = (C53531Gq1) obj;
                if (this.A07 != gq1.A07 || !0qQ.A0K(this.A02, gq1.A02) || this.A08 != gq1.A08 || !0qQ.A0K(this.A06, gq1.A06) || !0qQ.A0K(this.A05, gq1.A05) || !0qQ.A0K(this.A03, gq1.A03) || this.A01 != gq1.A01 || this.A00 != gq1.A00 || !0qQ.A0K(this.A04, gq1.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A08, (C51965G9l.A05(this.A07) + AnonymousClass7TG.A0E(this.A02)) * 31))) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A01) * 31) + this.A00) * 31) + C41845B3m.A00(this.A04);
    }

    public C53531Gq1(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2) {
        this.A07 = z;
        this.A02 = str;
        this.A08 = z2;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str5;
    }
}
