package X;

import java.io.IOException;

/* renamed from: X.CiX  reason: case insensitive filesystem */
public abstract class C44653CiX {
    public static C45275Cte parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45275Cte cte = new C45275Cte();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("welcome_message_text".equals(A17)) {
                    cte.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("emoji".equals(A17)) {
                    cte.A00 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cte;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
