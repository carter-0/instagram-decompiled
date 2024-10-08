package X;

import java.io.IOException;

/* renamed from: X.Nyx  reason: case insensitive filesystem */
public abstract class C70205Nyx {
    public static C65721gN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65721gN r1 = new C65721gN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(771).equals(A17)) {
                    r1.A00 = AnonymousClass3SY.parseFromJson(r3);
                } else if ("message_user_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("last_seen_shh_message_id".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("is_advancing_shh_seen_marker".equals(A17)) {
                    r1.A03 = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r1, A17);
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
