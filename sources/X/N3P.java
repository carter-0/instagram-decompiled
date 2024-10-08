package X;

import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.InstagramMediaProductType;

public final class N3P extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final BoostedActionStatus A09;
    public final InstagramMediaProductType A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3P) {
                N3P n3p = (N3P) obj;
                if (!(0qQ.A0K(this.A0C, n3p.A0C) && 0qQ.A0K(this.A0B, n3p.A0B) && 0qQ.A0K(this.A0D, n3p.A0D) && 0qQ.A0K(this.A0E, n3p.A0E) && this.A07 == n3p.A07 && this.A03 == n3p.A03 && this.A04 == n3p.A04 && this.A02 == n3p.A02 && this.A00 == n3p.A00 && this.A05 == n3p.A05 && this.A06 == n3p.A06 && this.A01 == n3p.A01 && this.A0G == n3p.A0G && this.A0A == n3p.A0A && this.A0F == n3p.A0F && this.A09 == n3p.A09 && this.A08 == n3p.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0D, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TE.A0O(this.A0C)));
        return ((AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A09(this.A0G, (((((((((((((((AnonymousClass7TF.A08(this.A0E, A082) + this.A07) * 31) + this.A03) * 31) + this.A04) * 31) + this.A02) * 31) + this.A00) * 31) + this.A05) * 31) + this.A06) * 31) + this.A01) * 31))) + AnonymousClass7TG.A0C(this.A09)) * 31) + C51968G9o.A03(this.A08);
    }

    public N3P(BoostedActionStatus boostedActionStatus, InstagramMediaProductType instagramMediaProductType, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, boolean z2) {
        this.A0C = str;
        this.A0B = str2;
        this.A0D = str3;
        this.A0E = str4;
        this.A07 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A00 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A01 = i8;
        this.A0G = z;
        this.A0A = instagramMediaProductType;
        this.A0F = z2;
        this.A09 = boostedActionStatus;
        this.A08 = j;
    }
}
