package X;

import java.io.IOException;

/* renamed from: X.ElB  reason: case insensitive filesystem */
public abstract class C48849ElB {
    public static C61081JwJ parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C61081JwJ jwJ = new C61081JwJ(45);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DcV.A01().equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    jwJ.A01 = str;
                } else if ("profile_pic_url".equals(A17)) {
                    jwJ.A00 = 16h.A00(r3);
                }
                r3.A0z();
            }
            return jwJ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
