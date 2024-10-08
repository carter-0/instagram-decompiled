package X;

/* renamed from: X.7Co  reason: invalid class name and case insensitive filesystem */
public final class C327877Co extends AnonymousClass0T0 {
    public final CharSequence A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C327877Co(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(charSequence, 1);
        this.A00 = charSequence;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A02 = z4;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C327877Co) {
                C327877Co r5 = (C327877Co) obj;
                if (!(0qQ.A0K(this.A00, r5.A00) && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A02 == r5.A02 && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A02) {
            i7 = 1231;
        }
        return ((i6 + i7) * 31) + this.A01.hashCode();
    }
}
