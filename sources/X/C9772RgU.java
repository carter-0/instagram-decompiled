package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.RgU  reason: case insensitive filesystem */
public abstract /* synthetic */ class C9772RgU {
    public static Map A00(C13899TjM tjM) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (tjM.Ae9() != null) {
            C13896TjJ Ae9 = tjM.Ae9();
            if (Ae9 != null) {
                treeUpdaterJNI2 = Ae9.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("availability", treeUpdaterJNI2);
        }
        if (tjM.Bb0() != null) {
            C13897TjK Bb0 = tjM.Bb0();
            if (Bb0 != null) {
                treeUpdaterJNI = Bb0.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("paymentConfig", treeUpdaterJNI);
        }
        if (tjM.Bk3() != null) {
            C13898TjL Bk3 = tjM.Bk3();
            if (Bk3 != null) {
                treeUpdaterJNI3 = Bk3.FHC();
            }
            A1H.put("receiverInfo", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
