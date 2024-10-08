package X;

import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Gam  reason: case insensitive filesystem */
public final class C52674Gam extends AnonymousClass0T0 implements JTM {
    public final C61069Jw7 A00;
    public final C53436GoT A01;
    public final boolean A02;
    public final C53332GmI A03;
    public final C266444Yx A04;
    public final C266444Yx A05;
    public final ImageUrl A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C52674Gam(C61069Jw7 jw7, C53436GoT goT, C53332GmI gmI, C266444Yx r5, C266444Yx r6, ImageUrl imageUrl, String str, String str2, List list, boolean z, boolean z2) {
        0qQ.A0B(str2, 7);
        this.A08 = str;
        this.A03 = gmI;
        this.A01 = goT;
        this.A00 = jw7;
        this.A07 = str2;
        this.A09 = list;
        this.A02 = z;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = imageUrl;
        this.A0A = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52674Gam) {
                C52674Gam gam = (C52674Gam) obj;
                if (!0qQ.A0K(this.A08, gam.A08) || !0qQ.A0K(this.A03, gam.A03) || !0qQ.A0K(this.A01, gam.A01) || !0qQ.A0K(this.A00, gam.A00) || !0qQ.A0K(this.A07, gam.A07) || !0qQ.A0K(this.A09, gam.A09) || this.A02 != gam.A02 || !0qQ.A0K(this.A05, gam.A05) || !0qQ.A0K(this.A04, gam.A04) || !0qQ.A0K(this.A06, gam.A06) || this.A0A != gam.A0A) {
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
        return this.A09;
    }

    public final C53332GmI BSz() {
        return this.A03;
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
        return this.A0A;
    }

    public final JV5 CG2() {
        return null;
    }

    public final boolean CcA() {
        return false;
    }

    public final boolean CeV() {
        return false;
    }

    public final String getId() {
        return this.A08;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A08))));
        int A002 = C54732HQn.A00();
        int i = (A072 + A002) * 31 * 31;
        boolean z = this.A02;
        return AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(this.A06, (((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A08(this.A07, i) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + A002) * 31);
    }
}
