package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CVi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44091CVi {
    public static Map A00(DTB dtb) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtb.B0S() != null) {
            A1H.put("element_id", dtb.B0S());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (dtb.B0Z() != null) {
            ClipsSpinSwappableElementType B0Z = dtb.B0Z();
            if (B0Z != null) {
                str = B0Z.A00;
            } else {
                str = null;
            }
            A1H.put("element_type", str);
        }
        if (dtb.C3R() != null) {
            DV5 C3R = dtb.C3R();
            if (C3R != null) {
                treeUpdaterJNI = C3R.FHC();
            }
            A1H.put("swappable_text", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
