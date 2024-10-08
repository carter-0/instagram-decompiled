package X;

import java.io.IOException;

/* renamed from: X.Ch0  reason: case insensitive filesystem */
public abstract class C44566Ch0 {
    public static BI8 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Double d = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (AnonymousClass000.A00(1822).equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("signal_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if (AnonymousClass000.A00(4112).equals(A17)) {
                    d = C41846B3n.A0e(r6);
                }
                r6.A0z();
            }
            return new BI8(d, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
