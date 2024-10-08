package X;

import java.io.IOException;

public final class F6A {
    public static EM2 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    r1.A00 = C41845B3m.A0a(r4, false);
                } else if ("can_email_reset".equals(A17)) {
                    r1.A06 = r4.A0d();
                } else if ("can_sms_reset".equals(A17)) {
                    r1.A07 = r4.A0d();
                } else if ("can_wa_reset".equals(A17)) {
                    r1.A08 = r4.A0d();
                } else if ("fb_login_option".equals(A17)) {
                    r1.A0A = r4.A0d();
                } else if ("lookup_source".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("corrected_input".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("multiple_users_found".equals(A17)) {
                    r1.A0B = r4.A0d();
                } else if ("sms_sent".equals(A17)) {
                    r1.A0C = r4.A0d();
                } else if ("email_sent".equals(A17)) {
                    r1.A09 = r4.A0d();
                } else {
                    if ("obfuscated_email".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("obfuscated_phone".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("recovery_type".equals(A17)) {
                        r1.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("email".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("uhl_eligible".equals(A17)) {
                        r1.A0D = r4.A0d();
                    } else if (C273654mx.A00(244).equals(A17)) {
                        r1.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("is_autoconf_test_user".equals(A17)) {
                        r1.A01 = AnonymousClass7TF.A0S(r4);
                    } else {
                        FCB.A00(r4, r1, A17);
                    }
                    r4.A1P();
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
