package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

public final class BH1 extends AnonymousClass0T0 implements DS6 {
    public final ClipsACRMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public BH1(ClipsACRMidCardSubType clipsACRMidCardSubType, String str, String str2, List list) {
        0qQ.A0B(list, 2);
        this.A00 = clipsACRMidCardSubType;
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
    }

    public final BH1 FAR(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BH1) {
                BH1 bh1 = (BH1) obj;
                if (this.A00 != bh1.A00 || !0qQ.A0K(this.A03, bh1.A03) || !0qQ.A0K(this.A01, bh1.A01) || !0qQ.A0K(this.A02, bh1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public final DS6 E8i(1E9 r1) {
        return this;
    }
}
