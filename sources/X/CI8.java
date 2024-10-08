package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class CI8 extends 17P implements C46273DTc {
    public C258223yf A00;

    public final C258223yf BkG() {
        C258223yf r0 = this.A00;
        if (r0 == null) {
            return (C258223yf) A05(-1489053500, COO.class);
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CI8, X.DTc] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44076CUt.A00(this));
    }

    public final List BMd() {
        return A0n(-788151224);
    }

    public final C46273DTc E75(1E9 r2) {
        C258223yf BkG = BkG();
        if (BkG != null) {
            BkG.E8E(r2);
        } else {
            BkG = null;
        }
        this.A00 = BkG;
        return this;
    }

    public final BDu F0p(1E9 r4) {
        C258213ye r1;
        List A0n = A0n(-788151224);
        C258223yf BkG = BkG();
        if (BkG != null) {
            r1 = BkG.F99(r4);
        } else {
            r1 = null;
        }
        return new BDu(r1, A0n);
    }

    public final BDu F0q(1E6 r2) {
        return F0p(C41846B3n.A0S(r2));
    }
}
