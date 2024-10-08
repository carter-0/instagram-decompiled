package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.CWc  reason: case insensitive filesystem */
public abstract class C44111CWc {
    public static C53439GoX parseFromJson(16F r17) {
        String str;
        16F r2 = r17;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            UserMonetizationProductType userMonetizationProductType = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("can_use_product".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("has_onboarded".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r2);
                } else if ("info".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("is_eligible_to_set_up".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r2);
                } else if ("product_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    userMonetizationProductType = C272504kq.A00(str);
                }
                r2.A0z();
            }
            if (bool == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_use_product", r2, "CreatorToolsGatingInfoImpl");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_onboarded", r2, "CreatorToolsGatingInfoImpl");
            } else if (str2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("info", r2, "CreatorToolsGatingInfoImpl");
            } else if (bool3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_eligible_to_set_up", r2, "CreatorToolsGatingInfoImpl");
            } else if (userMonetizationProductType != null || !(r2 instanceof 0c9)) {
                return new C53439GoX(userMonetizationProductType, str2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L("product_type", r2, "CreatorToolsGatingInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
