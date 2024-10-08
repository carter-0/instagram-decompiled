package X;

import com.instagram.api.schemas.OverlayAdsTextStyleEnum;
import java.io.IOException;

/* renamed from: X.CzH  reason: case insensitive filesystem */
public abstract class C45605CzH {
    public static C42054BFh parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            OverlayAdsTextStyleEnum overlayAdsTextStyleEnum = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("color".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("size".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("style".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    overlayAdsTextStyleEnum = (OverlayAdsTextStyleEnum) OverlayAdsTextStyleEnum.A01.get(str);
                    if (overlayAdsTextStyleEnum == null) {
                        overlayAdsTextStyleEnum = OverlayAdsTextStyleEnum.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            return new C42054BFh(overlayAdsTextStyleEnum, num, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42054BFh bFh) {
        r2.A0c();
        String str = bFh.A02;
        if (str != null) {
            r2.A0R("color", str);
        }
        Integer num = bFh.A01;
        if (num != null) {
            r2.A0P("size", num.intValue());
        }
        OverlayAdsTextStyleEnum overlayAdsTextStyleEnum = bFh.A00;
        if (overlayAdsTextStyleEnum != null) {
            r2.A0R("style", overlayAdsTextStyleEnum.A00);
        }
        r2.A0Z();
    }
}
