package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

public final class BH0 extends AnonymousClass0T0 implements DS5 {
    public final ClipsACRMidCardSubType A00;
    public final AnonymousClass3HX A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public BH0(ClipsACRMidCardSubType clipsACRMidCardSubType, AnonymousClass3HX r3, String str, String str2, String str3, List list) {
        0qQ.A0B(list, 3);
        this.A02 = str;
        this.A00 = clipsACRMidCardSubType;
        this.A05 = list;
        this.A01 = r3;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final BH0 FAQ(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BH0) {
                BH0 bh0 = (BH0) obj;
                if (!0qQ.A0K(this.A02, bh0.A02) || this.A00 != bh0.A00 || !0qQ.A0K(this.A05, bh0.A05) || !0qQ.A0K(this.A01, bh0.A01) || !0qQ.A0K(this.A03, bh0.A03) || !0qQ.A0K(this.A04, bh0.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A05, ((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public final DS5 E8h(1E9 r1) {
        return this;
    }
}
