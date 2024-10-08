package X;

import java.io.IOException;

public final class LHL {
    public static K1W parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            K1W k1w = new K1W();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("live_archive_setting".equals(A17)) {
                    String A1Q = r4.A1Q();
                    0qQ.A0B(A1Q, 0);
                    C62552Khi khi = (C62552Khi) C62552Khi.A01.get(A1Q);
                    if (khi == null) {
                        khi = C62552Khi.UNKNOWN;
                    }
                    k1w.A01 = khi;
                } else if ("live_badge_setting".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    k1w.A00 = C2816858z.A00(str);
                } else if ("passes_live_badge_mes".equals(A17)) {
                    r4.A0d();
                } else if ("passed_live_badge_onboarding".equals(A17)) {
                    k1w.A03 = r4.A0d();
                } else if ("live_auto_save_setting".equals(A17)) {
                    String A1Q2 = r4.A1Q();
                    0qQ.A0B(A1Q2, 0);
                    C391039sF.A01.get(A1Q2);
                } else if ("blocked_lives".equals(A17)) {
                    C347547wz parseFromJson = C347537wy.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    k1w.A02 = parseFromJson;
                } else {
                    1XY.A01(r4, k1w, A17);
                }
                r4.A0z();
            }
            return k1w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
