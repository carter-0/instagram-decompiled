package X;

import com.instagram.api.schemas.RIXUCoverCTAPosition;
import com.instagram.api.schemas.RIXUCtaType;
import java.io.IOException;

/* renamed from: X.KqG  reason: case insensitive filesystem */
public abstract class C63025KqG {
    public static C61079JwH parseFromJson(16F r6) {
        String str;
        String str2;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            RIXUCtaType rIXUCtaType = null;
            RIXUCoverCTAPosition rIXUCoverCTAPosition = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("cta_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                    rIXUCtaType = (RIXUCtaType) RIXUCtaType.A01.get(str2);
                    if (rIXUCtaType == null) {
                        rIXUCtaType = RIXUCtaType.UNRECOGNIZED;
                    }
                } else if ("position_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    rIXUCoverCTAPosition = (RIXUCoverCTAPosition) RIXUCoverCTAPosition.A01.get(str);
                    if (rIXUCoverCTAPosition == null) {
                        rIXUCoverCTAPosition = RIXUCoverCTAPosition.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C61079JwH((Object) rIXUCoverCTAPosition, (Object) rIXUCtaType, str3, 3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
