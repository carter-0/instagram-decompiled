package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CWW {
    public static Map A00(C257623xh r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.Bw9() != null) {
            IgShowreelComposition Bw9 = r4.Bw9();
            if (Bw9 != null) {
                treeUpdaterJNI = Bw9.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(C273654mx.A00(392), treeUpdaterJNI);
        }
        if (r4.BwA() != null) {
            C301005yJ BwA = r4.BwA();
            if (BwA != null) {
                treeUpdaterJNI2 = BwA.FHC();
            }
            A1H.put("showreel_native_animation", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
