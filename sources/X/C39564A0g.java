package X;

import java.io.IOException;

/* renamed from: X.A0g  reason: case insensitive filesystem */
public abstract class C39564A0g {
    public static C381699cB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C381699cB r1 = new C381699cB();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(3043).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("duration_ms".equals(A17)) {
                    r1.A00 = r4.A1D();
                } else if ("audio_asset_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("audio_cluster_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("start_time_ms".equals(A17)) {
                    r1.A01 = r4.A0y();
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
