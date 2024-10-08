package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.util.List;

public final class BFR extends AnonymousClass0T0 implements C283225Gp {
    public final MediaNoteMimicryType A00;
    public final List A01;

    public final BFR F5r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFR) {
                BFR bfr = (BFR) obj;
                if (!0qQ.A0K(this.A01, bfr.A01) || this.A00 != bfr.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List C9z() {
        return this.A01;
    }

    public final MediaNoteMimicryType CAQ() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaNoteMimicryStrategyDict", CaD.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BFR(MediaNoteMimicryType mediaNoteMimicryType, List list) {
        this.A01 = list;
        this.A00 = mediaNoteMimicryType;
    }
}
