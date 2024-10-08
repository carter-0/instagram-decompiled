package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import java.io.IOException;

/* renamed from: X.Kvn  reason: case insensitive filesystem */
public abstract class C63366Kvn {
    public static GroupProfileUserStoryTarget parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            GroupProfileUserStoryTarget groupProfileUserStoryTarget = new GroupProfileUserStoryTarget();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    groupProfileUserStoryTarget.A01 = str;
                } else if ("group_profile_recipient".equals(A17)) {
                    groupProfileUserStoryTarget.A00 = C330927Ou.parseFromJson(r3);
                }
                r3.A0z();
            }
            return groupProfileUserStoryTarget;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
