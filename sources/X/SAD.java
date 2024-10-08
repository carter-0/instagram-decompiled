package X;

import com.instagram.api.schemas.IntegrityInterstitialType;
import java.io.IOException;

public final class SAD {
    public static C8743R7h parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("country".equals(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("integrity_interstitial_type".equals(A17)) {
                    IntegrityInterstitialType integrityInterstitialType = (IntegrityInterstitialType) IntegrityInterstitialType.A01.get(AnonymousClass7TG.A0l(r6));
                    if (integrityInterstitialType == null) {
                        integrityInterstitialType = IntegrityInterstitialType.UNRECOGNIZED;
                    }
                    r5.A01 = integrityInterstitialType;
                } else if (AnonymousClass000.A00(1566).equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else if ("regulator".equals(A17)) {
                    r5.A04 = AnonymousClass7TG.A0l(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            r5.A00 = new QPe(r5.A01, r5.A02, r5.A03, r5.A04);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
