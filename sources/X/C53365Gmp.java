package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.Gmp  reason: case insensitive filesystem */
public final class C53365Gmp extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final RepostRestrictedReason A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass62P A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53365Gmp) {
                C53365Gmp gmp = (C53365Gmp) obj;
                if (!(0qQ.A0K(this.A08, gmp.A08) && this.A04 == gmp.A04 && 0qQ.A0K(this.A06, gmp.A06) && this.A00 == gmp.A00 && this.A01 == gmp.A01 && this.A02 == gmp.A02 && this.A03 == gmp.A03 && this.A0D == gmp.A0D && this.A0B == gmp.A0B && this.A09 == gmp.A09 && this.A0C == gmp.A0C && this.A0A == gmp.A0A && this.A0F == gmp.A0F && this.A0E == gmp.A0E && 0qQ.A0K(this.A07, gmp.A07) && this.A05 == gmp.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0D, (((((((((((AnonymousClass7TE.A0K(this.A08) + this.A04) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31))))))) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public C53365Gmp(RepostRestrictedReason repostRestrictedReason, String str, String str2, AnonymousClass62P r5, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A08 = r5;
        this.A04 = i;
        this.A06 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A0D = z;
        this.A0B = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A0E = z7;
        this.A07 = str2;
        this.A05 = repostRestrictedReason;
    }

    public C53365Gmp() {
        this((RepostRestrictedReason) null, (String) null, (String) null, AnonymousClass62M.A01, 0, 0, 0, 0, 0, false, false, false, false, false, false, false);
    }
}
