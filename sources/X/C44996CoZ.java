package X;

import java.io.IOException;

/* renamed from: X.CoZ  reason: case insensitive filesystem */
public abstract class C44996CoZ {
    public static 1Or parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1Or r1 = new 1Or();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1J(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A03 = A0l;
                } else if ("question_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A04 = A0l2;
                } else if ("reel_viewer_module_name".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A05 = A0l3;
                } else if ("media_delivery_class".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r1.A02 = A0l4;
                } else if ("tray_session_id".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    r1.A07 = A0l5;
                } else if (AnonymousClass000.A00(1502).equals(A17)) {
                    r1.A09 = r4.A0d();
                } else if ("upload_id".equals(A17)) {
                    String A0l6 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l6, 0);
                    r1.A08 = A0l6;
                } else if (C41845B3m.A1O(A17)) {
                    r1.A00 = r4.A1D();
                } else if ("response_type".equals(A17)) {
                    String A0l7 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l7, 0);
                    r1.A06 = A0l7;
                } else if ("tray_position".equals(A17)) {
                    r1.A01 = r4.A1D();
                } else {
                    C66670Mad.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
