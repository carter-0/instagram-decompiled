package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BDu extends AnonymousClass0T0 implements C46273DTc {
    public final C258213ye A00;
    public final List A01;

    public final BDu F0p(1E9 r1) {
        return this;
    }

    public final BDu F0q(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDu) {
                BDu bDu = (BDu) obj;
                if (!0qQ.A0K(this.A01, bDu.A01) || !0qQ.A0K(this.A00, bDu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List BMd() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C258223yf BkG() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTBlendRecommenderInfoList", C44076CUt.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BDu(C258213ye r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public final C46273DTc E75(1E9 r1) {
        return this;
    }
}
