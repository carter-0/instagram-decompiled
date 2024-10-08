package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CZQ {
    public static Map A00(C46249DSe dSe) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (dSe.Bgj() != null) {
            C46239DRu Bgj = dSe.Bgj();
            if (Bgj != null) {
                treeUpdaterJNI = Bgj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("profile_card_info", treeUpdaterJNI);
        }
        if (dSe.Bia() != null) {
            C2808454k Bia = dSe.Bia();
            if (Bia != null) {
                treeUpdaterJNI2 = Bia.FHC();
            }
            A1H.put("question_card_info", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
