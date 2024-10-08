package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cqp  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45131Cqp {
    public static Map A00(DU0 du0) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du0.Axw() != null) {
            ProductCollection Axw = du0.Axw();
            if (Axw != null) {
                treeUpdaterJNI = Axw.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("discount_metadata", treeUpdaterJNI);
        }
        if (du0.B1d() != null) {
            A1H.put("end_time", du0.B1d());
        }
        return 0Yt.A0B(A1H);
    }
}
