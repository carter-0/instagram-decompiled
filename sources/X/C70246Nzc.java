package X;

import java.io.IOException;

/* renamed from: X.Nzc  reason: case insensitive filesystem */
public abstract class C70246Nzc {
    public static 1dI parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1dI r1 = new 1dI();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("reel_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("story_share".equals(A17)) {
                    r1.A01 = C70880OPu.parseFromJson(r3);
                } else if (AnonymousClass000.A00(755).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("is_story_group_reply".equals(A17)) {
                    r1.A05 = r3.A0d();
                } else if ("is_story_group_reaction".equals(A17)) {
                    r1.A04 = r3.A0d();
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A00 = C49753F5e.parseFromJson(r3);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r1.A06 = r3.A0d();
                } else {
                    C66893Meb.A01(r3, r1, A17);
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
