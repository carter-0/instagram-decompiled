package X;

import java.io.IOException;

/* renamed from: X.Ch8  reason: case insensitive filesystem */
public abstract class C44574Ch8 {
    public static BIB parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("end_ts".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (!"highlight_text".equals(A17)) {
                    num2 = C41847B3o.A13(r6, num2, A17, "start_ts");
                } else if (r6.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r6.A1P();
                }
                r6.A0z();
            }
            return new BIB(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
