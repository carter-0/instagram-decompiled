package X;

import java.io.IOException;

public abstract class VEI {
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.V3h] */
    public static C16724V3h parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            VW1 vw1 = null;
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("button".equals(A17)) {
                    vw1 = VEF.parseFromJson(r8);
                } else if ("state_name".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("country_name".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("country_code".equals(A17)) {
                    C41846B3n.A1A(r8);
                } else if ("region_code".equals(A17)) {
                    C41846B3n.A1A(r8);
                }
                r8.A0z();
            }
            if (vw1 != null || !(r8 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = vw1;
                obj.A02 = str;
                obj.A01 = str2;
                return obj;
            }
            AnonymousClass7TF.A1L("button", r8, "StateSelectorInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
