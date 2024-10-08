package X;

import java.io.IOException;

public abstract class VDK {
    public static C17584Vac parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17584Vac vac = new C17584Vac();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("story_exits_count".equals(A17)) {
                    vac.A00 = r3.A1D();
                } else if ("story_link_navigation_count".equals(A17)) {
                    vac.A01 = r3.A1D();
                } else if ("attributed_follows".equals(A17)) {
                    vac.A02 = VDB.parseFromJson(r3);
                } else if ("attributed_profile_visits".equals(A17)) {
                    vac.A03 = VDD.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1712).equals(A17)) {
                    vac.A04 = VDH.parseFromJson(r3);
                } else if ("share_count".equals(A17)) {
                    vac.A05 = VDJ.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vac;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
