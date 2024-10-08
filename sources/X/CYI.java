package X;

import com.instagram.api.schemas.GrowthFrictionInterventionButtonImpl;
import java.io.IOException;

public abstract class CYI {
    public static GrowthFrictionInterventionButtonImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("action".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("is_primary".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if (C41845B3m.A1A(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new GrowthFrictionInterventionButtonImpl(bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
