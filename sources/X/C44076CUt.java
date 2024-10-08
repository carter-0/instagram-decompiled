package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUt  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44076CUt {
    public static Map A00(C46273DTc dTc) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTc.BMd() != null) {
            A1H.put("liker_user_ids", dTc.BMd());
        }
        if (dTc.BkG() != null) {
            C258223yf BkG = dTc.BkG();
            if (BkG != null) {
                treeUpdaterJNI = BkG.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("recommender_info", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
