package X;

import java.io.IOException;

/* renamed from: X.Cxr  reason: case insensitive filesystem */
public abstract class C45517Cxr {
    public static C257653xk parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("delay_time_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else {
                    num2 = C41847B3o.A13(r4, num2, A17, "highlight_time_ms");
                }
                r4.A0z();
            }
            return new C257653xk(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C257653xk r3) {
        r2.A0c();
        Integer num = r3.A00;
        if (num != null) {
            r2.A0P("delay_time_ms", num.intValue());
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            r2.A0P("highlight_time_ms", num2.intValue());
        }
        r2.A0Z();
    }
}
