package X;

import java.io.IOException;

public abstract class CjH {
    public static C65411cC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65411cC r0 = new C65411cC();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("group_profile_id".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_share_type".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66893Meb.A01(r3, r0, A17);
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
