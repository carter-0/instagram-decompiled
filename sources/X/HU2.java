package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HU2 {
    public static Map A00(C257803xz r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (r4.AhE() != null) {
            C271264iX AhE = r4.AhE();
            if (AhE != null) {
                treeUpdaterJNI2 = AhE.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("bottom", treeUpdaterJNI2);
        }
        if (r4.C4m() != null) {
            C271264iX C4m = r4.C4m();
            if (C4m != null) {
                treeUpdaterJNI = C4m.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("text", treeUpdaterJNI);
        }
        if (r4.C8L() != null) {
            C271264iX C8L = r4.C8L();
            if (C8L != null) {
                treeUpdaterJNI3 = C8L.FHC();
            }
            A1H.put("top", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
