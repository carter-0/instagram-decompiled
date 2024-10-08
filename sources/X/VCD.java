package X;

import java.io.IOException;

public abstract class VCD {
    public static VY3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VY3 vy3 = new VY3();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("linkType".equals(A17)) {
                    vy3.A00 = r3.A1D();
                } else if ("app_package".equals(A17)) {
                    vy3.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("deeplinkUri".equals(A17)) {
                    vy3.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("webUri".equals(A17)) {
                    vy3.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vy3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
