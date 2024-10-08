package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BId  reason: case insensitive filesystem */
public final class C42125BId extends AnonymousClass0T0 implements C46313DUq {
    public final 1Xj A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C42125BId(1Xj r2, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(str4, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A05 = list;
        this.A00 = r2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final C42125BId FEk(1E9 r1) {
        return this;
    }

    public final C42125BId FEl(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42125BId) {
                C42125BId bId = (C42125BId) obj;
                if (!0qQ.A0K(this.A01, bId.A01) || !0qQ.A0K(this.A02, bId.A02) || !0qQ.A0K(this.A05, bId.A05) || !0qQ.A0K(this.A00, bId.A00) || !0qQ.A0K(this.A03, bId.A03) || !0qQ.A0K(this.A04, bId.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BCi() {
        return this.A01;
    }

    public final String BFr() {
        return this.A02;
    }

    public final List BH8() {
        return this.A05;
    }

    public final 1Xj Bke() {
        return this.A00;
    }

    public final String C2C() {
        return this.A03;
    }

    public final String C4Z() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTEmptyStoryStateCardData", C44878CmU.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, ((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03)) * 31);
    }

    public final C46313DUq E9t(1E9 r1) {
        return this;
    }
}
