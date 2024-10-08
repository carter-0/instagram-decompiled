package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BEm extends AnonymousClass0T0 implements C46246DSb {
    public final Float A00;
    public final Float A01;

    public final BEm F32() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEm) {
                BEm bEm = (BEm) obj;
                if (!0qQ.A0K(this.A00, bEm.A00) || !0qQ.A0K(this.A01, bEm.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Float Ba0() {
        return this.A00;
    }

    public final Float Ba1() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFeedCTAHighlightTimeInfoDict", C44138CXd.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BEm(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
