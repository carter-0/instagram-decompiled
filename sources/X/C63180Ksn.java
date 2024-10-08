package X;

import java.io.IOException;

/* renamed from: X.Ksn  reason: case insensitive filesystem */
public abstract class C63180Ksn {
    public static L6N parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            L6N l6n = new L6N();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("last_save_time".equals(A17)) {
                    l6n.A01 = r3.A0y();
                } else if ("last_user_save_time".equals(A17)) {
                    l6n.A02 = r3.A0y();
                } else if ("last_precapture_save_time".equals(A17)) {
                    l6n.A00 = r3.A0y();
                }
                r3.A0z();
            }
            return l6n;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
