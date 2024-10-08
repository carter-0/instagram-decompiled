package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CVk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44093CVk {
    public static Map A00(DTC dtc) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtc.B0S() != null) {
            A1H.put("element_id", dtc.B0S());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (dtc.B0Z() != null) {
            ClipsSpinSwappableElementType B0Z = dtc.B0Z();
            if (B0Z != null) {
                str = B0Z.A00;
            } else {
                str = null;
            }
            A1H.put("element_type", str);
        }
        if (dtc.C3S() != null) {
            DSH C3S = dtc.C3S();
            if (C3S != null) {
                treeUpdaterJNI = C3S.FHC();
            }
            A1H.put("swapped_text", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
