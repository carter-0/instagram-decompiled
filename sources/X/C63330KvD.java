package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KvD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63330KvD {
    public static Map A00(C66565MWt mWt) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (mWt.getDestination() != null) {
            A1H.put("destination", mWt.getDestination());
        }
        if (mWt.BoO() != null) {
            C66562MWq BoO = mWt.BoO();
            if (BoO != null) {
                treeUpdaterJNI = BoO.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("rich_destination", treeUpdaterJNI);
        }
        if (mWt.BoQ() != null) {
            A1H.put("rich_text", mWt.BoQ());
        }
        return 0Yt.A0B(A1H);
    }
}
