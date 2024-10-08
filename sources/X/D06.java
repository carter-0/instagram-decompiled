package X;

import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class D06 {
    public static SubscriptionStickerDict parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("creator".equals(A17)) {
                    user = C41845B3m.A0a(r8, false);
                } else if ("creator_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("creator_profile_pic_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("creator_username".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new SubscriptionStickerDict(user, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, SubscriptionStickerDict subscriptionStickerDict) {
        r2.A0c();
        User user = subscriptionStickerDict.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, "creator");
        }
        String str = subscriptionStickerDict.A01;
        if (str != null) {
            r2.A0R("creator_id", str);
        }
        String str2 = subscriptionStickerDict.A02;
        if (str2 != null) {
            r2.A0R("creator_profile_pic_url", str2);
        }
        String str3 = subscriptionStickerDict.A03;
        if (str3 != null) {
            r2.A0R("creator_username", str3);
        }
        r2.A0Z();
    }
}
