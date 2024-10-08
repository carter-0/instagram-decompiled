package X;

import java.io.IOException;

/* renamed from: X.CqA  reason: case insensitive filesystem */
public abstract class C45092CqA {
    public static C61076JwE parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C61076JwE jwE = new C61076JwE(19);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("sticker_style".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    jwE.A01 = str;
                } else if ("collection_info_meta".equals(A17)) {
                    jwE.A00 = C45091Cq9.parseFromJson(r4);
                }
                r4.A0z();
            }
            return jwE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
