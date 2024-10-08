package X;

import java.io.IOException;

public abstract class CV0 {
    public static BDw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            BDx bDx = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("ig_mention".equals(AnonymousClass7TE.A17(r3))) {
                    bDx = C44082CUz.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new BDw(bDx);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
