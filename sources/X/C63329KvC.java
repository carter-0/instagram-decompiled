package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.people.PeopleTag;
import java.io.IOException;

/* renamed from: X.KvC  reason: case insensitive filesystem */
public abstract class C63329KvC {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.people.PeopleTag$UserInfo] */
    public static PeopleTag.UserInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (Dbf.A01().equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17) || "pk".equals(A17) || PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("full_name".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A01 = 16h.A00(r3);
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
