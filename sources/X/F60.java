package X;

import java.io.IOException;

public final class F60 {
    public static C47703EDm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C47703EDm eDm = new C47703EDm();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("search_results".equals(AnonymousClass7TE.A17(r3))) {
                    eDm.A00 = C48939Emd.parseFromJson(r3);
                }
                r3.A0z();
            }
            return eDm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
