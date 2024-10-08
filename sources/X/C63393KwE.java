package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.KwE  reason: case insensitive filesystem */
public abstract class C63393KwE {
    public static AnonymousClass5JN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass5JN r0 = new AnonymousClass5JN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("pending_media_key".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
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
