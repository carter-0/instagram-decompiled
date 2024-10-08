package X;

import java.io.IOException;

/* renamed from: X.Ckk  reason: case insensitive filesystem */
public abstract class C44773Ckk {
    public static C45222Csd parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45222Csd csd = new C45222Csd();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("uri".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    csd.A00 = str;
                }
                r3.A0z();
            }
            return csd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
