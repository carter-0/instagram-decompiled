package X;

import java.io.IOException;

/* renamed from: X.F6e  reason: case insensitive filesystem */
public final class C49771F6e {
    public static Dw8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("fb_name".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else {
                    if ("button_text".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("found_fb_user".equals(A17)) {
                        r1.A04 = r3.A0d();
                    } else if ("social_context".equals(A17)) {
                        r1.A03 = AnonymousClass7TG.A0l(r3);
                    } else if ("email".equals(A17)) {
                        r1.A00 = AnonymousClass7TG.A0l(r3);
                    } else if (Pxd.A00(101).equals(A17)) {
                        r1.A02 = AnonymousClass7TG.A0l(r3);
                    } else if (!Dbj.A03().equals(A17)) {
                        1XY.A01(r3, r1, A17);
                    } else if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
