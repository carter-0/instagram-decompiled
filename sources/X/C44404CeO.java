package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.CeO  reason: case insensitive filesystem */
public abstract class C44404CeO {
    public static AnonymousClass60N parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Long l = null;
            Float f = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("is_bestie".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("latest_reel_media".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r9);
                } else if ("story_seen_time".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r9);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str != null || !(r9 instanceof 0c9)) {
                return new AnonymousClass60N(bool, f, l, str);
            }
            AnonymousClass7TF.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r9, "StoryInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
