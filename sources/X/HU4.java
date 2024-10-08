package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HU4 {
    public static Map A00(C274524oV r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.BHs() != null) {
            C274504oT BHs = r4.BHs();
            if (BHs != null) {
                treeUpdaterJNI = BHs.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(2888), treeUpdaterJNI);
        }
        if (r4.CBW() != null) {
            C274504oT CBW = r4.CBW();
            if (CBW != null) {
                treeUpdaterJNI2 = CBW.FHC();
            }
            A1H.put(C273654mx.A00(3451), treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
