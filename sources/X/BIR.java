package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideMediaType;

public final class BIR extends AnonymousClass0T0 implements DTY {
    public final GuideMediaType A00;
    public final BIQ A01;

    public final BIR FE8(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIR) {
                BIR bir = (BIR) obj;
                if (!0qQ.A0K(this.A01, bir.A01) || this.A00 != bir.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ DTX AqS() {
        return this.A01;
    }

    public final GuideMediaType CAM() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGuideMedia", C44743CkC.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public BIR(GuideMediaType guideMediaType, BIQ biq) {
        AnonymousClass7TG.A1O(biq, guideMediaType);
        this.A01 = biq;
        this.A00 = guideMediaType;
    }

    public final DTY E9k(1E9 r1) {
        return this;
    }
}
