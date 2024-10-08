package X;

import java.io.IOException;

public final class D1M {
    public static CHH parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CHH chh = new CHH();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("structured_survey_submit_responses".equals(AnonymousClass7TE.A17(r3))) {
                    chh.A00 = C44800ClC.parseFromJson(r3);
                }
                r3.A0z();
            }
            return chh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
