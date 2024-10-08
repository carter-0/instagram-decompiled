package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.F8a  reason: case insensitive filesystem */
public final class C49813F8a {
    public static DwG parseFromJson(16F r4) {
        String A0l;
        0qQ.A0B(r4, 0);
        try {
            DwG dwG = new DwG();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("flow_render_type".equals(A17)) {
                    r4.A1D();
                } else {
                    if ("step_name".equals(A17)) {
                        A0l = AnonymousClass7TG.A0l(r4);
                    } else if ("uri".equals(A17)) {
                        A0l = AnonymousClass7TG.A0l(r4);
                    } else if ("nonce".equals(A17)) {
                        String A0l2 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l2, 0);
                        dwG.A04 = A0l2;
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                        String A0l3 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l3, 0);
                        dwG.A06 = A0l3;
                    } else if ("cni".equals(A17)) {
                        String A0l4 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l4, 0);
                        dwG.A02 = A0l4;
                    } else if ("bloks_action".equals(A17)) {
                        String A0l5 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l5, 0);
                        dwG.A00 = A0l5;
                    } else if ("challenge_context".equals(A17)) {
                        String A0l6 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l6, 0);
                        dwG.A01 = A0l6;
                    } else if ("autoconf_eligible".equals(A17)) {
                        dwG.A07 = r4.A0d();
                    } else if (AnonymousClass000.A00(3721).equals(A17)) {
                        String A0l7 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l7, 0);
                        dwG.A05 = A0l7;
                    } else if (AnonymousClass000.A00(2919).equals(A17)) {
                        String A0l8 = AnonymousClass7TG.A0l(r4);
                        0qQ.A0B(A0l8, 0);
                        dwG.A03 = A0l8;
                    } else {
                        1XY.A01(r4, dwG, A17);
                    }
                    0qQ.A0B(A0l, 0);
                }
                r4.A0z();
            }
            return dwG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
