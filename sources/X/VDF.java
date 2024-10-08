package X;

import java.io.IOException;

public abstract class VDF {
    public static C17242VNu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17242VNu vNu = new C17242VNu();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("node".equals(AnonymousClass7TE.A17(r3))) {
                    vNu.A00 = VDE.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
