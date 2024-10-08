package X;

import java.io.IOException;

public abstract class O11 {
    public static O96 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            O96 o96 = new O96();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("target_effect_preview".equals(AnonymousClass7TE.A17(r3))) {
                    o96.A00 = O10.parseFromJson(r3);
                }
                r3.A0z();
            }
            return o96;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
