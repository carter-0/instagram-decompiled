package X;

import java.io.IOException;

/* renamed from: X.4sY  reason: invalid class name and case insensitive filesystem */
public abstract class C276094sY {
    public static C276104sZ parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("max_id".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("more_available".equals(A0q)) {
                    bool = Boolean.valueOf(r7.A0d());
                }
                r7.A0z();
            }
            if (bool != null || !(r7 instanceof 0c9)) {
                return new C276104sZ(str, bool.booleanValue());
            }
            ((0c9) r7).A03.A00("more_available", "PagingInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
