package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Nri  reason: case insensitive filesystem */
public abstract class C69759Nri {
    public static N4D parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("aysf_header_title".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("has_more".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r14);
                } else if ("paging_token".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("unreciprocated_follows_only".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r14);
                } else if ("users".equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41846B3n.A1E(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r14.A0z();
            }
            if (bool == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_more", r14, "TextPostAppRecommendedUsersResponse");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("paging_token", r14, "TextPostAppRecommendedUsersResponse");
            } else if (bool2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("unreciprocated_follows_only", r14, "TextPostAppRecommendedUsersResponse");
            } else if (arrayList != null || !(r14 instanceof 0c9)) {
                return new N4D(str, str2, (List) arrayList, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("users", r14, "TextPostAppRecommendedUsersResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
