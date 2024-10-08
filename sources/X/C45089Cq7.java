package X;

import java.io.IOException;

/* renamed from: X.Cq7  reason: case insensitive filesystem */
public abstract class C45089Cq7 {
    public static C61064Jw2 parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C61064Jw2 jw2 = new C61064Jw2();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("is_preselected".equals(A17)) {
                    jw2.A03 = r4.A0d();
                } else if ("selection_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    jw2.A02 = str;
                } else if ("collection_info_meta".equals(A17)) {
                    jw2.A00 = C45091Cq9.parseFromJson(r4);
                } else if ("disabled_info".equals(A17)) {
                    jw2.A01 = C45090Cq8.parseFromJson(r4);
                }
                r4.A0z();
            }
            return jw2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
