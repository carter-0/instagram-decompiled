package X;

import java.io.IOException;

/* renamed from: X.CpZ  reason: case insensitive filesystem */
public abstract class C45056CpZ {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CvZ] */
    public static C45393CvZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("merchant".equals(A17)) {
                    obj.A01 = C41845B3m.A0a(r4, false);
                } else if ("item_count".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("multi_merchant_bag_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3590).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
