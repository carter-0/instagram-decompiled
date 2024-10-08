package X;

import java.io.IOException;

/* renamed from: X.Def  reason: case insensitive filesystem */
public final class C46418Def {
    public static C46417Dee parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C46417Dee dee = new C46417Dee();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("suggested_users".equals(A0q)) {
                    dee.A02 = C44753CkP.parseFromJson(r3);
                } else if ("new_suggested_users".equals(A0q)) {
                    dee.A01 = C44753CkP.parseFromJson(r3);
                } else if ("max_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    dee.A03 = str;
                } else if ("more_available".equals(A0q)) {
                    dee.A07 = r3.A0d();
                } else if ("friend_center_holdout".equals(A0q)) {
                    dee.A05 = r3.A0d();
                } else if ("has_chaining".equals(A0q)) {
                    dee.A06 = r3.A0d();
                } else if ("auto_expand_chaining".equals(A0q)) {
                    dee.A04 = r3.A0d();
                } else {
                    1XY.A01(r3, dee, A0q);
                }
                r3.A0z();
            }
            return dee;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
