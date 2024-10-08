package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.7IT  reason: invalid class name */
public final class AnonymousClass7IT implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "SuggestedStickerTrayFalcoLogger";
    public final 0wc A00;

    public AnonymousClass7IT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final void A01(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "avatar_stickers_measurement_suggested_sticker_tray_send");
        0bb r1 = new 0bb();
        r1.A06("referrer_surface", str2);
        r1.A06("composer_text_input_session_id", str3);
        r1.A06(Pxd.A00(8), str);
        if (A002.isSampled()) {
            A002.AAK(r1, "event_data");
            A002.AAJ("avatar_session_id", str4);
            A002.AAJ("product", "typeahead");
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return "ig_suggested_sticker_tray";
    }

    public final void A00(String str, String str2, String str3, long j) {
        0qQ.A0B(str, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "avatar_stickers_measurement_suggested_sticker_tray_impression");
        0bb r3 = new 0bb();
        r3.A05("non_avatar_sticker_id", Long.valueOf(j));
        r3.A06("referrer_surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        r3.A06("composer_text_input_session_id", str3);
        r3.A06(Pxd.A00(8), str);
        if (A002.isSampled()) {
            A002.AAK(r3, "event_data");
            A002.AAJ("avatar_session_id", str2);
            A002.AAJ("product", "typeahead");
            A002.Cgf();
        }
    }
}
