package X;

import com.instagram.model.direct.DirectSearchResharedContent;

/* renamed from: X.N2u  reason: case insensitive filesystem */
public final class C68154N2u extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final DirectSearchResharedContent A05;

    public C68154N2u(DirectSearchResharedContent directSearchResharedContent, int i, int i2, int i3, int i4, int i5) {
        0qQ.A0B(directSearchResharedContent, 1);
        this.A05 = directSearchResharedContent;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68154N2u) {
                C68154N2u n2u = (C68154N2u) obj;
                if (!(0qQ.A0K(this.A05, n2u.A05) && this.A02 == n2u.A02 && this.A00 == n2u.A00 && this.A01 == n2u.A01 && this.A04 == n2u.A04 && this.A03 == n2u.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TE.A0K(this.A05) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04) * 31) + this.A03;
    }
}
