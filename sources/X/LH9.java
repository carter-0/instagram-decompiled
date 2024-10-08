package X;

import java.io.IOException;

public final class LH9 {
    public static K0m parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("golden_ticket_number".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r2.A01 = str;
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            String str2 = r2.A01;
            0qQ.A0A(str2);
            r2.A00 = new C61126Jxc(str2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
