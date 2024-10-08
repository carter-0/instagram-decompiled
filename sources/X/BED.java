package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;

public final class BED extends AnonymousClass0T0 implements DTB {
    public final ClipsSpinSwappableElementType A00;
    public final DV5 A01;
    public final String A02;

    public final BED F1d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BED) {
                BED bed = (BED) obj;
                if (!0qQ.A0K(this.A02, bed.A02) || this.A00 != bed.A00 || !0qQ.A0K(this.A01, bed.A01)) {
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

    public final DV5 C3R() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsSpinSwappableElement", C44091CVi.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public BED(ClipsSpinSwappableElementType clipsSpinSwappableElementType, DV5 dv5, String str) {
        this.A02 = str;
        this.A00 = clipsSpinSwappableElementType;
        this.A01 = dv5;
    }
}
