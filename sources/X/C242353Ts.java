package X;

import java.io.IOException;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
public abstract class C242353Ts {
    public static C242373Tu parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C242373Tu r0 = new C242373Tu();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("instamadillo_cutover".equals(A0q)) {
                    r0.A01 = r4.A1D();
                } else if ("item_type".equals(A0q)) {
                    C242383Tv parseFromJson = AnonymousClass3U2.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A04 = parseFromJson;
                } else if ("ttlc".equals(A0q)) {
                    r0.A03 = r4.A0y();
                } else if ("ever_ttlc_enabled".equals(A0q)) {
                    r0.A00 = r4.A1D();
                } else if ("instamadillo_eligible".equals(A0q)) {
                    r0.A05 = r4.A0d();
                } else if ("proton".equals(A0q)) {
                    r0.A02 = r4.A0y();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
