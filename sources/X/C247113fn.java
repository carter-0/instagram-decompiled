package X;

/* renamed from: X.3fn  reason: invalid class name and case insensitive filesystem */
public final class C247113fn extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass9IE A01;
    public final C247033ff A02;
    public final C247053fh A03;
    public final 1Xj A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C247113fn(AnonymousClass9IE r2, C247033ff r3, C247053fh r4, 1Xj r5, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r3, 5);
        0qQ.A0B(r4, 6);
        this.A07 = z;
        this.A00 = i;
        this.A06 = z2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = z3;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C247113fn) {
                C247113fn r5 = (C247113fn) obj;
                if (!(this.A07 == r5.A07 && this.A00 == r5.A00 && this.A06 == r5.A06 && 0qQ.A0K(this.A04, r5.A04) && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A05 == r5.A05 && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = ((i * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int hashCode2 = (((((((i2 + i3) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        int i5 = (hashCode2 + i4) * 31;
        AnonymousClass9IE r0 = this.A01;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return i5 + hashCode;
    }
}
