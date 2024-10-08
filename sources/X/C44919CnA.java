package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnA  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44919CnA {
    public static Map A00(C46292DTv dTv) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (dTv.Bbg() != null) {
            C74546Pwf Bbg = dTv.Bbg();
            if (Bbg != null) {
                treeUpdaterJNI = Bbg.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("permission", treeUpdaterJNI);
        }
        if (dTv.Bfu() != null) {
            ProductDetailsProductItemDictIntf Bfu = dTv.Bfu();
            if (Bfu != null) {
                treeUpdaterJNI2 = Bfu.FHC();
            }
            A1H.put("product", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
