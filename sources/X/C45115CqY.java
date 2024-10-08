package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.CqY  reason: case insensitive filesystem */
public abstract class C45115CqY {
    public static C267094ax parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C267094ax r1 = new C267094ax();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("creation_time".equals(A17)) {
                    r1.A00 = r4.A0y();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3887).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("radio_type".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
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
