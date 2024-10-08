package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BFD extends AnonymousClass0T0 implements C46249DSe {
    public final C2808354j A00;
    public final BF9 A01;

    public final BFD F54() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BFD) {
                BFD bfd = (BFD) obj;
                if (!0qQ.A0K(this.A01, bfd.A01) || !0qQ.A0K(this.A00, bfd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C46239DRu Bgj() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C2808454k Bia() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGStoryOffsiteLeadAdsInfoDict", CZQ.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BFD(C2808354j r1, BF9 bf9) {
        this.A01 = bf9;
        this.A00 = r1;
    }
}
