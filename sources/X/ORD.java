package X;

import java.io.IOException;

public final class ORD {
    public static NHW parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("ig_followers".equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("fb_friends".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("fb_friends_of_friends".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("people_with_your_phone_number".equals(A17)) {
                    r0.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("others_on_ig".equals(A17)) {
                    r0.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("others_on_fb".equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("fb_messaged_your_page".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("fb_liked_or_followed_your_page".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("eligible_for_linked_page_ig_dm_access".equals(A17)) {
                    r0.A0B = r3.A0d();
                } else if ("setting_enabled_for_linked_page_ig_dm_access".equals(A17)) {
                    r0.A00 = AnonymousClass7TF.A0S(r3);
                } else if ("group_message_setting".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("ig_verified".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, r0, A17);
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
