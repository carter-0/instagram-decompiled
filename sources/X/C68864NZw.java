package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NZw  reason: case insensitive filesystem */
public final class C68864NZw extends C69607Nop {
    public final long A00;
    public final ImageUrl A01;
    public final 1Xj A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68864NZw) {
                C68864NZw nZw = (C68864NZw) obj;
                if (!(0qQ.A0K(this.A01, nZw.A01) && this.A04 == nZw.A04 && this.A00 == nZw.A00 && this.A05 == nZw.A05 && 0qQ.A0K(this.A02, nZw.A02) && this.A06 == nZw.A06 && 0qQ.A0K(this.A03, nZw.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A05, C51972G9s.A07(this.A00, AnonymousClass7TF.A09(this.A04, AnonymousClass7TG.A0C(this.A01) * 31))))) + AnonymousClass7TE.A0L(this.A03);
    }

    public C68864NZw(ImageUrl imageUrl, 1Xj r2, Integer num, long j, boolean z, boolean z2, boolean z3) {
        this.A01 = imageUrl;
        this.A04 = z;
        this.A00 = j;
        this.A05 = z2;
        this.A02 = r2;
        this.A06 = z3;
        this.A03 = num;
    }
}
