package X;

import java.io.IOException;

/* renamed from: X.Cpr  reason: case insensitive filesystem */
public abstract class C45074Cpr {
    public static C61037Jvb parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61037Jvb jvb = new C61037Jvb();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("account_id".equals(A17)) {
                    jvb.A00 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1J(A17)) {
                    jvb.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("pagination_token".equals(A17)) {
                    jvb.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return jvb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
