package X;

import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EdD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48356EdD {
    public static Map A00(C51951G8u g8u) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (g8u.CaC() != null) {
            A1H.put("is_push_enabled", g8u.CaC());
        }
        if (g8u.BWd() != null) {
            TextAppUserFavoriteNotificationPostType BWd = g8u.BWd();
            if (BWd != null) {
                str = BWd.A00;
            } else {
                str = null;
            }
            A1H.put("notification_post_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
