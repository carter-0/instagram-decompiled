package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.KVd  reason: case insensitive filesystem */
public final class C62006KVd extends 17P implements C66562MWq {
    public final C66561MWp BGj() {
        return (C66561MWp) A05(-1703305877, C62005KVc.class);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.KVd, X.MWq] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (BGj() != null) {
            C66561MWp BGj = BGj();
            if (BGj != null) {
                treeUpdaterJNI = BGj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("incentive", treeUpdaterJNI);
        }
        return new TreeUpdaterJNI(0Yt.A0B(A1H), this);
    }

    public final C61224JzH FF2() {
        C61223JzG jzG;
        C66561MWp BGj = BGj();
        if (BGj != null) {
            jzG = BGj.FF1();
        } else {
            jzG = null;
        }
        return new C61224JzH(jzG);
    }
}
