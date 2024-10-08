package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.54r  reason: invalid class name and case insensitive filesystem */
public abstract class C2809054r {
    public static C2809254t parseFromJson(16F r19) {
        16F r3 = r19;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            NoteCustomThemeImpl noteCustomThemeImpl = null;
            ArrayList arrayList = null;
            Long l2 = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            User user = null;
            String str4 = null;
            Boolean bool2 = null;
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("audience".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                } else if ("created_at".equals(A0q)) {
                    l = Long.valueOf(r3.A0y());
                } else if ("custom_theme".equals(A0q)) {
                    noteCustomThemeImpl = C2809154s.parseFromJson(r3);
                } else if ("e2ee_mentioned_user_list".equals(A0q)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r3, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("expires_at".equals(A0q)) {
                    l2 = Long.valueOf(r3.A0y());
                } else if ("has_translation".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("media_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("reactions".equals(A0q)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r3.A1J() != 16L.A08) {
                            NoteEmojiReactionInfo parseFromJson = C45601CzD.parseFromJson(r3);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("text".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = 1aC.A00(r3, false);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("viewer_has_liked".equals(A0q)) {
                    bool2 = Boolean.valueOf(r3.A0d());
                }
                r3.A0z();
            }
            return new C2809254t(noteCustomThemeImpl, user, bool, bool2, num, l, l2, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
