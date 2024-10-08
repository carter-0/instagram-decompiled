package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CmO  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44872CmO {
    public static Map A00(DTZ dtz) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtz.Agd() != null) {
            A1H.put("body", dtz.Agd());
        }
        if (dtz.AjX() != null) {
            C46267DSw AjX = dtz.AjX();
            if (AjX != null) {
                treeUpdaterJNI = AjX.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("call_to_action", treeUpdaterJNI);
        }
        if (dtz.getTitle() != null) {
            C41845B3m.A12(dtz.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
