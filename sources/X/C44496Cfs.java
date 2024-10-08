package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cfs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44496Cfs {
    public static Map A00(C46268DSx dSx) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (dSx.Bie() != null) {
            C46317DUu Bie = dSx.Bie();
            if (Bie != null) {
                treeUpdaterJNI = Bie.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("question_list", treeUpdaterJNI);
        }
        if (dSx.BwY() != null) {
            AnonymousClass3IK BwY = dSx.BwY();
            if (BwY != null) {
                treeUpdaterJNI2 = BwY.FHC();
            }
            A1H.put("simple_action", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
