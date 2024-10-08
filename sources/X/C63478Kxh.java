package X;

import java.io.IOException;

/* renamed from: X.Kxh  reason: case insensitive filesystem */
public abstract class C63478Kxh {
    public static C61052Jvq parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C61052Jvq jvq = new C61052Jvq();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("support_tier".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    jvq.A01 = C2815758n.A00(str);
                } else if ("badges_count".equals(A17)) {
                    jvq.A00 = r3.A1D();
                } else if ("show_highlight".equals(A17)) {
                    jvq.A02 = r3.A0d();
                }
                r3.A0z();
            }
            return jvq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
