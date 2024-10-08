package X;

import java.io.IOException;

/* renamed from: X.Cld  reason: case insensitive filesystem */
public abstract class C44827Cld {
    public static C43829CEv parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("show_follow_button".equals(A17) || "show_save_button".equals(A17) || AnonymousClass000.A00(4008).equals(A17)) {
                    r3.A0d();
                } else {
                    1XY.A01(r3, r1, A17);
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
