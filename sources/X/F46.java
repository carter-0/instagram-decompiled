package X;

import com.instagram.user.model.User;
import java.io.IOException;

public final class F46 {
    public static C47294DuN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    r2.A01 = C41845B3m.A0a(r4, false);
                } else {
                    1XY.A01(r4, r2, A17);
                }
                r4.A0z();
            }
            User user = r2.A01;
            0qQ.A0A(user);
            r2.A00 = new EtB(user);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
