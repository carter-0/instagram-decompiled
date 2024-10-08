package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.util.List;

public final class BFZ extends AnonymousClass0T0 implements C46241DRw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C53436GoT A03;
    public final ClipsMidCardType A04;
    public final C53442Goa A05;
    public final BG4 A06;
    public final C53461Got A07;
    public final BH0 A08;
    public final BH1 A09;
    public final C42110BHo A0A;
    public final String A0B;
    public final List A0C;

    public BFZ(C53436GoT goT, ClipsMidCardType clipsMidCardType, C53442Goa goa, BG4 bg4, C53461Got got, BH0 bh0, BH1 bh1, C42110BHo bHo, String str, List list, int i, int i2, int i3) {
        0qQ.A0B(clipsMidCardType, 6);
        this.A0B = str;
        this.A00 = i;
        this.A03 = goT;
        this.A05 = goa;
        this.A0C = list;
        this.A04 = clipsMidCardType;
        this.A06 = bg4;
        this.A07 = got;
        this.A08 = bh0;
        this.A09 = bh1;
        this.A01 = i2;
        this.A0A = bHo;
        this.A02 = i3;
    }

    public final BFZ F6K(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFZ) {
                BFZ bfz = (BFZ) obj;
                if (!0qQ.A0K(this.A0B, bfz.A0B) || this.A00 != bfz.A00 || !0qQ.A0K(this.A03, bfz.A03) || !0qQ.A0K(this.A05, bfz.A05) || !0qQ.A0K(this.A0C, bfz.A0C) || this.A04 != bfz.A04 || !0qQ.A0K(this.A06, bfz.A06) || !0qQ.A0K(this.A07, bfz.A07) || !0qQ.A0K(this.A08, bfz.A08) || !0qQ.A0K(this.A09, bfz.A09) || this.A01 != bfz.A01 || !0qQ.A0K(this.A0A, bfz.A0A) || this.A02 != bfz.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((AnonymousClass7TF.A07(this.A04, ((((((((AnonymousClass7TG.A0E(this.A0B) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A0A)) * 31) + this.A02;
    }

    public final C46241DRw E7e(1E9 r1) {
        return this;
    }
}
