package X;

import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

/* renamed from: X.CfB  reason: case insensitive filesystem */
public abstract class C44453CfB {
    public static StoryTemplateReshareMediaDictImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (C273654mx.A00(66).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (C41845B3m.A1J(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new StoryTemplateReshareMediaDictImpl(str, num, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
