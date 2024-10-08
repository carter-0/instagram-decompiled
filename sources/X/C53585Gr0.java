package X;

import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Gr0  reason: case insensitive filesystem */
public final class C53585Gr0 extends AnonymousClass0T0 implements JTM {
    public final 28D A00;
    public final C53332GmI A01;
    public final List A02;
    public final boolean A03;
    public final C266444Yx A04;
    public final C266444Yx A05;
    public final ImageUrl A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B;

    public C53585Gr0(28D r3, C53332GmI gmI, C266444Yx r5, C266444Yx r6, ImageUrl imageUrl, String str, String str2, List list, boolean z, boolean z2) {
        DbW.A1P(str2, 5, r3);
        this.A08 = str;
        this.A01 = gmI;
        this.A07 = str2;
        this.A02 = list;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = imageUrl;
        this.A09 = true;
        this.A03 = z;
        this.A00 = r3;
        this.A0B = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53585Gr0) {
                C53585Gr0 gr0 = (C53585Gr0) obj;
                if (!0qQ.A0K(this.A08, gr0.A08) || !0qQ.A0K(this.A01, gr0.A01) || this.A0A != gr0.A0A || !0qQ.A0K(this.A07, gr0.A07) || !0qQ.A0K(this.A02, gr0.A02) || !0qQ.A0K(this.A05, gr0.A05) || !0qQ.A0K(this.A04, gr0.A04) || !0qQ.A0K(this.A06, gr0.A06) || this.A09 != gr0.A09 || this.A03 != gr0.A03 || this.A00 != gr0.A00 || this.A0B != gr0.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl Aeu() {
        return this.A06;
    }

    public final String AvZ() {
        return this.A07;
    }

    public final List BQW() {
        return this.A02;
    }

    public final C53332GmI BSz() {
        return this.A01;
    }

    public final MidCardOverlayType BZs() {
        return null;
    }

    public final C266444Yx C2Y() {
        return this.A04;
    }

    public final C266444Yx C7g() {
        return this.A05;
    }

    public final boolean CCZ() {
        return this.A0B;
    }

    public final JV5 CG2() {
        return null;
    }

    public final boolean CcA() {
        return this.A09;
    }

    public final boolean CeV() {
        return this.A0A;
    }

    public final String getId() {
        return this.A08;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A08))) * 31;
        return AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A07(this.A06, (((((AnonymousClass7TF.A08(this.A07, A092) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)))));
    }
}
