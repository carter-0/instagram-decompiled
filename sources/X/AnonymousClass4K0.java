package X;

/* renamed from: X.4K0  reason: invalid class name */
public final class AnonymousClass4K0 extends AnonymousClass0T0 {
    public final double A00;
    public final C376459Ib A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final long A05;
    public final C257693xo A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4K0) {
                AnonymousClass4K0 r8 = (AnonymousClass4K0) obj;
                if (!0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A06, r8.A06) || this.A05 != r8.A05 || this.A04 != r8.A04 || Double.compare(this.A00, r8.A00) != 0 || this.A03 != r8.A03 || !0qQ.A0K(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A08.hashCode() * 31;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C257693xo r0 = this.A06;
        if (r0 != null) {
            i = r0.hashCode();
        }
        long j = this.A05;
        int i4 = (((i3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int A002 = (((i4 + i5) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        return ((A002 + i6) * 31) + this.A01.hashCode();
    }

    public AnonymousClass4K0(C376459Ib r1, C257693xo r2, String str, String str2, String str3, double d, long j, boolean z, boolean z2) {
        this.A08 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A06 = r2;
        this.A05 = j;
        this.A04 = z;
        this.A00 = d;
        this.A03 = z2;
        this.A01 = r1;
    }
}
