package X;

import java.io.IOException;

/* renamed from: X.ChS  reason: case insensitive filesystem */
public abstract class C44594ChS {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CsG] */
    public static C45205CsG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("item".equals(A17)) {
                    obj.A00 = 1Xg.A00(r3);
                } else if (AnonymousClass000.A00(4088).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("max_push_down".equals(A17) || "action_type".equals(A17)) {
                    r3.A1D();
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
