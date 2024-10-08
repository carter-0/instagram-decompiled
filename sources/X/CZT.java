package X;

import java.io.IOException;

public abstract class CZT {
    public static BFE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ads_toggled_on".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("brand_safety_status_for_media_edit".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else {
                    bool2 = C41847B3o.A0z(r5, bool2, A17, "is_video_eligible_for_inserting_ads");
                }
                r5.A0z();
            }
            return new BFE(bool, bool2, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
