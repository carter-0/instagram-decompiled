package X;

import java.io.IOException;

public abstract class VD1 {
    public static C17583Vab parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17583Vab vab = new C17583Vab();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("reach_count".equals(A17)) {
                    vab.A00 = r3.A1D();
                } else if ("attributed_follows".equals(A17)) {
                    vab.A01 = C16964VCq.parseFromJson(r3);
                } else if ("attributed_profile_visits".equals(A17)) {
                    vab.A02 = C16966VCs.parseFromJson(r3);
                } else if ("impressions".equals(A17)) {
                    vab.A03 = C16968VCu.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1712).equals(A17)) {
                    vab.A04 = C16972VCy.parseFromJson(r3);
                } else if ("share_count".equals(A17)) {
                    vab.A05 = VD0.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vab;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
