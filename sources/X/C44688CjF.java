package X;

import java.io.IOException;

/* renamed from: X.CjF  reason: case insensitive filesystem */
public abstract class C44688CjF {
    public static C66041iq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C66041iq r0 = new C66041iq();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("forward_media".equals(A17)) {
                    r0.A01 = 1Xj.A00(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r0.A00 = C49753F5e.parseFromJson(r3);
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
