package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;

public final class CJM extends 17P implements C257623xh {
    public final IgShowreelComposition Bw9() {
        return (IgShowreelComposition) A05(-1604670462, ImmutablePandoIgShowreelComposition.class);
    }

    public final C301005yJ BwA() {
        return (C301005yJ) A05(-824538620, COI.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3xh, com.facebook.pando.TreeJNI, X.CJM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWW.A00(this));
    }

    public final C257613xg F2E() {
        IgShowreelCompositionImpl igShowreelCompositionImpl;
        IgShowreelComposition Bw9 = Bw9();
        BGP bgp = null;
        if (Bw9 != null) {
            igShowreelCompositionImpl = Bw9.FFx();
        } else {
            igShowreelCompositionImpl = null;
        }
        C301005yJ BwA = BwA();
        if (BwA != null) {
            bgp = BwA.F93();
        }
        return new C257613xg(bgp, igShowreelCompositionImpl);
    }
}
