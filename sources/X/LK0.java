package X;

import java.io.IOException;

public abstract class LK0 {
    public static C61043Jvh parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61043Jvh jvh = new C61043Jvh();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("product_id".equals(A17)) {
                    jvh.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("merchant_id".equals(A17)) {
                    jvh.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("confidence_level".equals(A17)) {
                    jvh.A00 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return jvh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61043Jvh jvh, 17Z r3) {
        r3.A0c();
        String str = jvh.A02;
        if (str != null) {
            r3.A0R("product_id", str);
        }
        String str2 = jvh.A01;
        if (str2 != null) {
            r3.A0R("merchant_id", str2);
        }
        r3.A0O("confidence_level", jvh.A00);
        r3.A0Z();
    }
}
