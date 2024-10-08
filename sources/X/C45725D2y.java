package X;

import java.io.IOException;

/* renamed from: X.D2y  reason: case insensitive filesystem */
public final class C45725D2y {
    public static CG9 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("fundraiser_id".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("fundraiser_title".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("has_active_fundraiser".equals(A17)) {
                    r0.A03 = r3.A0d();
                } else if ("beneficiary_username".equals(A17) || "formatted_goal_amount".equals(A17)) {
                    r3.A0d();
                } else {
                    if ("formatted_fundraiser_progress_info_text".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("percent_raised".equals(A17)) {
                        r0.A00 = r3.A1D();
                    } else if (!"thumbnail_display_url".equals(A17)) {
                        1XY.A01(r3, r0, A17);
                    } else if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
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
