package X;

import java.io.IOException;

public abstract class CXD {
    public static N5B parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("viewers".equals(AnonymousClass7TE.A17(r3))) {
                    num = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return new N5B(num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
