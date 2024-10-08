package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

public abstract class D10 {
    public static C61073JwB parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61073JwB jwB = new C61073JwB(11);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("thread_fbid".equals(A17)) {
                    jwB.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1E(A17)) {
                    jwB.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1L(A17)) {
                    jwB.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("group_image_uri".equals(A17)) {
                    jwB.A00 = 16h.A00(r3);
                }
                r3.A0z();
            }
            return jwB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61073JwB jwB, 17Z r3) {
        r3.A0c();
        String str = jwB.A02;
        if (str != null) {
            r3.A0R("thread_fbid", str);
        }
        C41846B3n.A10(r3, jwB.A03);
        String str2 = jwB.A01;
        if (str2 != null) {
            r3.A0R("subtitle", str2);
        }
        if (jwB.A00 != null) {
            r3.A0q("group_image_uri");
            16h.A01(r3, (ImageUrl) jwB.A00);
        }
        r3.A0Z();
    }
}
