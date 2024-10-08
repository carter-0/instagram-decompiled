package X;

import java.io.IOException;

/* renamed from: X.NzN  reason: case insensitive filesystem */
public abstract class C70231NzN {
    public static 1cX parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            1cX r0 = new 1cX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("link".equals(A17)) {
                    r0.A00 = C278334wi.parseFromJson(r3);
                } else if ("after_post_action".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A04 = str;
                } else if ("replied_to_message".equals(A17)) {
                    r0.A02 = C254933tI.A00(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r0.A01 = C49753F5e.parseFromJson(r3);
                } else if ("private_reply_info".equals(A17)) {
                    r0.A03 = OQU.parseFromJson(r3);
                } else if ("is_channel_invite_link".equals(A17)) {
                    r0.A05 = r3.A0d();
                } else if ("is_x_transport_forward".equals(A17)) {
                    r0.A06 = r3.A0d();
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
