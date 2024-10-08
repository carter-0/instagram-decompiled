package X;

/* renamed from: X.5vS  reason: invalid class name and case insensitive filesystem */
public final class C299595vS extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IC A02;
    public final C274454oN A03;
    public final C299505vJ A04;
    public final C299585vR A05;
    public final C299725vk A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C299595vS(AnonymousClass9IC r2, C274454oN r3, C299505vJ r4, C299585vR r5, C299725vk r6, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(r2, 2);
        this.A04 = r4;
        this.A02 = r2;
        this.A00 = i;
        this.A07 = str;
        this.A0A = z;
        this.A01 = i2;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A0C = z2;
        this.A0B = z3;
        this.A0D = z4;
        this.A08 = z5;
        this.A09 = z6;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299595vS) {
                C299595vS r5 = (C299595vS) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && 0qQ.A0K(this.A07, r5.A07) && this.A0A == r5.A0A && this.A01 == r5.A01 && this.A05 == r5.A05 && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A03, r5.A03) && this.A0C == r5.A0C && this.A0B == r5.A0B && this.A0D == r5.A0D && this.A08 == r5.A08 && this.A09 == r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "text", this.A04.A03);
    }

    public final C299505vJ Be5() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int hashCode3 = (((((hashCode2 + i) * 31) + this.A01) * 31) + this.A05.hashCode()) * 31;
        C299725vk r0 = this.A06;
        int i2 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        C274454oN r02 = this.A03;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        int i5 = 1237;
        if (this.A0C) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0D) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A09) {
            i13 = 1231;
        }
        return i12 + i13;
    }
}
