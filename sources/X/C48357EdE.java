package X;

import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import java.io.IOException;

/* renamed from: X.EdE  reason: case insensitive filesystem */
public abstract class C48357EdE {
    public static C47219Dt6 parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("is_push_enabled".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("notification_post_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    textAppUserFavoriteNotificationPostType = (TextAppUserFavoriteNotificationPostType) TextAppUserFavoriteNotificationPostType.A01.get(str);
                    if (textAppUserFavoriteNotificationPostType == null) {
                        textAppUserFavoriteNotificationPostType = TextAppUserFavoriteNotificationPostType.UNRECOGNIZED;
                    }
                }
                r5.A0z();
            }
            return new C47219Dt6(textAppUserFavoriteNotificationPostType, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
