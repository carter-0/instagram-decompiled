package X;

import java.io.IOException;

public final class F7E {
    public static Dw9 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("header".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A04 = str;
                } else if ("iterations".equals(A17)) {
                    r0.A01 = r3.A1D();
                } else if ("shift".equals(A17)) {
                    r0.A02 = r3.A1D();
                } else if ("size".equals(A17)) {
                    r0.A03 = r3.A1D();
                } else if ("edges".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
