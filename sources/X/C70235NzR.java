package X;

import java.io.IOException;

/* renamed from: X.NzR  reason: case insensitive filesystem */
public abstract class C70235NzR {
    public static C65471cn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65471cn r0 = new C65471cn();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("pending_media".equals(A17)) {
                    r0.A00 = LJH.parseFromJson(r3);
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
