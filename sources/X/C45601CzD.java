package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CzD  reason: case insensitive filesystem */
public abstract class C45601CzD {
    public static NoteEmojiReactionInfo parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            User user = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("emoji".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("is_unseen".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r6);
                } else {
                    user = C41846B3n.A0a(r6, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r6.A0z();
            }
            return new NoteEmojiReactionInfo(user, bool, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, NoteEmojiReactionInfo noteEmojiReactionInfo) {
        r2.A0c();
        String str = noteEmojiReactionInfo.A02;
        if (str != null) {
            r2.A0R("emoji", str);
        }
        Boolean bool = noteEmojiReactionInfo.A01;
        if (bool != null) {
            r2.A0S("is_unseen", bool.booleanValue());
        }
        User user = noteEmojiReactionInfo.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        r2.A0Z();
    }
}
