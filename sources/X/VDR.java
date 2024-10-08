package X;

import java.io.IOException;

public abstract class VDR {
    public static VO2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VO2 vo2 = new VO2();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("stories".equals(AnonymousClass7TE.A17(r3))) {
                    vo2.A00 = VDQ.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vo2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
