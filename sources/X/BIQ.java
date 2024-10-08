package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIQ extends AnonymousClass0T0 implements DTX {
    public final C42046BEz A00;
    public final 1Xj A01;

    public final BIQ FE9(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIQ) {
                BIQ biq = (BIQ) obj;
                if (!0qQ.A0K(this.A01, biq.A01) || !0qQ.A0K(this.A00, biq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 1Xj BFS() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ DUM BgE() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGuideMediaContent", Ck9.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BIQ(C42046BEz bEz, 1Xj r2) {
        this.A01 = r2;
        this.A00 = bEz;
    }

    public final DTX E9j(1E9 r1) {
        return this;
    }
}
