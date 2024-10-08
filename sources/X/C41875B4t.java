package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4t  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41875B4t {
    public static Map A00(GrowthFrictionInfo growthFrictionInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        growthFrictionInfo.BAW();
        A1H.put("has_active_interventions", Boolean.valueOf(growthFrictionInfo.BAW()));
        if (growthFrictionInfo.BIc() != null) {
            GrowthFrictionInterventionCategories BIc = growthFrictionInfo.BIc();
            if (BIc != null) {
                treeUpdaterJNI = BIc.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("interventions", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
