package X;

import java.io.IOException;

public abstract class JVY {
    public static C376429Hy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C376429Hy r3 = new C376429Hy(3);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("scale".equals(A0q)) {
                    r3.A02 = (float) r4.A0U();
                } else if ("left_percentage".equals(A0q)) {
                    r3.A00 = (float) r4.A0U();
                } else if ("top_percentage".equals(A0q)) {
                    r3.A03 = (float) r4.A0U();
                } else if ("rotation_degrees".equals(A0q)) {
                    r3.A01 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C376429Hy r2, 17Z r3) {
        r3.A0c();
        r3.A0O("scale", r2.A02);
        r3.A0O("left_percentage", r2.A00);
        r3.A0O("top_percentage", r2.A03);
        r3.A0O("rotation_degrees", r2.A01);
        r3.A0Z();
    }
}
