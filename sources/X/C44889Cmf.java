package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44889Cmf {
    public static Map A00(C270844hO r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (r4.Ahx() != null) {
            C239663Hm Ahx = r4.Ahx();
            if (Ahx != null) {
                treeUpdaterJNI2 = Ahx.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("broadcast", treeUpdaterJNI2);
        }
        if (r4.BeE() != null) {
            C46299DUc BeE = r4.BeE();
            if (BeE != null) {
                treeUpdaterJNI = BeE.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(1695), treeUpdaterJNI);
        }
        if (r4.BkV() != null) {
            AnonymousClass3HY BkV = r4.BkV();
            if (BkV != null) {
                treeUpdaterJNI3 = BkV.FHC();
            }
            A1H.put("reel", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
