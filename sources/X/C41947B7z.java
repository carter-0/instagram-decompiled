package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.B7z  reason: case insensitive filesystem */
public abstract class C41947B7z {
    public static AnonymousClass9J5 parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Boolean bool = null;
            UNU unu = null;
            BBV bbv = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            String str = null;
            User user = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("avatar_quick_reaction".equals(A0q)) {
                    unu = C44379Cdz.parseFromJson(r14);
                } else if ("emoji_reaction".equals(A0q)) {
                    bbv = C44877CmT.parseFromJson(r14);
                } else if ("emoji_reactions".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            BBV parseFromJson = C44877CmT.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("has_liked".equals(A0q)) {
                    bool2 = Boolean.valueOf(r14.A0d());
                } else if ("is_spam_viewer".equals(A0q)) {
                    bool = Boolean.valueOf(r14.A0d());
                } else if ("reply_text".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r14, false);
                }
                r14.A0z();
            }
            if (bool == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("is_spam_viewer", "StoryViewerWithInteractions");
            } else if (user != null || !(r14 instanceof 0c9)) {
                return new AnonymousClass9J5(bbv, unu, user, bool2, str, arrayList, bool.booleanValue());
            } else {
                ((0c9) r14).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "StoryViewerWithInteractions");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
