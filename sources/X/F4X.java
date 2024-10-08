package X;

import java.io.IOException;

public final class F4X {
    public static C47311Due parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("count".equals(A17)) {
                    r2.A01 = AnonymousClass7TF.A0X(r3);
                } else {
                    1XY.A01(r3, r2, A17);
                }
                r3.A0z();
            }
            Integer num = r2.A01;
            0qQ.A0A(num);
            r2.A00 = new C47221Dt8(num.intValue());
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
