package X;

import java.io.IOException;

public final class F8P {
    public static DwS parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("national_number".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                    }
                    r5.A1P();
                } else if ("country_code".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                    }
                    r5.A1P();
                } else if (MYP.A01(32, 12, 70).equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("phone_number_source".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("email".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("email_source".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("omnistring".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("omnistring_source".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r5);
                } else if (MYP.A01(226, 8, 99).equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("username_source".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
