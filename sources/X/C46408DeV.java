package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DeV  reason: case insensitive filesystem */
public abstract /* synthetic */ class C46408DeV {
    public static Map A00(C253663rB r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.BMy() != null) {
            AnonymousClass5Bm BMy = r4.BMy();
            if (BMy != null) {
                treeUpdaterJNI = BMy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("linked_fb_page", treeUpdaterJNI);
        }
        if (r4.BMz() != null) {
            AnonymousClass4EU BMz = r4.BMz();
            if (BMz != null) {
                treeUpdaterJNI2 = BMz.FHC();
            }
            A1H.put("linked_fb_user", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
