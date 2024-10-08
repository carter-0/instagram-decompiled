package X;

/* renamed from: X.7Rk  reason: invalid class name and case insensitive filesystem */
public final class C331547Rk extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final GAV A01;
    public final GAV A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C331547Rk(GAV gav, GAV gav2, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A02 = gav;
        this.A01 = gav2;
        this.A00 = i;
        this.A09 = z;
        this.A08 = z2;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z3;
        this.A07 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C331547Rk) {
                C331547Rk r5 = (C331547Rk) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00 || this.A09 != r5.A09 || this.A08 != r5.A08 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || this.A06 != r5.A06 || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int hashCode3 = (((i2 + i3) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode3 + hashCode) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
