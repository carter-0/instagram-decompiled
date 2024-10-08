package X;

import java.io.IOException;

/* renamed from: X.Cp3  reason: case insensitive filesystem */
public abstract class C45025Cp3 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.CuH] */
    public static C45313CuH parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("secondary_link".equals(A17)) {
                    obj.A00 = C45047CpQ.parseFromJson(r3);
                } else if ("shop_info".equals(A17)) {
                    obj.A01 = C45086Cq4.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
