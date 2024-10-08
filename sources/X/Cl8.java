package X;

import java.io.IOException;

public abstract class Cl8 {
    public static C45228Csj parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45228Csj csj = new C45228Csj();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("lead_gen_deep_link_user_status".equals(AnonymousClass7TE.A17(r3))) {
                    csj.A00 = C44796Cl7.parseFromJson(r3);
                }
                r3.A0z();
            }
            return csj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
