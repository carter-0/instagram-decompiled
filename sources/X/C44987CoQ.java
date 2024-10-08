package X;

import java.io.IOException;

/* renamed from: X.CoQ  reason: case insensitive filesystem */
public abstract class C44987CoQ {
    public static AnonymousClass1OR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1OR r0 = new AnonymousClass1OR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1J(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("poll_id".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("viewer_vote".equals(A17)) {
                    r0.A02 = AnonymousClass7TF.A0X(r3);
                } else if ("pre_viewer_voted_poll_option_index".equals(A17)) {
                    r0.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("radio_type".equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("reel_viewer_module_name".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("media_delivery_class".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_session_id".equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_position".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else if ("allow_vote_change".equals(A17)) {
                    r0.A09 = r3.A0d();
                } else if ("is_poll_vote_deletion_request".equals(A17)) {
                    r0.A0A = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r0, A17);
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
