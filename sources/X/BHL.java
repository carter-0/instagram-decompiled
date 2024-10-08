package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BHL extends AnonymousClass0T0 implements C46301DUe {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final BHL FBK(1E9 r1) {
        return this;
    }

    public final BHL FBL(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHL) {
                BHL bhl = (BHL) obj;
                if (!0qQ.A0K(this.A01, bhl.A01) || !0qQ.A0K(this.A02, bhl.A02) || !0qQ.A0K(this.A00, bhl.A00) || !0qQ.A0K(this.A03, bhl.A03) || !0qQ.A0K(this.A04, bhl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer BLb() {
        return this.A01;
    }

    public final String BP8() {
        return this.A02;
    }

    public final Boolean BU7() {
        return this.A00;
    }

    public final List CG0() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStorySliderVoterInfoObject", C44442Cf0.A00(this));
    }

    public final String getSliderId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public BHL(Boolean bool, Integer num, String str, String str2, List list) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A04 = list;
    }

    public final C46301DUe E95(1E9 r1) {
        return this;
    }
}
