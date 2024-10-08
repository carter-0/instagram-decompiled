package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand;
import java.util.List;

/* renamed from: X.OaQ  reason: case insensitive filesystem */
public abstract class C71048OaQ {
    public static final void A00(C69447Nlr nlr, AnonymousClass0iw r4, UserSession userSession, C69332NjX njX, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2) {
        String str3;
        String str4;
        String str5;
        0qQ.A0B(userSession, 0);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "direct_ai_sticker_interaction");
            if (A0e.isSampled()) {
                if (njX != null) {
                    A0e.AAJ("modal_type", njX.A00);
                }
                if (num3 != null) {
                    switch (num3.intValue()) {
                        case 1:
                            str5 = "bad_result";
                            break;
                        case 2:
                            str5 = ImagineAnimatePlainTextCommand.TRIGGER_KEY;
                            break;
                        case 3:
                            str5 = "remove_animation";
                            break;
                        case 4:
                            str5 = "report";
                            break;
                        default:
                            str5 = "good_result";
                            break;
                    }
                    A0e.AAJ("menu_selection", str5);
                }
                if (nlr != null) {
                    A0e.A8M(nlr, "tray_type");
                }
                if (str != null) {
                    A0e.AAe("sticker_ids", AnonymousClass7TE.A1I(str));
                }
                switch (num.intValue()) {
                    case 0:
                        str3 = "long_press";
                        break;
                    case 1:
                        str3 = "long_press_menu_click";
                        break;
                    case 2:
                        str3 = "MODAL_OPENED";
                        break;
                    case 3:
                        str3 = "MODAL_CLOSED";
                        break;
                    case 4:
                        str3 = "MODAL_BUTTON_CLICKED";
                        break;
                    case 5:
                        str3 = "AI_STICKER_FULL_SHEET_OPENED";
                        break;
                    default:
                        str3 = "AI_STICKER_FULL_SHEET_CLOSED";
                        break;
                }
                A0e.AAJ("interaction_type", str3);
                switch (num2.intValue()) {
                    case 0:
                        str4 = "sticker_tray";
                        break;
                    case 1:
                        str4 = "stories_sticker_tray";
                        break;
                    default:
                        str4 = DialogModule.KEY_MESSAGE;
                        break;
                }
                DbS.A1N(A0e, str4);
                A0e.AAJ("bottom_sheet_session_id", str2);
                A0e.A7p("is_animated", bool);
                A0e.Cgf();
            }
        }
    }

    public static final void A02(C69447Nlr nlr, AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, String str4, List list) {
        0qQ.A0B(nlr, 6);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "direct_ai_sticker_model_response_received");
            if (A0e.isSampled()) {
                if (str != null) {
                    A0e.AAJ("error_message", str);
                }
                if (list == null) {
                    A0e.A9F("sticker_count", C51971G9r.A0m());
                    A0e.AAe("sticker_ids", (List) null);
                } else {
                    A0e.A9F("sticker_count", DbS.A0j(list.size()));
                    A0e.AAe("sticker_ids", list);
                }
                A0e.AAJ("search_query", str2);
                C66584MXp.A0n(nlr, A0e, str3, str4);
                A0e.Cgf();
            }
        }
    }

    public static final void A01(C69447Nlr nlr, AnonymousClass0iw r4, UserSession userSession, Long l, String str, String str2, String str3, List list, boolean z) {
        AnonymousClass7TG.A1N(userSession, r4);
        0qQ.A0B(nlr, 5);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "direct_ai_sticker_impression");
            if (A0e.isSampled()) {
                A0e.AAJ("search_query", str);
                A0e.A9F("sticker_count", DbS.A0j(list.size()));
                A0e.AAe("sticker_ids", list);
                C66584MXp.A0n(nlr, A0e, str2, str3);
                A0e.A7p("is_animated", Boolean.valueOf(z));
                A0e.A9F("sticker_position_index", l);
                A0e.Cgf();
            }
        }
    }

    public static final void A03(C69480NmO nmO, AnonymousClass0iw r4, UserSession userSession, Long l, String str, String str2, List list, boolean z) {
        AnonymousClass7TG.A1N(userSession, r4);
        if (C70014Nvs.A00(userSession)) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_direct_sticker_impression");
            if (A0e.isSampled()) {
                A0e.AAJ("search_query", str);
                A0e.AAe("sticker_ids", list);
                A0e.A8M(nmO, "sticker_type");
                A0e.AAJ("bottom_sheet_session_id", str2);
                A0e.A9F("sticker_position_index", l);
                A0e.A7p("is_animated", Boolean.valueOf(z));
                A0e.Cgf();
            }
        }
    }
}
