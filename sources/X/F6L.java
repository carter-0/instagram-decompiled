package X;

import java.io.IOException;

public final class F6L {
    public static DwF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            DwF dwF = new DwF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("action".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    dwF.A00 = A0l;
                } else if ("uri".equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if ("render_type".equals(A17)) {
                    r4.A1D();
                } else if ("nonce".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    dwF.A04 = A0l2;
                } else if ("uid".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    dwF.A05 = A0l3;
                } else if ("cni".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    dwF.A03 = A0l4;
                } else if ("bloks_action".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    dwF.A01 = A0l5;
                } else if ("challenge_context".equals(A17)) {
                    String A0l6 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l6, 0);
                    dwF.A02 = A0l6;
                } else {
                    1XY.A01(r4, dwF, A17);
                }
                r4.A0z();
            }
            return dwF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
