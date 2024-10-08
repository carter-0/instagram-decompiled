package X;

import java.io.IOException;

public abstract class VDH {
    public static C17244VNw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17244VNw vNw = new C17244VNw();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("actions".equals(AnonymousClass7TE.A17(r3))) {
                    vNw.A00 = VDG.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
