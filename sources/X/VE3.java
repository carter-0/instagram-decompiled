package X;

import java.io.IOException;

public abstract class VE3 {
    public static C17443VVw parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C17443VVw vVw = new C17443VVw();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("option_numeric_value".equals(A17)) {
                    vVw.A00 = r3.A1D();
                } else if ("option_value".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vVw.A02 = str;
                } else if (AnonymousClass000.A00(1655).equals(A17)) {
                    vVw.A01 = C18205VnV.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vVw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
