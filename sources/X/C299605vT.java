package X;

/* renamed from: X.5vT  reason: invalid class name and case insensitive filesystem */
public final class C299605vT extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C299505vJ A01;
    public final C299515vK A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final String A0A;

    public C299605vT(AnonymousClass9IC r3, C299505vJ r4, C299515vK r5, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(r3, 2);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A03 = num;
        this.A0A = C299615vU.A01(this, "single_media", r4.A03);
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299605vT) {
                C299605vT r5 = (C299605vT) obj;
                if (!(0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A00, r5.A00) && 0qQ.A0K(this.A02, r5.A02) && this.A05 == r5.A05 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A09 == r5.A09 && 0qQ.A0K(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A0A;
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A04) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i12 + hashCode;
    }
}
