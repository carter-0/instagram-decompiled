package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

public final class F8g {
    public static DwD parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            DwD dwD = new DwD();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("flow_render_type".equals(A17)) {
                    r4.A1D();
                } else if ("step_name".equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if ("nonce".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    dwD.A03 = A0l;
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    dwD.A04 = A0l2;
                } else if ("cni".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    dwD.A02 = A0l3;
                } else if ("bloks_action".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    dwD.A00 = A0l4;
                } else if ("challenge_context".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    dwD.A01 = A0l5;
                } else {
                    1XY.A01(r4, dwD, A17);
                }
                r4.A0z();
            }
            return dwD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
