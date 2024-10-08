package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.5ID  reason: invalid class name */
public abstract class AnonymousClass5ID {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.5IE, java.lang.Object] */
    public static AnonymousClass5IE parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("simple_user_story_target".equals(A0q)) {
                    obj.A04 = AnonymousClass5IF.parseFromJson(r3);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A05 = str;
                } else if ("all_user_story_target".equals(A0q)) {
                    obj.A00 = C63361Kvi.parseFromJson(r3);
                } else if ("close_friends_user_story_target".equals(A0q)) {
                    obj.A01 = C63363Kvk.parseFromJson(r3);
                } else if ("group_user_story_target".equals(A0q)) {
                    obj.A03 = C63367Kvo.parseFromJson(r3);
                } else if ("community_user_story_target".equals(A0q)) {
                    obj.A02 = C63366Kvn.parseFromJson(r3);
                }
                r3.A0z();
            }
            if (obj.A04 != null || obj.A00 != null || obj.A01 != null || obj.A03 != null || obj.A02 != null) {
                return obj;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
