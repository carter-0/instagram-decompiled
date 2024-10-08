package X;

import java.io.IOException;

public abstract class RVH {
    public static C10204RoK parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C10204RoK roK = new C10204RoK();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("backoff".equals(AnonymousClass7TE.A17(r3))) {
                    roK.A00 = r3.A0y();
                }
                r3.A0z();
            }
            return roK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
