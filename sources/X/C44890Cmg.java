package X;

import java.io.IOException;

/* renamed from: X.Cmg  reason: case insensitive filesystem */
public abstract class C44890Cmg {
    public static C270834hN parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C239653Hl r4 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C42064BFr bFr = null;
            AnonymousClass3HX r2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("broadcast".equals(A17)) {
                    r4 = C277424v9.parseFromJson(r5);
                } else if (AnonymousClass000.A00(1695).equals(A17)) {
                    bFr = C44244Cbf.parseFromJson(r5);
                } else if ("reel".equals(A17)) {
                    r2 = AnonymousClass3HR.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C270834hN(r4, bFr, r2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
