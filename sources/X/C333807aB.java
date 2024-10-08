package X;

/* renamed from: X.7aB  reason: invalid class name and case insensitive filesystem */
public final class C333807aB extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C333797aA A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C333807aB(C333797aA r2, Integer num, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = num;
        this.A02 = r2;
        this.A07 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z2;
        this.A08 = z3;
        this.A09 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333807aB) {
                C333807aB r5 = (C333807aB) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A05, r5.A05) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A07 == r5.A07 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A06 == r5.A06 && this.A08 == r5.A08 && this.A09 == r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A04.hashCode() * 31;
        String str = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Integer num = this.A03;
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + C333837aE.A01(num).hashCode() + num.intValue()) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (((((hashCode3 + i) * 31) + this.A01) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}
