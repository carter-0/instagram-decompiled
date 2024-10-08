package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4u  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41876B4u {
    public static Map A00(GrowthFrictionInterventionCategories growthFrictionInterventionCategories) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (growthFrictionInterventionCategories.B6i() != null) {
            GrowthFrictionInterventionDetail B6i = growthFrictionInterventionCategories.B6i();
            if (B6i != null) {
                treeUpdaterJNI2 = B6i.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("follow", treeUpdaterJNI2);
        }
        if (growthFrictionInterventionCategories.BRb() != null) {
            GrowthFrictionInterventionDetail BRb = growthFrictionInterventionCategories.BRb();
            if (BRb != null) {
                treeUpdaterJNI = BRb.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(3588), treeUpdaterJNI);
        }
        if (growthFrictionInterventionCategories.C3r() != null) {
            GrowthFrictionInterventionDetail C3r = growthFrictionInterventionCategories.C3r();
            if (C3r != null) {
                treeUpdaterJNI3 = C3r.FHC();
            }
            A1H.put("tag", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
