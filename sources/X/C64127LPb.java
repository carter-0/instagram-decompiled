package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LPb  reason: case insensitive filesystem */
public abstract class C64127LPb {
    public static void A00(C62661KkN kkN, MXF mxf, Integer num, String str, String str2, HashMap hashMap) {
        String str3;
        0qQ.A0B(mxf, 0);
        LDW BO3 = mxf.BO3();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(mxf, BO3.A03), "ig_branded_content_event");
        if (A0e.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str3 = "media_kit_init_create";
                    break;
                case 1:
                    str3 = "media_kit_view_intro";
                    break;
                case 2:
                    str3 = "media_kit_intro_click_close";
                    break;
                case 3:
                    str3 = "media_kit_intro_info_click_close";
                    break;
                case 4:
                    str3 = "media_kit_view_intro_info";
                    break;
                case 5:
                    str3 = "media_kit_intro_click_info_icon";
                    break;
                case 6:
                    str3 = "media_kit_intro_click_proceed";
                    break;
                case 7:
                    str3 = "media_kit_template_promo_click";
                    break;
                case 8:
                    str3 = "media_kit_loaded";
                    break;
                case 9:
                    str3 = "media_kit_view";
                    break;
                case 10:
                    str3 = "media_kit_view_edit_menu_sheet";
                    break;
                case 11:
                    str3 = "media_kit_start_edit_title";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str3 = "media_kit_start_edit_bio";
                    break;
                case 13:
                    str3 = "media_kit_view_visibility_sheet";
                    break;
                case 14:
                    str3 = "media_kit_set_visibility_private";
                    break;
                case 15:
                    str3 = "media_kit_set_visibility_public";
                    break;
                case 16:
                    str3 = "media_kit_click_share";
                    break;
                case 17:
                    str3 = "media_kit_load_error";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    str3 = "media_kit_template_load_error";
                    break;
                case 19:
                    str3 = "media_kit_update_visibility_error";
                    break;
                case 20:
                    str3 = "media_kit_delete_error";
                    break;
                case 21:
                    str3 = "media_kit_update_error";
                    break;
                case 22:
                    str3 = "media_kit_publish_error";
                    break;
                case 23:
                    str3 = "media_kit_fetch_insights_error";
                    break;
                case 24:
                    str3 = "media_kit_click_edit_cover";
                    break;
                case 25:
                    str3 = "media_kit_published";
                    break;
                case 26:
                    str3 = "media_kit_updated";
                    break;
                case 27:
                    str3 = "media_kit_click_delete";
                    break;
                case 28:
                    str3 = "media_kit_confirm_delete";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    str3 = "media_kit_click_edit";
                    break;
                case 30:
                    str3 = "media_kit_click_add_section";
                    break;
                case 31:
                    str3 = "media_kit_select_add_section";
                    break;
                case 32:
                    str3 = "media_kit_click_remove_section";
                    break;
                case 33:
                    str3 = "media_kit_confirm_remove_section";
                    break;
                case 34:
                    str3 = "media_kit_click_reorder_sections";
                    break;
                case 35:
                    str3 = "media_kit_click_hide_like_count";
                    break;
                case 36:
                    str3 = "media_kit_click_show_like_count";
                    break;
                case 37:
                    str3 = "media_kit_click_save";
                    break;
                case 38:
                    str3 = "media_kit_click_close";
                    break;
                case 39:
                    str3 = "media_kit_confirm_discard";
                    break;
                case 40:
                    str3 = "media_kit_click_insights_info_icon";
                    break;
                case Seq.NULL_REFNUM:
                    str3 = "media_kit_click_accounts_info_icon";
                    break;
                case Seq.RefTracker.REF_OFFSET:
                    str3 = "media_kit_view_specific_media";
                    break;
                case 43:
                    str3 = "media_kit_view_ig_profile";
                    break;
                case 44:
                    str3 = "media_kit_view_creator_profile";
                    break;
                case 45:
                    str3 = "media_kit_start_edit_section_title";
                    break;
                case 46:
                    str3 = "media_kit_start_edit_section_description";
                    break;
                case 47:
                    str3 = "media_kit_selected_posts_media";
                    break;
                case 48:
                    str3 = "media_kit_selected_cover_media";
                    break;
                case 49:
                    str3 = "media_kit_selected_user_profiles";
                    break;
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                    str3 = "media_kit_view_direct_sheet";
                    break;
                case 51:
                    str3 = "media_kit_send_direct_message";
                    break;
                case 52:
                    str3 = "media_kit_view_message_creator";
                    break;
                case 53:
                    str3 = "media_kit_click_message_creator";
                    break;
                case 54:
                    str3 = "media_kit_click_preferred_brand_partners";
                    break;
                case 55:
                    str3 = "media_kit_enabled_audio";
                    break;
                default:
                    str3 = "media_kit_disabled_audio";
                    break;
            }
            A0e.AAJ(TraceFieldType.AdhocEventName, str3);
            A0e.AAJ("bc_product_type", "media_kit");
            A0e.A9F(AnonymousClass000.A00(3572), C51972G9s.A0i(BO3.A01));
            A0e.AAJ(Dbf.A00(), BO3.A02);
            A0e.AAJ("entrypoint", BO3.A00.A00);
            A0e.A8M(kkN, "media_kit_section_type");
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (A1J.getValue() != null) {
                    JTR.A1U(A1H, A1J);
                }
            }
            A0e.A9H("extra_data", A1H);
            A0e.AAJ(C66579MXk.A00(13), str);
            A0e.AAJ("error_message", str2);
            A0e.Cgf();
        }
    }

    public static final void A01(MXF mxf, Integer num) {
        0qQ.A0B(mxf, 0);
        A02(mxf, num, AnonymousClass7TE.A1E());
    }

    public static void A02(MXF mxf, Integer num, HashMap hashMap) {
        A00((C62661KkN) null, mxf, num, (String) null, (String) null, hashMap);
    }
}
