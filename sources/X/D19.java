package X;

import java.io.IOException;

public final class D19 {
    public static CGG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("thread_igid".equals(A17)) {
                    r1.A0B = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1E(A17)) {
                    r1.A0C = AnonymousClass7TG.A0l(r3);
                } else if ("is_member".equals(A17)) {
                    r1.A0D = r3.A0d();
                } else if ("number_of_members".equals(A17)) {
                    r1.A06 = AnonymousClass7TF.A0X(r3);
                } else if ("connected_text".equals(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("join_explainer_text".equals(A17)) {
                    r1.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("button_text".equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("is_join_button_disabled".equals(A17)) {
                    r1.A05 = AnonymousClass7TF.A0S(r3);
                } else if ("is_thread_full".equals(A17)) {
                    r1.A0F = r3.A0d();
                } else if ("is_thread_ended".equals(A17)) {
                    r1.A0E = r3.A0d();
                } else if ("group_image_uri".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("error".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (C273654mx.A00(2910).equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0S(r3);
                } else if ("creator_subscriber_thread_group_link_preview_response".equals(A17)) {
                    r1.A03 = Cj9.parseFromJson(r3);
                } else if ("creator_broadcast_chat_thread_group_link_preview_response".equals(A17)) {
                    r1.A02 = CWY.parseFromJson(r3);
                } else if ("thread_subtype".equals(A17)) {
                    r1.A00 = r3.A1D();
                } else if ("shared_thread_content_response".equals(A17)) {
                    r1.A01 = C48350Ed7.parseFromJson(r3);
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
