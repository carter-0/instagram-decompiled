package X;

import java.io.IOException;

/* renamed from: X.Cgl  reason: case insensitive filesystem */
public abstract class C44551Cgl {
    public static N4G parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("city_key".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("city_name".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (num != null || !(r7 instanceof 0c9)) {
                return new N4G(num.intValue(), str, 6);
            }
            AnonymousClass7TF.A1L("city_key", r7, "UnifiedAudienceGeolocationCity");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
