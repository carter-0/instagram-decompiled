package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;

public final class BEF extends AnonymousClass0T0 implements DTC {
    public final ClipsSpinSwappableElementType A00;
    public final DSH A01;
    public final String A02;

    public BEF(ClipsSpinSwappableElementType clipsSpinSwappableElementType, DSH dsh, String str) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = clipsSpinSwappableElementType;
        this.A01 = dsh;
    }

    public final BEF F1f() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEF) {
                BEF bef = (BEF) obj;
                if (!0qQ.A0K(this.A02, bef.A02) || this.A00 != bef.A00 || !0qQ.A0K(this.A01, bef.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B0S() {
        return this.A02;
    }

    public final ClipsSpinSwappableElementType B0Z() {
        return this.A00;
    }

    public final DSH C3S() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsSpinSwappedElement", C44093CVk.A00(this));
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
