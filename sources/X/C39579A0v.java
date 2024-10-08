package X;

import java.io.IOException;

/* renamed from: X.A0v  reason: case insensitive filesystem */
public abstract class C39579A0v {
    public static AD7 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AD7 ad7 = new AD7();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("input_width".equals(A17)) {
                    ad7.A01 = AnonymousClass7TF.A0U(r3);
                } else if ("input_height".equals(A17)) {
                    ad7.A00 = AnonymousClass7TF.A0U(r3);
                } else if ("giphy_uri".equals(A17)) {
                    ad7.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("screen_width".equals(A17)) {
                    ad7.A02 = AnonymousClass7TF.A0X(r3);
                } else if ("ui_version".equals(A17)) {
                    ad7.A04 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return ad7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
