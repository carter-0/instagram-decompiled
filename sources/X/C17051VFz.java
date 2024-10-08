package X;

import java.io.IOException;

/* renamed from: X.VFz  reason: case insensitive filesystem */
public abstract class C17051VFz {
    public static C15023UKc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C15023UKc uKc = new C15023UKc();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(1245).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    uKc.A01 = A0l;
                } else if (AnonymousClass000.A00(4671).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    uKc.A02 = A0l2;
                } else if ("media_id".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    uKc.A04 = A0l3;
                } else if ("question_id".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    uKc.A05 = A0l4;
                } else if (AnonymousClass000.A00(3859).equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    uKc.A06 = A0l5;
                } else if (AnonymousClass000.A00(321).equals(A17)) {
                    String A0l6 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l6, 0);
                    uKc.A03 = A0l6;
                } else if ("tray_session_id".equals(A17)) {
                    String A0l7 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l7, 0);
                    uKc.A07 = A0l7;
                } else if ("tray_position".equals(A17)) {
                    uKc.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return uKc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
