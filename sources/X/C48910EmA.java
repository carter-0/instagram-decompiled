package X;

import java.io.IOException;

/* renamed from: X.EmA  reason: case insensitive filesystem */
public abstract class C48910EmA {
    public static C49547Exi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C49547Exi exi = new C49547Exi();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1B(A17)) {
                    exi.A00 = C49001End.parseFromJson(r3);
                } else if ("user_fbid".equals(A17)) {
                    exi.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("sso_token_user_fbid".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("is_sso_enabled".equals(A17)) {
                    exi.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("order_rank".equals(A17)) {
                    r3.A0y();
                }
                r3.A0z();
            }
            return exi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
