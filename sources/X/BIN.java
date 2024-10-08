package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BIN extends AnonymousClass0T0 implements DUW {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final BIN FE2(1E9 r1) {
        return this;
    }

    public final BIN FE3(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIN) {
                BIN bin = (BIN) obj;
                if (!0qQ.A0K(this.A01, bin.A01) || !0qQ.A0K(this.A00, bin.A00) || !0qQ.A0K(this.A02, bin.A02) || !0qQ.A0K(this.A03, bin.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List BGH() {
        return this.A01;
    }

    public final List BgK() {
        return this.A02;
    }

    public final List BgQ() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFeedShowcaseMedia", C44735Ck3.A00(this));
    }

    public final String getMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public BIN(String str, List list, List list2, List list3) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = list2;
        this.A03 = list3;
    }

    public final DUW E9g(1E9 r1) {
        return this;
    }
}
