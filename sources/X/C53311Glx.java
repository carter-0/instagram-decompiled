package X;

/* renamed from: X.Glx  reason: case insensitive filesystem */
public final class C53311Glx extends AnonymousClass0T0 {
    public final 1iA A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53311Glx) {
                C53311Glx glx = (C53311Glx) obj;
                if (!0qQ.A0K(this.A03, glx.A03) || !0qQ.A0K(this.A04, glx.A04) || this.A06 != glx.A06 || this.A00 != glx.A00 || this.A07 != glx.A07 || this.A08 != glx.A08 || !0qQ.A0K(this.A01, glx.A01) || !0qQ.A0K(this.A02, glx.A02) || !0qQ.A0K(this.A05, glx.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A08(this.A04, AnonymousClass7TG.A0E(this.A03) * 31))));
        return C41845B3m.A01(this.A05, (((AnonymousClass7TF.A09(this.A08, A09) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31);
    }

    public C53311Glx(1iA r1, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = r1;
        this.A07 = z2;
        this.A08 = z3;
        this.A01 = num;
        this.A02 = str3;
        this.A05 = str4;
    }
}
