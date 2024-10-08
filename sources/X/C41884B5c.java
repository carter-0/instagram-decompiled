package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B5c  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41884B5c {
    public static Map A00(AnonymousClass4I0 r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AqD() != null) {
            AnonymousClass4Hy AqD = r3.AqD();
            if (AqD != null) {
                treeUpdaterJNI = AqD.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("consumption_sheet_config", treeUpdaterJNI);
        }
        if (r3.BAU() != null) {
            A1H.put("has_active_fundraiser", r3.BAU());
        }
        if (r3.CT3() != null) {
            A1H.put("is_facebook_onboarded_charity", r3.CT3());
        }
        if (r3.getPk() != null) {
            A1H.put("pk", r3.getPk());
        }
        return 0Yt.A0B(A1H);
    }
}
