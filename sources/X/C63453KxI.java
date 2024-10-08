package X;

import java.io.IOException;

/* renamed from: X.KxI  reason: case insensitive filesystem */
public abstract class C63453KxI {
    public static LE3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            LE3 le3 = new LE3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("media_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    le3.A04 = A0l;
                } else if ("action".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    le3.A01 = A0l2;
                } else if ("container_module".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    le3.A02 = A0l3;
                } else if (AnonymousClass000.A00(76).equals(A17)) {
                    le3.A03 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(810).equals(A17)) {
                    le3.A00 = r4.A1D();
                } else if ("tray_session_id".equals(A17)) {
                    le3.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("viewer_session_id".equals(A17)) {
                    le3.A06 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return le3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
