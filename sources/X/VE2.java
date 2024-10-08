package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VE2 {
    public static C17353VSg parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C17353VSg vSg = new C17353VSg();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("param_name".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vSg.A01 = str;
                } else if ("survey_param_type".equals(A17)) {
                    vSg.A00 = (C16633UyT) EnumHelper.A00(r3.A1Q(), C16633UyT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return vSg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
