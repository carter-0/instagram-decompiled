package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class HWW {
    public static final void A00(0xI r4, UserSession userSession, 1Xj r6, int i, int i2, boolean z) {
        if (z) {
            r4.A0C("action", r6.A0C.AYt());
            r4.A0C("tracking_token", C231122qu.A0F(userSession, r6));
            r4.A0C("ad_id", C231122qu.A07(userSession, r6));
        }
        if (r6.A5D() && i != -1) {
            r4.A08(Integer.valueOf(i), "carousel_index");
            1Xj A1c = r6.A1c(0);
            if (A1c != null) {
                r4.A0C("carousel_cover_media_id", A1c.getId());
                1Xj A1c2 = r6.A1c(i);
                if (A1c2 != null) {
                    r4.A0C("carousel_media_id", A1c2.getId());
                    r4.A0C("main_feed_carousel_starting_media_id", r6.A0C.BOq());
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        List A0w = C51965G9l.A0w(r6);
        if (A0w != null && !A0w.isEmpty() && AnonymousClass3WS.A07(userSession)) {
            r4.A0C("translated_language", ((C276074sR) A0w.get(0)).BKV());
            r4.A0D("translation_delivery_method", AnonymousClass7TE.A1I(Dd8.CLOSED_CAPTION.toString()));
        }
        if (i2 >= 0) {
            r4.A08(Integer.valueOf(i2), "m_ix");
        }
    }
}
