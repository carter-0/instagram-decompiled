package X;

import java.io.IOException;

public abstract class VHD {
    public static C61069Jw7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61069Jw7 jw7 = new C61069Jw7(9);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("product_item".equals(A17)) {
                    jw7.A02 = C44928CnL.parseFromJson(r4);
                } else if ("media_item".equals(A17)) {
                    jw7.A00 = 1Xj.A00(r4);
                } else if ("storefront_item".equals(A17)) {
                    jw7.A01 = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            return jw7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
