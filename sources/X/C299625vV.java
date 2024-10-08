package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.5vV  reason: invalid class name and case insensitive filesystem */
public final class C299625vV extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final RepostRestrictedReason A01;
    public final C299505vJ A02;
    public final C299735vl A03;
    public final C299725vk A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C299625vV(AnonymousClass9IC r2, RepostRestrictedReason repostRestrictedReason, C299505vJ r4, C299735vl r5, C299725vk r6, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        0qQ.A0B(r2, 2);
        this.A02 = r4;
        this.A00 = r2;
        this.A0D = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A08 = z4;
        this.A06 = z5;
        this.A09 = z6;
        this.A07 = z7;
        this.A0G = z8;
        this.A05 = str;
        this.A0I = z9;
        this.A0H = z10;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = repostRestrictedReason;
        this.A0C = z11;
        this.A0F = z12;
        this.A0A = z13;
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299625vV) {
                C299625vV r5 = (C299625vV) obj;
                if (!(0qQ.A0K(this.A02, r5.A02) && 0qQ.A0K(this.A00, r5.A00) && this.A0D == r5.A0D && this.A0E == r5.A0E && this.A0B == r5.A0B && this.A08 == r5.A08 && this.A06 == r5.A06 && this.A09 == r5.A09 && this.A07 == r5.A07 && this.A0G == r5.A0G && 0qQ.A0K(this.A05, r5.A05) && this.A0I == r5.A0I && this.A0H == r5.A0H && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A03, r5.A03) && this.A01 == r5.A01 && this.A0C == r5.A0C && this.A0F == r5.A0F && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "ufi", this.A02.A03);
    }

    public final C299505vJ Be5() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode4 + i) * 31;
        int i3 = 1237;
        if (this.A0E) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0B) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A08) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A06) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A07) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0G) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        String str = this.A05;
        int i17 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i18 = (i16 + hashCode) * 31;
        int i19 = 1237;
        if (this.A0I) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        int i21 = 1237;
        if (this.A0H) {
            i21 = 1231;
        }
        int i22 = (i20 + i21) * 31;
        C299725vk r0 = this.A04;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i23 = (i22 + hashCode2) * 31;
        C299735vl r02 = this.A03;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i24 = (i23 + hashCode3) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A01;
        if (repostRestrictedReason != null) {
            i17 = repostRestrictedReason.hashCode();
        }
        int i25 = (i24 + i17) * 31;
        int i26 = 1237;
        if (this.A0C) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0F) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        int i30 = 1237;
        if (this.A0A) {
            i30 = 1231;
        }
        return i29 + i30;
    }
}
