package X;

import java.io.IOException;

/* renamed from: X.EdH  reason: case insensitive filesystem */
public abstract class C48360EdH {
    public static C47161Drc parseFromJson(16F r25) {
        String A00;
        String A002;
        16F r10 = r25;
        0qQ.A0B(r10, 0);
        try {
            Boolean bool = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r9 = 16L.A09;
                A00 = SAn.A00(31, 8, 58);
                A002 = SAn.A00(10, 21, 92);
                if (A1J == r9) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if ("obfuscated_phone_number".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("show_messenger_code_option".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("show_new_login_screen".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("sms_not_allowed_reason".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("sms_two_factor_on".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r10);
                } else if ("totp_two_factor_on".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r10);
                } else if (A002.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("whatsapp_two_factor_on".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r10);
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("obfuscated_phone_number", r10, "TwoFactorLoginInfoImpl");
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_messenger_code_option", r10, "TwoFactorLoginInfoImpl");
            } else if (bool2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("show_new_login_screen", r10, "TwoFactorLoginInfoImpl");
            } else if (bool3 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sms_two_factor_on", r10, "TwoFactorLoginInfoImpl");
            } else if (bool4 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("totp_two_factor_on", r10, "TwoFactorLoginInfoImpl");
            } else if (str3 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r10, "TwoFactorLoginInfoImpl");
            } else if (str4 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "TwoFactorLoginInfoImpl");
            } else if (bool5 != null || !(r10 instanceof 0c9)) {
                return new C47161Drc(str, str2, str3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), str4, bool5.booleanValue());
            } else {
                AnonymousClass7TF.A1L("whatsapp_two_factor_on", r10, "TwoFactorLoginInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
