package X;

import java.io.IOException;

public abstract class CXE {
    public static N5C parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            N5B n5b = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("client_context".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("creator_insights".equals(A17)) {
                    n5b = CXD.parseFromJson(r9);
                } else if ("item_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("client_context", r9, "DirectNonCriticalMessageResponseImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new N5C(n5b, str, str2);
            } else {
                AnonymousClass7TF.A1L("item_id", r9, "DirectNonCriticalMessageResponseImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
