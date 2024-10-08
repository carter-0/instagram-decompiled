package X;

import java.io.IOException;

public final class B5Z {
    public static CDJ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("should_badge".equals(A0q)) {
                    r2.A01 = Boolean.valueOf(r3.A0d());
                } else {
                    1XY.A01(r3, r2, A0q);
                }
                r3.A0z();
            }
            r2.A00 = new C41882B5a(C41845B3m.A14(r2.A01));
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
