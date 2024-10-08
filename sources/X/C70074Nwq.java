package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.Nwq  reason: case insensitive filesystem */
public abstract class C70074Nwq {
    public static N46 parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            C272074k3 r4 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("timestamp".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("action_type".equals(A17)) {
                    r4 = C272074k3.valueOf(r10.A1P().toUpperCase(Locale.US));
                }
                r10.A0z();
            }
            if (l == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("timestamp", r10, "DirectVisualMessageActionLog");
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r10, "DirectVisualMessageActionLog");
            } else if (r4 != null || !(r10 instanceof 0c9)) {
                return new N46(r4, str, l.longValue());
            } else {
                AnonymousClass7TF.A1L("action_type", r10, "DirectVisualMessageActionLog");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
