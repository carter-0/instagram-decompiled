package X;

import java.io.IOException;

/* renamed from: X.3r9  reason: invalid class name */
public abstract class AnonymousClass3r9 {
    public static C253653rA parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass5Bl r1 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            AnonymousClass4ET r3 = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("linked_fb_page".equals(A0q)) {
                    r1 = AnonymousClass5Bk.parseFromJson(r4);
                } else if ("linked_fb_user".equals(A0q)) {
                    r3 = AnonymousClass4ES.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C253653rA(r1, r3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
