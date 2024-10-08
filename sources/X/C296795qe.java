package X;

import java.io.IOException;

/* renamed from: X.5qe  reason: invalid class name and case insensitive filesystem */
public abstract class C296795qe {
    public static C296805qf parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("p_comment_button_tap_LOGGING_ONLY_DO_NOT_USE".equals(A0q)) {
                    f = new Float(r9.A0U());
                } else if ("p_reshare_button_tap".equals(A0q)) {
                    f2 = new Float(r9.A0U());
                } else if ("should_force_new_preload_chaining".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if (AnonymousClass000.A00(3997).equals(A0q)) {
                    bool2 = Boolean.valueOf(r9.A0d());
                } else if (AnonymousClass000.A00(3998).equals(A0q)) {
                    bool3 = Boolean.valueOf(r9.A0d());
                } else if (AnonymousClass000.A00(3999).equals(A0q)) {
                    bool4 = Boolean.valueOf(r9.A0d());
                }
                r9.A0z();
            }
            return new C296805qf(bool, bool2, bool3, bool4, f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
