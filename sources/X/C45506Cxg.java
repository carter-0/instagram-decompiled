package X;

import java.io.IOException;

/* renamed from: X.Cxg  reason: case insensitive filesystem */
public abstract class C45506Cxg {
    public static C278044w9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            while (r4.A1J() != 16L.A09) {
                if ("disclosure_tag".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                }
                r4.A0z();
            }
            return new C278044w9(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C278044w9 r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("disclosure_tag", str);
        }
        r2.A0Z();
    }
}
