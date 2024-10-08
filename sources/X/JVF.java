package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.EglBase14Impl;

public abstract class JVF {
    public static final void A01(AnonymousClass0iw r1, UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        A05(r1, userSession, num, (Map) null);
    }

    public static final void A02(AnonymousClass0iw r6, UserSession userSession, Integer num, Integer num2, Integer num3) {
        0qQ.A0B(userSession, 0);
        A03(r6, userSession, num, num2, num3, (String) null, (String) null, (String) null, (Throwable) null, (Map) null);
    }

    public static final void A04(AnonymousClass0iw r5, UserSession userSession, Integer num, String str, Map map) {
        A03(r5, userSession, num, (Integer) null, (Integer) null, str, (String) null, (String) null, (Throwable) null, map);
    }

    public static final void A05(AnonymousClass0iw r6, UserSession userSession, Integer num, Map map) {
        A03(r6, userSession, num, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Throwable) null, map);
    }

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, Integer num) {
        Long l;
        String str;
        String str2;
        AnonymousClass7TG.A1N(userSession, r3);
        if (r5 != null) {
            String[] A6i = r5.A6i();
            0qQ.A0B(A6i, 0);
            if (A6i.length == 0 || (str2 = A6i[0]) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(str2);
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_branded_content_event");
            if (A0e.isSampled()) {
                A0e.AAJ(TraceFieldType.AdhocEventName, "paid_partnership_label_impression");
                A0e.A9F("user_ig_id", AnonymousClass7TE.A10(userSession.A06));
                A0e.AAJ("media_id", r5.A30());
                switch (num.intValue()) {
                    case 0:
                        str = "reel_viewer";
                        break;
                    case 1:
                        str = "story_tray";
                        break;
                    case 2:
                        str = AnonymousClass000.A00(288);
                        break;
                    default:
                        str = "feed_peek";
                        break;
                }
                A0e.AAJ("event_source", str);
                if (l != null) {
                    A0e.A9F("sponsor_ig_id", C51968G9o.A0v(l));
                }
                A0e.Cgf();
            }
        }
    }

    public static final void A03(AnonymousClass0iw r5, UserSession userSession, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Throwable th, Map map) {
        String str4;
        String str5;
        String str6;
        String str7;
        AnonymousClass7TG.A1N(userSession, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "ig_branded_content_event");
        if (A0e.isSampled()) {
            User A0Q = AnonymousClass7TF.A0Q(userSession);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            if (map != null) {
                A1H.putAll(map);
            }
            if (num == AnonymousClass05K.A0Y) {
                0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(2764), String.valueOf(AnonymousClass7TG.A1X(A0Q.A03.Aks())));
                A1H.putAll(DbY.A0p(AnonymousClass000.A00(2765), String.valueOf(A0Q.A1S()), A1L));
            }
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str7 = "feed_advanced_settings";
                        break;
                    case 2:
                        str7 = "feed_edit";
                        break;
                    case 3:
                        str7 = "story";
                        break;
                    case 4:
                        str7 = "story_edit";
                        break;
                    case 5:
                        str7 = "video_main";
                        break;
                    case 6:
                        str7 = "video_advanced_settings";
                        break;
                    case 7:
                        str7 = "video_edit";
                        break;
                    case 8:
                        str7 = "reel";
                        break;
                    case 9:
                        str7 = "reel_edit";
                        break;
                    case 10:
                        str7 = "panavision";
                        break;
                    case 11:
                        str7 = "panavision_edit";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str7 = "live";
                        break;
                    case 13:
                        str7 = "suspected_bc_notif";
                        break;
                    default:
                        str7 = "feed_main";
                        break;
                }
                A1H.put("entrypoint", str7);
            }
            if (str2 != null) {
                A1H.put("entrypoint", str2);
            }
            if (num3 != null) {
                if (1 - num3.intValue() != 0) {
                    str6 = "brands_only";
                } else {
                    str6 = "project_and_brands";
                }
                A1H.put("flow", str6);
            }
            switch (num.intValue()) {
                case 0:
                    str4 = "bc_ineligible_screen_impression";
                    break;
                case 1:
                    str4 = "bc_ineligible_launch_unified_monetization_screen";
                    break;
                case 2:
                    str4 = "bc_partnerships_creator_entrypoint_impression";
                    break;
                case 3:
                    str4 = "bc_partnerships_brand_entrypoint_impression";
                    break;
                case 4:
                    str4 = "branded_content_creator_contact_about_partnership_tap";
                    break;
                case 5:
                    str4 = "settings_screen_impression";
                    break;
                case 6:
                    str4 = "approve_creators_screen_impression";
                    break;
                case 7:
                    str4 = "approve_creators_screen_button_action";
                    break;
                case 8:
                    str4 = "approve_creators_screen_request_impression";
                    break;
                case 9:
                    str4 = "request_brand_approval_screen_impression";
                    break;
                case 10:
                    str4 = "approve_media_request_screen_impression";
                    break;
                case 11:
                    str4 = "approve_media_request_screen_button_action";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str4 = "ig_branded_content_allowlisted_accounts_entry";
                    break;
                case 13:
                    str4 = "branded_content_creator_contact_drawer_shown";
                    break;
                case 14:
                    str4 = "brand_onboarding_bc_settings_impression";
                    break;
                case 15:
                    str4 = "brand_onboarding_bc_settings_click";
                    break;
                case 16:
                    str4 = "app_campaign_cta_click";
                    break;
                case 17:
                    str4 = "desktop_tool_bc_settings_impression";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    str4 = "desktop_tool_bc_settings_click";
                    break;
                case 19:
                    str4 = "add_pp_label_toggle_switched";
                    break;
                case 20:
                    str4 = "add_brand_partners_brand_action";
                    break;
                case 21:
                    str4 = "add_brand_partners_next_button_tapped";
                    break;
                case 22:
                    str4 = "disclosure_entrypoint_rendered";
                    break;
                case 23:
                    str4 = "disclosure_suggestions_rendered";
                    break;
                case 24:
                    str4 = "disclosure_entrypoint_tapped";
                    break;
                case 25:
                    str4 = "disclosure_suggestion_tapped";
                    break;
                case 26:
                    str4 = "disclosure_menu_rendered";
                    break;
                case 27:
                    str4 = "disclosure_menu_select_project_click";
                    break;
                case 28:
                    str4 = "disclosure_menu_add_brands_manually_click";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    str4 = "disclosure_menu_back_click";
                    break;
                case 30:
                    str4 = "disclosure_menu_project_deselected";
                    break;
                case 31:
                    str4 = "disclosure_menu_audience_restrictions_click";
                    break;
                case 32:
                    str4 = "disclosure_menu_brand_deselected";
                    break;
                case 33:
                    str4 = "disclosure_menu_ads_permission_toggled";
                    break;
                case 34:
                    str4 = "disclosure_review_done_button_tapped";
                    break;
                case 35:
                    str4 = "disclosure_review_brand_partners_tapped";
                    break;
                case 36:
                    str4 = "disclosure_review_brand_removed";
                    break;
                case 37:
                    str4 = "disclosure_review_add_audience_restrictions_tapped";
                    break;
                case 38:
                    str4 = "request_approval_dialog_action";
                    break;
                case 39:
                    str4 = "project_selection_project_selected";
                    break;
                case 40:
                    str4 = "project_selection_done_click";
                    break;
                case Seq.NULL_REFNUM:
                    str4 = "project_selection_back_click";
                    break;
                case Seq.RefTracker.REF_OFFSET:
                    str4 = "error_loading_user";
                    break;
                case 43:
                    str4 = "error_get_list_of_projects_api";
                    break;
                case 44:
                    str4 = "error_get_list_of_projects_missing_fields";
                    break;
                case 45:
                    str4 = "stories_more_options_menu_item_count";
                    break;
                case 46:
                    str4 = "error_get_list_of_campaign_api";
                    break;
                case 47:
                    str4 = "error_get_list_of_campaign_missing_fields";
                    break;
                case 48:
                    str4 = "suspected_bc_alert_impression";
                    break;
                case 49:
                    str4 = "suspected_bc_share_anyway_tapped";
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                    str4 = "suspected_bc_add_tags_tapped";
                    break;
                case 51:
                    str4 = "suspected_bc_creator_review_impression";
                    break;
                case 52:
                    str4 = "suspected_bc_creator_add_ppl_tapped";
                    break;
                case 53:
                    str4 = "suspected_bc_creator_not_bc_tapped";
                    break;
                default:
                    str4 = "suspected_bc_creator_review_confirmation_impression";
                    break;
            }
            A0e.AAJ(TraceFieldType.AdhocEventName, str4);
            A0e.A9F("user_ig_id", 00y.A0n(10, userSession.A06));
            16V A0J = A0Q.A0J();
            if (A0J != null) {
                str5 = A0J.A01;
            } else {
                str5 = null;
            }
            A0e.AAJ("account_type", str5);
            C51973G9u.A14(A0e, "media_id", str3);
            A0e.A9H("extra_data", A1H);
            if (str != null) {
                A0e.A9F("creator_ig_id", 00y.A0n(10, str));
            }
            if (th != null) {
                A0e.AAJ("exception_message", th.getMessage());
                A0e.AAJ(Pxd.A00(86), 2Og.A00(th));
            }
            A0e.Cgf();
        }
    }
}
