package X;

/* renamed from: X.5vW  reason: invalid class name */
public final class AnonymousClass5vW extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IC A02;
    public final C299505vJ A03;
    public final C299735vl A04;
    public final C299725vk A05;
    public final AnonymousClass62P A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5vW) {
                AnonymousClass5vW r5 = (AnonymousClass5vW) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A0B == r5.A0B && this.A01 == r5.A01 && this.A0C == r5.A0C && this.A08 == r5.A08 && 0qQ.A0K(this.A06, r5.A06) && this.A07 == r5.A07 && this.A09 == r5.A09 && this.A0E == r5.A0E && this.A0D == r5.A0D && 0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A04, r5.A04) && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "collapsedchildcontent", this.A03.A03);
    }

    public final C299505vJ Be5() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (((hashCode2 + i) * 31) + this.A01) * 31;
        int i3 = 1237;
        if (this.A0C) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A08) {
            i5 = 1231;
        }
        int hashCode3 = (((i4 + i5) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (hashCode3 + i6) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0E) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0D) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        C299725vk r0 = this.A05;
        int i14 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i15 = (i13 + hashCode) * 31;
        C299735vl r02 = this.A04;
        if (r02 != null) {
            i14 = r02.hashCode();
        }
        int i16 = (i15 + i14) * 31;
        int i17 = 1237;
        if (this.A0A) {
            i17 = 1231;
        }
        return i16 + i17;
    }

    public AnonymousClass5vW(AnonymousClass9IC r1, C299505vJ r2, C299735vl r3, C299725vk r4, AnonymousClass62P r5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i;
        this.A0B = z;
        this.A01 = i2;
        this.A0C = z2;
        this.A08 = z3;
        this.A06 = r5;
        this.A07 = z4;
        this.A09 = z5;
        this.A0E = z6;
        this.A0D = z7;
        this.A05 = r4;
        this.A04 = r3;
        this.A0A = z8;
    }
}
