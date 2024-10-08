package X;

import java.io.IOException;

public abstract class VDS {
    public static VO3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VO3 vo3 = new VO3();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("stories_unit".equals(AnonymousClass7TE.A17(r3))) {
                    vo3.A00 = VDR.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vo3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
