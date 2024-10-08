package X;

import java.io.IOException;

public abstract class VDB {
    public static C17239VNr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17239VNr vNr = new C17239VNr();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("organic".equals(AnonymousClass7TE.A17(r3))) {
                    vNr.A00 = VDA.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
