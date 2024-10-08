package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44079CUw {
    public static Map A00(DU3 du3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du3.Ac5() != null) {
            A1H.put("app_id", du3.Ac5());
        }
        C257593xe AgG = du3.AgG();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AgG != null) {
            A1H.put("bloks_data", AgG.A00());
        }
        if (du3.AgQ() != null) {
            A1H.put("bloks_sticker_type", du3.AgQ());
        }
        if (du3.getId() != null) {
            C41845B3m.A0x(du3.getId(), A1H);
        }
        if (du3.BzZ() != null) {
            DSF BzZ = du3.BzZ();
            if (BzZ != null) {
                treeUpdaterJNI = BzZ.FHC();
            }
            A1H.put("sticker_data", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
