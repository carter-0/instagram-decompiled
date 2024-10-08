package X;

import java.io.IOException;

public abstract class CbI {
    public static C60924Jti parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("end_cursor".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("has_next_page".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("has_previous_page".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("start_cursor".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_next_page", r10, "PageInfoImpl");
            } else if (bool2 != null || !(r10 instanceof 0c9)) {
                return new C60924Jti(str, str2, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("has_previous_page", r10, "PageInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
