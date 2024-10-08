package X;

import java.io.IOException;

public abstract class AB6 {
    public static AnonymousClass8GK parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass8GK r0 = new AnonymousClass8GK();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("product_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A01 = A0l;
                } else if ("merchant_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A00 = A0l2;
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass8GK r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("product_id", str);
        }
        String str2 = r3.A00;
        if (str2 != null) {
            r2.A0R("merchant_id", str2);
        }
        r2.A0Z();
    }
}
