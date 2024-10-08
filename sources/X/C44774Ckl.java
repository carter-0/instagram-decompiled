package X;

import java.io.IOException;

/* renamed from: X.Ckl  reason: case insensitive filesystem */
public abstract class C44774Ckl {
    public static C45223Cse parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45223Cse cse = new C45223Cse();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("image".equals(AnonymousClass7TE.A17(r3))) {
                    cse.A00 = C44773Ckk.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cse;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
