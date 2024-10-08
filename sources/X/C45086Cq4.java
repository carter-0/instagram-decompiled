package X;

import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Cq4  reason: case insensitive filesystem */
public abstract class C45086Cq4 {
    public static C45442CwS parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C45442CwS cwS = new C45442CwS();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("merchant".equals(A17)) {
                    User A0a = C41845B3m.A0a(r4, false);
                    0qQ.A0B(A0a, 0);
                    cwS.A01 = A0a;
                } else if (AnonymousClass000.A00(1773).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    cwS.A02 = str;
                } else if ("seller_badge_info".equals(A17)) {
                    cwS.A00 = C45085Cq3.parseFromJson(r4);
                }
                r4.A0z();
            }
            return cwS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
