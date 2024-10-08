package X;

import java.io.IOException;

public abstract class CX1 {
    public static BEX parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("fb_crosspost_deeplink_profile_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("fb_crosspost_fbid".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (!"th_unified_feedback_row_tap_target_url".equals(A17)) {
                    bool = C41847B3o.A0z(r7, bool, A17, "unified_feedback_enabled");
                } else if (r7.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r7.A1P();
                }
                r7.A0z();
            }
            return new BEX(bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
