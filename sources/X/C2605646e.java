package X;

import com.instagram.api.schemas.GrowthFrictionInfoImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import java.io.IOException;

/* renamed from: X.46e  reason: invalid class name and case insensitive filesystem */
public abstract class C2605646e {
    public static GrowthFrictionInfoImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Boolean bool = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("has_active_interventions".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if ("interventions".equals(A0q)) {
                    growthFrictionInterventionCategoriesImpl = C2605746f.parseFromJson(r6);
                }
                r6.A0z();
            }
            if (bool != null || !(r6 instanceof 0c9)) {
                return new GrowthFrictionInfoImpl(growthFrictionInterventionCategoriesImpl, bool.booleanValue());
            }
            ((0c9) r6).A03.A00("has_active_interventions", "GrowthFrictionInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
