package X;

import java.io.IOException;

public abstract class O12 {
    public static NML parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            NML nml = new NML();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("instagram_direct_effects".equals(AnonymousClass7TE.A17(r3))) {
                    nml.A00 = O11.parseFromJson(r3);
                }
                r3.A0z();
            }
            return nml;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
