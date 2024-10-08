package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.Nyn  reason: case insensitive filesystem */
public abstract class C70195Nyn {
    public static C65991ia parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65991ia r0 = new C65991ia();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C66581MXm.A1X(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A00 = A0l;
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A01 = A0l2;
                } else {
                    C66670Mad.A01(r4, r0, A0q);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
