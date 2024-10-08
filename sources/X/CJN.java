package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreel.ImmutablePandoIgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAnimation;

public final class CJN extends 17P implements C257643xj {
    public final IgShowreelComposition Bw9() {
        return (IgShowreelComposition) A05(-1604670462, ImmutablePandoIgShowreelComposition.class);
    }

    public final IgShowreelNativeAnimationIntf BwB() {
        return (IgShowreelNativeAnimationIntf) A05(-824538620, ImmutablePandoIgShowreelNativeAnimation.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3xj, X.CJN] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWX.A00(this));
    }

    public final C257633xi F2F() {
        IgShowreelCompositionImpl igShowreelCompositionImpl;
        IgShowreelComposition Bw9 = Bw9();
        IgShowreelNativeAnimation igShowreelNativeAnimation = null;
        if (Bw9 != null) {
            igShowreelCompositionImpl = Bw9.FFx();
        } else {
            igShowreelCompositionImpl = null;
        }
        IgShowreelNativeAnimationIntf BwB = BwB();
        if (BwB != null) {
            igShowreelNativeAnimation = BwB.FFy();
        }
        return new C257633xi(igShowreelCompositionImpl, igShowreelNativeAnimation);
    }
}
