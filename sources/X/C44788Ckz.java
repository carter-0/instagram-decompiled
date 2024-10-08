package X;

import java.io.IOException;

/* renamed from: X.Ckz  reason: case insensitive filesystem */
public abstract class C44788Ckz {
    public static C45381CvN parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45381CvN cvN = new C45381CvN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("is_checked_by_default".equals(A17)) {
                    cvN.A02 = r3.A0d();
                } else if ("is_required".equals(A17)) {
                    cvN.A03 = r3.A0d();
                } else if ("token_key".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    cvN.A01 = str;
                } else if ("checkbox_body".equals(A17)) {
                    cvN.A00 = C44787Cky.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cvN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
