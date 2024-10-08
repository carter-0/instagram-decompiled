package X;

import java.io.IOException;

public final class I2J {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.H2n, X.5u5] */
    public static C54193H2n parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? r0 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A00(r3, r0, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(16F r2, C54193H2n h2n, String str) {
        String A1P;
        if ("formatted_media_count".equals(str)) {
            if (r2.A11() == 16L.A0G) {
                A1P = null;
            } else {
                A1P = r2.A1P();
            }
            h2n.A02 = A1P;
        } else if ("is_effect_page_restricted".equals(str)) {
            h2n.A03 = r2.A0d();
        } else if ("effect_page_restricted_context".equals(str)) {
            h2n.A00 = HU0.parseFromJson(r2);
        } else if ("is_trending_for_clips".equals(str)) {
            r2.A0d();
        } else if ("metadata".equals(str)) {
            h2n.A01 = HUF.parseFromJson(r2);
        } else {
            AnonymousClass93W.A00(r2, h2n, str);
        }
    }
}
