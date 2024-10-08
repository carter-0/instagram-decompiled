package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cfp  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44493Cfp {
    public static Map A00(C46266DSv dSv) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSv.AvA() != null) {
            C46268DSx AvA = dSv.AvA();
            if (AvA != null) {
                treeUpdaterJNI = AvA.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("data", treeUpdaterJNI);
        }
        if (dSv.CAh() != null) {
            C41845B3m.A11(dSv.CAh(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
