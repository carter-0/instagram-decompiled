package X;

import java.io.IOException;

/* renamed from: X.Hun  reason: case insensitive filesystem */
public final class C56220Hun {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Gz7, X.H2n, X.5u5] */
    public static C54083Gz7 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? r0 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("creative_tool_page_reporting_id".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else {
                    I2J.A00(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
