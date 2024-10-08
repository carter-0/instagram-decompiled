package X;

import java.io.IOException;

public abstract class CUR {
    public static C47187DsZ parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("category_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (!"category_name".equals(A17)) {
                    bool = C41847B3o.A0z(r10, bool, A17, "is_blocked");
                } else if (r10.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r10.A1P();
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_id", r10, "AdsCategoryInfo");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_name", r10, "AdsCategoryInfo");
            } else if (bool != null || !(r10 instanceof 0c9)) {
                return new C47187DsZ(str, str2, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_blocked", r10, "AdsCategoryInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
