package X;

import java.io.IOException;

public final class F86 {
    public static DwB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    r0.A00 = C41845B3m.A0a(r4, true);
                } else if ("privacy_rate_limit_dialog_title".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("privacy_rate_limit_dialog_message".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("has_private_public_switch_restriction".equals(A17)) {
                    r0.A03 = r4.A0d();
                } else if ("privacy_toggle_was_cancelled".equals(A17)) {
                    r0.A04 = r4.A0d();
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
