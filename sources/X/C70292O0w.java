package X;

import java.io.IOException;

/* renamed from: X.O0w  reason: case insensitive filesystem */
public abstract class C70292O0w {
    public static OEI parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            OEI oei = new OEI();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("instagram_user_id".equals(A17)) {
                    oei.A01 = AnonymousClass7TG.A0l(r3);
                } else if (Dbq.A03().equals(A17)) {
                    oei.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_picture".equals(A17)) {
                    oei.A00 = C70291O0v.parseFromJson(r3);
                }
                r3.A0z();
            }
            return oei;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
