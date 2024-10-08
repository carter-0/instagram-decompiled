package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CZi  reason: case insensitive filesystem */
public abstract class C44195CZi {
    public static C298725tv parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            HashtagImpl hashtagImpl = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList2 = null;
            User user = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("context_type".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("hashtag".equals(A17)) {
                    hashtagImpl = C279594yt.parseFromJson(r11);
                } else if ("media_infos".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1D(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("pk".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if (!"topic_user_profile_urls".equals(A17)) {
                    user = C41846B3n.A0a(r11, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                } else if (r11.A11() == 16L.A0C) {
                    arrayList2 = AnonymousClass7TE.A1C();
                    while (r11.A1J() != 16L.A08) {
                        C41846B3n.A1B(r11, arrayList2);
                    }
                } else {
                    arrayList2 = null;
                }
                r11.A0z();
            }
            return new C298725tv(hashtagImpl, user, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
