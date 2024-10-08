package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

public abstract class CqZ {
    public static C45365Cv7 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45365Cv7 cv7 = new C45365Cv7();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (TraceFieldType.RequestID.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    cv7.A02 = str;
                } else if ("seen_state".equals(A17)) {
                    cv7.A01 = C45707D2g.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cv7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
