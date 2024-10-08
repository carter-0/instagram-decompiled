package X;

import java.io.IOException;

public abstract class VD5 {
    public static C17235VNn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17235VNn vNn = new C17235VNn();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("cursor".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("node".equals(A17)) {
                    vNn.A00 = VD4.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
