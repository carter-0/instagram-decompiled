package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B6t  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41918B6t {
    public static Map A00(C250333lH r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.AiD() != null) {
            C250313lF AiD = r4.AiD();
            if (AiD != null) {
                treeUpdaterJNI = AiD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("browser_peek", treeUpdaterJNI);
        }
        if (r4.Bbo() != null) {
            C255043tU Bbo = r4.Bbo();
            if (Bbo != null) {
                treeUpdaterJNI2 = Bbo.FHC();
            }
            A1H.put("persistent_iab", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
