package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public final class F6H {
    public static DwY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("phone_number_valid".equals(A17)) {
                    r0.A09 = r3.A0d();
                } else if (C41845B3m.A1E(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("body".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("can_recover_with_code".equals(A17)) {
                    r0.A08 = r3.A0d();
                } else if (Dbb.A0T().equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("flow_type".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("autoconf_server_message".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("autoconf_auth_data".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("autoconf_metadata_blob".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("should_enable_auto_conf_resend".equals(A17)) {
                    r0.A0A = r3.A0d();
                } else {
                    1XY.A01(r3, r0, A17);
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
