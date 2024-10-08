package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.EnJ  reason: case insensitive filesystem */
public abstract class C48981EnJ {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Exm] */
    public static C49551Exm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("nonce".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("last_updated_at".equals(A17)) {
                    obj.A00 = r3.A0y();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
