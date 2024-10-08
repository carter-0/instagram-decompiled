package X;

import java.io.IOException;

public abstract class VHL {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.VWn, java.lang.Object] */
    public static C17460VWn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("products_description".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1523).equals(A17)) {
                    r3.A0d();
                } else if (AnonymousClass000.A00(3018).equals(A17)) {
                    obj.A00 = Kx2.parseFromJson(r3);
                } else if ("merchant_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("merchant_name".equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
