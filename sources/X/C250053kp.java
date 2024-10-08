package X;

import java.io.IOException;

/* renamed from: X.3kp  reason: invalid class name and case insensitive filesystem */
public abstract class C250053kp {
    public static C250063kq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("optimization_type".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("option_value".equals(A0q)) {
                    num2 = Integer.valueOf(r4.A1D());
                }
                r4.A0z();
            }
            return new C250063kq(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C250063kq r3) {
        r2.A0c();
        Integer num = r3.A00;
        if (num != null) {
            r2.A0P("optimization_type", num.intValue());
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            r2.A0P("option_value", num2.intValue());
        }
        r2.A0Z();
    }
}
