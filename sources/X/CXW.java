package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBTagType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CXW {
    public static Map A00(DU8 du8) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (du8.Ab9() != null) {
            A1H.put(AnonymousClass000.A00(1082), du8.Ab9());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (du8.B4Z() != null) {
            FBTagType B4Z = du8.B4Z();
            if (B4Z != null) {
                str = B4Z.A00;
            } else {
                str = null;
            }
            A1H.put("fb_tag_type", str);
        }
        if (du8.B4d() != null) {
            DUP B4d = du8.B4d();
            if (B4d != null) {
                treeUpdaterJNI = B4d.FHC();
            }
            A1H.put("fb_user", treeUpdaterJNI);
        }
        if (du8.Bdo() != null) {
            List Bdo = du8.Bdo();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = Bdo.iterator();
            while (it.hasNext()) {
                C41847B3o.A1Y(A1C, it);
            }
            A1H.put("position", A1C);
        }
        if (du8.C3u() != null) {
            A1H.put("tag_id", du8.C3u());
        }
        return 0Yt.A0B(A1H);
    }
}
