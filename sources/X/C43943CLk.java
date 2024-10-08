package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.CLk  reason: case insensitive filesystem */
public final class C43943CLk extends 17P implements DSJ {
    public final DSM Bc0() {
        return (DSM) A05(973885226, C43958CMt.class);
    }

    public final BFG F5C() {
        C42057BFk bFk;
        DSM Bc0 = Bc0();
        if (Bc0 != null) {
            bFk = Bc0.F7S();
        } else {
            bFk = null;
        }
        return new BFG(bFk);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CLk, X.DSJ] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (Bc0() != null) {
            DSM Bc0 = Bc0();
            if (Bc0 != null) {
                treeUpdaterJNI = Bc0.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("photo3d_info", treeUpdaterJNI);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
