package X;

import com.instagram.common.session.UserSession;

public final class GPJ {
    public static final GPJ A00 = new Object();

    public final void A04(GPK gpk, UserSession userSession, String str, String str2, String str3, String str4) {
        DbW.A1N(str, 1, str4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_author_profile_click_client");
        Long A002 = A00(userSession, str4);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            DbS.A1O(A0e, str);
            A0e.A8M(gpk, "event_source");
            A0e.AAJ("inventory_source", str2);
            C51969G9p.A1D(A0e, str3);
        }
    }

    public final void A06(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_reply_sheet_impression_client");
        Long A002 = A00(userSession, str4);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            C51971G9r.A1A(A0e, str, str2);
            C51965G9l.A1G(A0e, DbZ.A0c(num));
            C51973G9u.A14(A0e, "carousel_media_id", str5);
            C51969G9p.A1D(A0e, str3);
        }
    }

    public final void A07(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        DbW.A1O(str, 1, str5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_keyboard_interaction_client");
        Long A002 = A00(userSession, str5);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            C51971G9r.A1A(A0e, str, str2);
            C51965G9l.A1G(A0e, DbZ.A0c(num));
            C51973G9u.A14(A0e, "carousel_media_id", str3);
            C51969G9p.A1D(A0e, str4);
        }
    }

    public static final Long A00(UserSession userSession, String str) {
        if (((AnonymousClass4JM) userSession.A01(AnonymousClass4JM.class, AnonymousClass4JL.A00)).A01(str)) {
            return null;
        }
        return AnonymousClass7TE.A10(str);
    }

    public static final void A01(C62651KkD kkD, UserSession userSession, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        Long l;
        AnonymousClass7TG.A1O(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_reply_send_client");
        if (A0e.isSampled()) {
            A0e.A9F("target_user_id", AnonymousClass7TE.A10(str));
            C51971G9r.A1A(A0e, str2, str3);
            Long l2 = null;
            if (num2 != null) {
                l = C51969G9p.A0r(num2);
            } else {
                l = null;
            }
            C51965G9l.A1G(A0e, l);
            C51973G9u.A14(A0e, "carousel_media_id", str4);
            if (num != null) {
                l2 = C51969G9p.A0r(num);
            }
            A0e.A9F("media_client_position", l2);
            A0e.A8M(kkD, AnonymousClass000.A00(1764));
            A0e.Cgf();
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_production_nux_new_tooltip_impression_client");
        if (A0e.isSampled()) {
            C51965G9l.A1J(A0e, str2);
            DbS.A1O(A0e, str);
            A0e.Cgf();
        }
    }

    public final void A03(GPK gpk, UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1P(str, str3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_media_note_report_click_client");
        Long A002 = A00(userSession, str3);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            C51971G9r.A1A(A0e, str, str2);
            C51965G9l.A1G(A0e, DbZ.A0c(num));
            A0e.AAJ("carousel_media_id", str4);
            A0e.A8M(gpk, "event_source");
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public final void A05(UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        AnonymousClass7TG.A1N(userSession, str);
        0qQ.A0B(str4, 4);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        if (num.intValue() != 2) {
            str5 = "double_tap";
        } else {
            str5 = "single_tap";
        }
        0Aj A0e = AnonymousClass7TE.A0e(A02, "instagram_media_note_gesture_nux_interaction_client");
        Long A002 = A00(userSession, str4);
        if (A0e.isSampled() && A002 != null) {
            A0e.A9F("note_id", A002);
            A0e.AAJ("gesture_type", str5);
            C51973G9u.A14(A0e, "container_module", str);
            A0e.AAJ("inventory_source", str2);
            C51969G9p.A1D(A0e, str3);
        }
    }
}
