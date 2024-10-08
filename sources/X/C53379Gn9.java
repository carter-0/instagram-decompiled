package X;

import com.instagram.wonderwall.model.WallInfo;
import java.util.List;

/* renamed from: X.Gn9  reason: case insensitive filesystem */
public final class C53379Gn9 extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C53379Gn9(Long l, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = list;
        this.A02 = list2;
        this.A05 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A06 = z4;
        this.A04 = z5;
        this.A07 = z6;
        this.A01 = l;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53379Gn9)) {
                return false;
            }
            C53379Gn9 gn9 = (C53379Gn9) obj;
            if (gn9.A00 == 1 && 0qQ.A0K(this.A02, gn9.A02) && 0qQ.A0K(this.A03, gn9.A03) && this.A09 == gn9.A09 && this.A06 == gn9.A06 && this.A07 == gn9.A07 && this.A08 == gn9.A08 && this.A04 == gn9.A04 && 0qQ.A0K(this.A01, gn9.A01) && this.A05 == gn9.A05) {
                return true;
            }
            return false;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53379Gn9)) {
                return false;
            }
            C53379Gn9 gn92 = (C53379Gn9) obj;
            if (gn92.A00 == 0 && 0qQ.A0K(this.A03, gn92.A03) && 0qQ.A0K(this.A02, gn92.A02) && this.A05 == gn92.A05 && this.A09 == gn92.A09 && this.A08 == gn92.A08 && this.A06 == gn92.A06 && this.A04 == gn92.A04 && this.A07 == gn92.A07 && 0qQ.A0K(this.A01, gn92.A01)) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int A092;
        int A0C;
        if (this.A00 != 0) {
            A092 = (AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A03)) * 31))))) + AnonymousClass7TE.A0L(this.A01)) * 31;
            A0C = 1237;
            if (this.A05) {
                A0C = 1231;
            }
        } else {
            A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03))))))));
            A0C = AnonymousClass7TG.A0C(this.A01);
        }
        return A092 + A0C;
    }

    public C53379Gn9(C55817Hnx hnx, WallInfo wallInfo, AnonymousClass62P r4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = r4;
        this.A03 = wallInfo;
        this.A09 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A04 = z5;
        this.A01 = hnx;
        this.A05 = z6;
    }

    public C53379Gn9() {
        this((C55817Hnx) null, (WallInfo) null, (AnonymousClass62P) AnonymousClass62M.A01, false, false, false, false, false, false);
    }
}
