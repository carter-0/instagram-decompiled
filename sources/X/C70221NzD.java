package X;

import java.io.IOException;

/* renamed from: X.NzD  reason: case insensitive filesystem */
public abstract class C70221NzD {
    public static 1jN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1jN r1 = new 1jN();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66580MXl.A1Z(A17)) {
                    r1.A05 = C66580MXl.A0h(r4);
                } else if (AnonymousClass000.A00(792).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A08 = A0l;
                } else if ("sticker_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A07 = A0l2;
                } else if (AnonymousClass000.A00(1842).equals(A17)) {
                    r1.A01 = 16h.A00(r4);
                } else if ("should_send_silently".equals(A17)) {
                    r1.A0A = r4.A0d();
                } else if ("is_animated".equals(A17)) {
                    r1.A09 = r4.A0d();
                } else if ("pending_media".equals(A17)) {
                    r1.A04 = LJH.parseFromJson(r4);
                } else if ("static_sticker_item".equals(A17)) {
                    r1.A02 = C369258u7.parseFromJson(r4);
                } else if ("nux_type".equals(A17)) {
                    r1.A06 = AnonymousClass7TF.A0X(r4);
                } else if ("replied_to_message".equals(A17)) {
                    r1.A03 = C254933tI.A00(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
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
