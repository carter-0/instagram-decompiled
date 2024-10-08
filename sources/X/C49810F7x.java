package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.F7x  reason: case insensitive filesystem */
public final class C49810F7x {
    public static DwR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(3159).equals(A17)) {
                    C320136rp parseFromJson = C320146rq.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A01 = parseFromJson;
                } else if ("privacy_rate_limit_dialog_title".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("privacy_rate_limit_dialog_message".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("has_private_public_switch_restriction".equals(A17)) {
                    r1.A05 = r4.A0d();
                } else if ("previous_following".equals(A17)) {
                    r1.A07 = r4.A0d();
                } else if ("max_followed_error".equals(A17)) {
                    r1.A06 = r4.A0d();
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("growth_friction_detail".equals(A17)) {
                    r1.A00 = C45578Cyq.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r1, A17);
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
