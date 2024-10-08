package X;

/* renamed from: X.6Cw  reason: invalid class name and case insensitive filesystem */
public final class C304286Cw extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final AnonymousClass9IC A02;
    public final C274454oN A03;
    public final C299505vJ A04;
    public final C299585vR A05;
    public final C299515vK A06;
    public final C299725vk A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C304286Cw) {
                C304286Cw r5 = (C304286Cw) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && this.A01 == r5.A01 && 0qQ.A0K(this.A08, r5.A08) && this.A0A == r5.A0A && this.A05 == r5.A05 && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A06, r5.A06) && this.A0B == r5.A0B && this.A09 == r5.A09 && this.A0C == r5.A0C && this.A0D == r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "compact_text_with_media", this.A04.A03);
    }

    public final C299505vJ Be5() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int hashCode5 = (((i2 + i3) * 31) + this.A05.hashCode()) * 31;
        C299725vk r0 = this.A07;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i4 = (hashCode5 + hashCode2) * 31;
        C274454oN r02 = this.A03;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C299515vK r03 = this.A06;
        if (r03 != null) {
            i = r03.hashCode();
        }
        int i6 = (i5 + i) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A09) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0D) {
            i13 = 1231;
        }
        return i12 + i13;
    }

    public C304286Cw(AnonymousClass9IC r1, C274454oN r2, C299505vJ r3, C299585vR r4, C299515vK r5, C299725vk r6, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = r3;
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A0A = z;
        this.A05 = r4;
        this.A07 = r6;
        this.A03 = r2;
        this.A06 = r5;
        this.A0B = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0D = z5;
    }
}
