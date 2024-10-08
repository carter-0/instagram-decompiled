package X;

import java.io.IOException;

public final class D1L {
    public static CHG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CHG chg = new CHG();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("structured_survey_event_logging".equals(AnonymousClass7TE.A17(r3))) {
                    chg.A00 = C44798ClA.parseFromJson(r3);
                }
                r3.A0z();
            }
            return chg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
