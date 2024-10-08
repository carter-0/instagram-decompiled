package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CgB  reason: case insensitive filesystem */
public abstract class C44515CgB {
    public static QP7 parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            Long l = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList2 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("additional_media_pks".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C41847B3o.A1L(r12, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1Q(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("description_media_pk".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r12);
                } else if ("description_username".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("keyword".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if ("user_thumbnails".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            C41846B3n.A1E(r12, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r12.A0z();
            }
            if (str3 != null || !(r12 instanceof 0c9)) {
                return new QP7(l, str, str2, str3, str4, (List) arrayList, (List) arrayList2);
            }
            AnonymousClass7TF.A1L("keyword", r12, "TextAppNullstatePopularKeywordThreadImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
