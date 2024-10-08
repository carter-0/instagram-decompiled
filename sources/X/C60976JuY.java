package X;

/* renamed from: X.JuY  reason: case insensitive filesystem */
public final class C60976JuY extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final long A03;
    public final long A04;
    public final Number A05;
    public final Number A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60976JuY) {
                C60976JuY juY = (C60976JuY) obj;
                if (!0qQ.A0K(this.A01, juY.A01) || !0qQ.A0K(this.A07, juY.A07) || !0qQ.A0K(this.A0A, juY.A0A) || !0qQ.A0K(this.A08, juY.A08) || !0qQ.A0K(this.A05, juY.A05) || !0qQ.A0K(this.A06, juY.A06) || this.A03 != juY.A03 || this.A04 != juY.A04 || !0qQ.A0K(this.A00, juY.A00) || !0qQ.A0K(this.A0B, juY.A0B) || !0qQ.A0K(this.A09, juY.A09) || this.A02 != juY.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        int A012 = AnonymousClass7TF.A01(this.A04, AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TF.A08(this.A07, A0O) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31))));
        return DbS.A06(this.A02, (((AnonymousClass7TF.A08(this.A00, A012) + AnonymousClass7TG.A0E(this.A0B)) * 31) + C41845B3m.A00(this.A09)) * 31);
    }

    public C60976JuY(Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        AnonymousClass7TG.A1S(number, number2);
        0qQ.A0B(str5, 9);
        this.A01 = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A05 = number;
        this.A06 = number2;
        this.A03 = j;
        this.A04 = j2;
        this.A00 = str5;
        this.A0B = str6;
        this.A09 = str7;
        this.A02 = z;
    }
}
