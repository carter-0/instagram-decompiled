package X;

import java.io.IOException;

public abstract class OPv {
    public static N49 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            N49 n49 = new N49(38);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("prompt_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    n49.A01 = A0l;
                } else if ("prompt_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    n49.A00 = A0l2;
                }
                r4.A0z();
            }
            return n49;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(N49 n49, 17Z r3) {
        r3.A0c();
        String str = n49.A01;
        if (str != null) {
            r3.A0R("prompt_type", str);
        }
        String str2 = n49.A00;
        if (str2 != null) {
            r3.A0R("prompt_id", str2);
        }
        r3.A0Z();
    }
}
