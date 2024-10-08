package X;

import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import java.io.IOException;

/* renamed from: X.46f  reason: invalid class name and case insensitive filesystem */
public abstract class C2605746f {
    public static GrowthFrictionInterventionCategoriesImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl2 = null;
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl3 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("follow".equals(A0q)) {
                    growthFrictionInterventionDetailImpl = C45578Cyq.parseFromJson(r5);
                } else if ("mention".equals(A0q)) {
                    growthFrictionInterventionDetailImpl2 = C45578Cyq.parseFromJson(r5);
                } else if ("tag".equals(A0q)) {
                    growthFrictionInterventionDetailImpl3 = C45578Cyq.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new GrowthFrictionInterventionCategoriesImpl(growthFrictionInterventionDetailImpl, growthFrictionInterventionDetailImpl2, growthFrictionInterventionDetailImpl3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
