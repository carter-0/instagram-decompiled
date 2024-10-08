package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Ck9 {
    public static Map A00(DTX dtx) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        1Xj BFS = dtx.BFS();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (BFS != null) {
            A1H.put("ig_media_content", BFS.A1C());
        }
        if (dtx.BgE() != null) {
            DUM BgE = dtx.BgE();
            if (BgE != null) {
                treeUpdaterJNI = BgE.FHC();
            }
            A1H.put("product_image_content", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
