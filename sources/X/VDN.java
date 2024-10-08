package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VDN {
    public static C17707Vcc parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17707Vcc vcc = new C17707Vcc();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (AnonymousClass000.A00(161).equals(A17)) {
                    vcc.A00 = r3.A1D();
                } else if ("reach_count".equals(A17)) {
                    vcc.A01 = r3.A1D();
                } else if ("replies_count".equals(A17)) {
                    vcc.A02 = r3.A1D();
                } else if ("story_swipe_away_count".equals(A17)) {
                    vcc.A03 = r3.A1D();
                } else if ("taps_back_count".equals(A17)) {
                    vcc.A04 = r3.A1D();
                } else if ("taps_forward_count".equals(A17)) {
                    vcc.A05 = r3.A1D();
                } else if (C41845B3m.A17(A17)) {
                    vcc.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("instagram_media_id".equals(A17)) {
                    vcc.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("instagram_media_owner_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("display_url".equals(A17)) {
                    vcc.A09 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(309).equals(A17)) {
                    vcc.A08 = (C16625UyL) EnumHelper.A00(r3.A1Q(), C16625UyL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if (AnonymousClass000.A00(1465).equals(A17)) {
                    vcc.A06 = VDL.parseFromJson(r3);
                } else if ("instagram_media_owner_profile_image".equals(A17)) {
                    vcc.A07 = VDM.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vcc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
