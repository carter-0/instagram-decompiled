package X;

import java.io.IOException;

/* renamed from: X.En8  reason: case insensitive filesystem */
public abstract class C48970En8 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.F19, java.lang.Object] */
    public static F19 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (DcV.A01().equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("obfuscated_phone_number".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("sms_two_factor_on".equals(A17)) {
                    obj.A0A = r5.A0d();
                } else if ("totp_two_factor_on".equals(A17)) {
                    obj.A0E = r5.A0d();
                } else if ("whatsapp_two_factor_on".equals(A17)) {
                    obj.A0F = r5.A0d();
                } else if (DcV.A02(124, 21, 30).equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r5);
                } else if ("show_messenger_code_option".equals(A17)) {
                    obj.A0C = r5.A0d();
                } else if ("show_trusted_device_option".equals(A17)) {
                    obj.A0D = r5.A0d();
                } else if ("should_opt_in_trusted_device_option".equals(A17)) {
                    obj.A0B = r5.A0d();
                } else if ("pending_trusted_notification".equals(A17)) {
                    obj.A09 = r5.A0d();
                } else if ("sms_not_allowed_reason".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("pk".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("eligible_for_multiple_totp".equals(A17)) {
                    obj.A07 = r5.A0d();
                } else if ("is_trusted_device".equals(A17)) {
                    obj.A08 = r5.A0d();
                } else if ("trusted_notification_polling_nonce".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("trusted_device_nonce".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
