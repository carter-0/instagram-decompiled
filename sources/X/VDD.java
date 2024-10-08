package X;

import java.io.IOException;

public abstract class VDD {
    public static C17241VNt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17241VNt vNt = new C17241VNt();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("organic".equals(AnonymousClass7TE.A17(r3))) {
                    vNt.A00 = VDC.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
