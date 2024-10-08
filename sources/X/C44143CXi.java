package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44143CXi {
    public static Map A00(C46308DUl dUl) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (dUl.Aoo() != null) {
            ProductCollection Aoo = dUl.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI = Aoo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI);
        }
        if (dUl.Aov() != null) {
            A1H.put("collection_type", dUl.Aov());
        }
        if (dUl.Axv() != null) {
            DTJ Axv = dUl.Axv();
            if (Axv != null) {
                treeUpdaterJNI2 = Axv.FHC();
            }
            A1H.put("discount_metadata", treeUpdaterJNI2);
        }
        if (dUl.BDT() != null) {
            A1H.put("highlight_bar_destination", dUl.BDT());
        }
        if (dUl.BDU() != null) {
            A1H.put(AnonymousClass000.A00(629), dUl.BDU());
        }
        if (dUl.CP7() != null) {
            A1H.put("is_auto_tagged", dUl.CP7());
        }
        return 0Yt.A0B(A1H);
    }
}
