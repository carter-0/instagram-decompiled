package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class BFU extends AnonymousClass0T0 implements DTI {
    public final 1Xj A00;
    public final ExtendedImageUrl A01;

    public final BFU F61(1E9 r1) {
        return this;
    }

    public final BFU F62(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFU) {
                BFU bfu = (BFU) obj;
                if (!0qQ.A0K(this.A01, bfu.A01) || !0qQ.A0K(this.A00, bfu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ExtendedImageUrl BFv() {
        return this.A01;
    }

    public final 1Xj CDp() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMediaResourceHint", CaJ.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BFU(1Xj r1, ExtendedImageUrl extendedImageUrl) {
        this.A01 = extendedImageUrl;
        this.A00 = r1;
    }
}
