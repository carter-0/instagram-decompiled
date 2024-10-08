package X;

import java.io.IOException;

/* renamed from: X.HfC  reason: case insensitive filesystem */
public abstract class C55283HfC {
    public static C54069Gys parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C54069Gys gys = new C54069Gys();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("translation".equals(A17)) {
                    gys.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("text".equals(A17)) {
                    gys.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("source_locale".equals(A17)) {
                    gys.A00 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, gys, A17);
                }
                r3.A0z();
            }
            return gys;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
