package X;

import java.io.IOException;

/* renamed from: X.HvG  reason: case insensitive filesystem */
public final class C56249HvG {
    public static C54055Gye parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("item".equals(A17)) {
                    C276014sL parseFromJson = C275974sH.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
