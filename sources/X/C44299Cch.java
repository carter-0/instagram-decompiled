package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.RangeIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cch  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44299Cch {
    public static Map A00(RangeIntf rangeIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (rangeIntf.B1q() != null) {
            Entity B1q = rangeIntf.B1q();
            if (B1q != null) {
                treeUpdaterJNI = B1q.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("entity", treeUpdaterJNI);
        }
        if (rangeIntf.BMP() != null) {
            A1H.put("length", rangeIntf.BMP());
        }
        if (rangeIntf.BXp() != null) {
            A1H.put("offset", rangeIntf.BXp());
        }
        return 0Yt.A0B(A1H);
    }
}
