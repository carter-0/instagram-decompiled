package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYt  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44180CYt {
    public static Map A00(C269944fw r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AYz() != null) {
            IGAdCreationOptimizationPayloadDict AYz = r3.AYz();
            if (AYz != null) {
                treeUpdaterJNI = AYz.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("adCreativeOptimizationPayload", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
