package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.6DT  reason: invalid class name */
public final class AnonymousClass6DT extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass9IC A04;
    public final RepostRestrictedReason A05;
    public final C299505vJ A06;
    public final C299725vk A07;
    public final String A08;
    public final AnonymousClass62P A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public AnonymousClass6DT(AnonymousClass9IC r2, RepostRestrictedReason repostRestrictedReason, C299505vJ r4, C299725vk r5, String str, AnonymousClass62P r7, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r7, 19);
        this.A06 = r4;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A0H = z;
        this.A0I = z2;
        this.A0F = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0D = z6;
        this.A0B = z7;
        this.A0M = z8;
        this.A0L = z9;
        this.A08 = str;
        this.A07 = r5;
        this.A05 = repostRestrictedReason;
        this.A09 = r7;
        this.A0G = z10;
        this.A0J = z11;
        this.A0E = z12;
        this.A0K = z13;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DT) {
                AnonymousClass6DT r5 = (AnonymousClass6DT) obj;
                if (!(0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A04, r5.A04) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && this.A0H == r5.A0H && this.A0I == r5.A0I && this.A0F == r5.A0F && this.A0C == r5.A0C && this.A0A == r5.A0A && this.A0D == r5.A0D && this.A0B == r5.A0B && this.A0M == r5.A0M && this.A0L == r5.A0L && 0qQ.A0K(this.A08, r5.A08) && 0qQ.A0K(this.A07, r5.A07) && this.A05 == r5.A05 && 0qQ.A0K(this.A09, r5.A09) && this.A0G == r5.A0G && this.A0J == r5.A0J && this.A0E == r5.A0E && this.A0K == r5.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "dense_ufi", this.A06.A03);
    }

    public final C299505vJ Be5() {
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((this.A06.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        int i = 1237;
        if (this.A0H) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A0I) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0F) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0C) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0D) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0B) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0M) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0L) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        String str = this.A08;
        int i19 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i20 = (i18 + hashCode) * 31;
        C299725vk r0 = this.A07;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i21 = (i20 + hashCode2) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A05;
        if (repostRestrictedReason != null) {
            i19 = repostRestrictedReason.hashCode();
        }
        int hashCode4 = (((i21 + i19) * 31) + this.A09.hashCode()) * 31;
        int i22 = 1237;
        if (this.A0G) {
            i22 = 1231;
        }
        int i23 = (hashCode4 + i22) * 31;
        int i24 = 1237;
        if (this.A0J) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        int i26 = 1237;
        if (this.A0E) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0K) {
            i28 = 1231;
        }
        return i27 + i28;
    }
}
